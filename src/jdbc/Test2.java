package jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Account account = new Account(2,"lis",3000);
//		DaoSupport<Account> ds = new DaoSupport<Account>();
		//ds.saveOrDelOrUpdate("insert into account(id,name,account)values(?,?,?)",account.getId(),account.getName(),account.getAccount());
 	   // Account account1 = ds.findById(1, "select * from account where id=?", new AccountRowMapper());
 	   // System.out.println(account1);
//		List<Account> lists = ds.find("select * from account where account > ?", new AccountRowMapper(),1000);
//		for (Account account2 : lists) {
//			System.out.println(account2);
//		}
		
		AccountService as = new AccountServiceImpl();
		//as.change(2, 100, 500);
		ProxyFactoryBean pfb = new ProxyFactoryBean();
		pfb.setTarget(as);
		AccountService asProxy =(AccountService) pfb.getProxy();
	    asProxy.change(2, 3000, 500);
	}

}
class AccountRowMapper implements RowMapper<Account>{

	@Override
	public Account getRow(ResultSet rs)throws SQLException {
		// TODO Auto-generated method stub
		Account account = new Account();
		account.setId(rs.getInt("id"));
		account.setName(rs.getString("name"));
		account.setAccount(rs.getInt("account"));
		return account;
	}
	
}
