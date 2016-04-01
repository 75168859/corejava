package day03.observer;
//具体的观察者
public class Obs2 implements Observer{

	@Override
	public void update() {
		System.out.println("观察者2做事");
	}
}
