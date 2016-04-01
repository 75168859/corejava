package jdbc;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(new int[]{}));
		System.out.println(add(new int[]{1,2}));
		System.out.println(add(new int[]{1,2,3}));
	    System.out.println(add());
	    System.out.println(add(1));
	    System.out.println(add(1,2));
	    System.out.println(add(1,2,3));
	}
	public static int add(int... a){
		int sum = 0;
		for(int i = 0; i < a.length;i++){
			sum += a[i];
		}
		return sum;
	}

}
