package day02.proxy;

public class UserServiceFactory {
	public static UserService  getInstance(){
		UserServiceImpl us = new UserServiceImpl();
		UserServiceProxy usProxy = new UserServiceProxy();
		usProxy.setUs(us);
		
		return usProxy;//return usProxy
	}
}
