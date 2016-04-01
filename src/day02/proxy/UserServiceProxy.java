package day02.proxy;

public class UserServiceProxy implements UserService{
	private UserServiceImpl us ;
	public void setUs(UserServiceImpl us) {
		this.us = us;
	}
	@Override
	public void updateUser() {
		System.out.println("调用权限、事务、日志");
		us.updateUser();
		System.out.println("调用事务、日志");
	}

	@Override
	public void delUser() {
		System.out.println("调用权限、事务、日志");
		us.delUser();
		System.out.println("调用事务、日志");
	}



}
