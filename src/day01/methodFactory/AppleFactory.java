package day01.methodFactory;

public class AppleFactory extends FruitFactory {

	@Override
	public Fruit getInstance() {
		// TODO Auto-generated method stub
		return new Apple();
	}


}
