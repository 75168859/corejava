package day02.flyweight;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class T {
	public static void main(String[] args) {
		final Output output = new Output();
		final Output output1 = new Output();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true){
					output.print("helloworld");
				}
			}
		}).start();
	   new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true){
					output.print("BYE-BYE");
				}
			}
		}).start();
	}
}
class Output{
	private Lock lock = new ReentrantLock();
	public  void print(String name){
		   lock.lock();
		   try{
				for(int i = 0; i < name.length();i++){
					System.out.print(name.charAt(i));
				}
				System.out.println();	
		   }finally{
			   lock.unlock();
		   }
		
		
	}
	
}
