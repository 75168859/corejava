package day01.prototype;

public class Test1 {
	public static void main(String[] args) {
		User u = new User();
		
		Address address = new Address();
		u.setAddress(address);
		User u1 = null;
		try {
			u1 = (User)u.deepClone();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(u==u1);
		System.out.println(u.getAddress()==u1.getAddress());
	}

}
