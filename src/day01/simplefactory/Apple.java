package day01.simplefactory;
//具体产品
public class Apple implements Fruit{
	@Override
	public void grow() {
		System.out.println("apple grow...");
	}
	@Override
	public void plaint() {
		System.out.println("apple plaint...");
	}
	@Override
	public void harvest() {
		System.out.println("apple harvest...");
	}


}
