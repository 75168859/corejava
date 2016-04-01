package day02.proxy;

public class UserServiceProxy implements UserService{
	private UserServiceImpl us ;
	public void setUs(UserServiceImpl us) {
		this.us = us;
	}
	@Override
	public void updateUser() {
		System.out.println("����Ȩ�ޡ�������־");
		us.updateUser();
		System.out.println("����������־");
	}

	@Override
	public void delUser() {
		System.out.println("����Ȩ�ޡ�������־");
		us.delUser();
		System.out.println("����������־");
	}



}
