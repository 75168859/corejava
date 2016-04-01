package day03.observer;

public class Test1 {
	public static void main(String[] args) {
		Target target = new Target();
		Obs1 s1 = new Obs1();
		Obs2 s2 = new Obs2();
		target.addObserver(s1);
		target.addObserver(s2);
		target.setAge(30);
	}

}
