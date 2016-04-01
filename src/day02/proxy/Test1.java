package day02.proxy;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		UserService us = UserServiceFactory.getInstance();
		us.delUser();
	}

}
