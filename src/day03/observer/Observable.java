package day03.observer;

import java.util.Vector;
//目标的抽象
public class Observable {
	private Vector<Observer> obses = new Vector<Observer>();
	public void addObserver(Observer obs){
		obses.add(obs);
	}
	public void removeObserver(Observer obs){
		obses.remove(obs);
	}
	public void notifyObses(){
		for(Observer observer : obses){
			observer.update();
		}
	}
}
