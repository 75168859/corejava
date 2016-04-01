package day01.single;

import java.lang.reflect.Constructor;

public class Test1 {
	public static void main(String[] args) {
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();
		System.out.println(s1==s2);
		
		try {
			Class c = Single.class;
			Constructor<Single> ct = c.getDeclaredConstructor();
			ct.setAccessible(true);
			Single s3 = ct.newInstance();
			System.out.println(s3==s2);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
