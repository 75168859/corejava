package day01.methodFactory;

public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//ʹ���߻�Ծ���Ĺ�����������
		AppleFactory appleFactory = new AppleFactory();
		
		Fruit fruit = appleFactory.getInstance();
	}

}
