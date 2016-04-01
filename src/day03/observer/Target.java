package day03.observer;
//具体的目标对象
public class Target extends Observable{
	private int age = 10;
	public void setAge(int age) {
		if(this.age!=age)
			notifyObses();
		this.age = age;
		
	}
}
