package day03.observer;
//�����Ŀ�����
public class Target extends Observable{
	private int age = 10;
	public void setAge(int age) {
		if(this.age!=age)
			notifyObses();
		this.age = age;
		
	}
}
