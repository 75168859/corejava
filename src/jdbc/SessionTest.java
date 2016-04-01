package jdbc;

public class SessionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = new Session();
		System.out.println(session.getSql(new Account()));
		
		//Account account = new Account(3, "wangwu", 4000);
		//session.save(account);
		System.out.println(session.getSql(new User()));
	}

}
