package day02.flyweight;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n1 = 1;
		Integer n2 = 1;
		System.out.println(n1==n2);
		
		Integer n3 = 128;
		Integer n4 = 128;
		System.out.println(n3==n4);
		
		Integer n5 = new Integer(1);
		Integer n6 = new Integer(1);
		System.out.println(n5==n6);

		
		
		String s1 = "hello";
		String s2 = "hello";
		System.out.println(s1==s2);
		
		String s3 = "hello"+"world";
		String s4 = "helloworld";
		System.out.println(s3==s4);
		String s5 = s1 +"world";//new StringBuilder(s1).append("world").toString()
		System.out.println(s4==s5);
		
		
		String s6 = new String("123455666");
		s6 = s6.substring(2);
	}

}
