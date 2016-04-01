package day02.proxy;

public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UserServiceImpl us = new UserServiceImpl();
		ProxyFactoryBean pfb = new ProxyFactoryBean();
		pfb.setTarget(us);
		UserService usProxy =(UserService) pfb.getProxy();
		usProxy.delUser();
		usProxy.updateUser();
	}

}
