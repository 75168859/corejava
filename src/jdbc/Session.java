package jdbc;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Session {
	public int save(Object obj){
		Connection con = null;
		PreparedStatement pstmt = null;
		int n = 0;
		try {
			con = JdbcUtil.getConn();
			pstmt = getStatement(con, obj);
			n = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n;
	}
	public PreparedStatement getStatement(Connection con,Object obj)throws Exception{
		PreparedStatement pstmt = con.prepareStatement(getSql(obj));
		Class c = obj.getClass();
		Field[] fs = c.getDeclaredFields();
		for(int i = 0; i < fs.length;i++){
			fs[i].setAccessible(true);
			//成员变量的反射
			pstmt.setObject(i+1, fs[i].get(obj));
		}
		return pstmt;
	}
	//表名就是类名，属性名就是列名
	public String getSql(Object obj){
		StringBuffer s = new StringBuffer();
		s.append("insert into ");
		//Class c1 = X.class x.getClass()  Class.forName("");
		Class c = obj.getClass();
		String tablename = c.getSimpleName();
		Entity entity = (Entity)c.getAnnotation(Entity.class);
		if(entity!=null)
			tablename = entity.tablename();
		s.append(tablename);
		s.append("(");
		Field[] fs = c.getDeclaredFields();
		for(int i = 0 ; i < fs.length;i++){
			s = i == 0 ? s.append(fs[i].getName()) : s.append(",").append(fs[i].getName());
		}
		s.append(") values").append(getString(fs.length));
		return s.toString();
		
	}
	private String getString(int length){
		StringBuffer s = new StringBuffer();
		s.append("(");
		for(int i = 0 ; i < length;i++){
			s = i == 0 ? s.append("?") : s.append(",?");
			
		}
		return s.append(")").toString();
	}
}
class X{
	
}
