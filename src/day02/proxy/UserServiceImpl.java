package day02.proxy;

public class UserServiceImpl implements UserService{

	@Override
	public void updateUser() {
		
		System.out.println("update..user");
		
	}

	@Override
	public void delUser() {
		
		System.out.println("delete..user");
	}
}
