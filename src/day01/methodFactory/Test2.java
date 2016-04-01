package day01.methodFactory;

public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//使用者会对具体的工厂产生依赖
		AppleFactory appleFactory = new AppleFactory();
		
		Fruit fruit = appleFactory.getInstance();
	}

}
