package day01.simplefactory;
//�����Ʒ
public class Banana implements Fruit{
	@Override
	public void grow() {
		System.out.println("banana grow...");
	}
	@Override
	public void plaint() {
		System.out.println("banana plaint...");
	}
	@Override
	public void harvest() {
		System.out.println("banana harvest...");
	}


}
