package day02;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		Iterator itor = v.iterator();
		while(itor.hasNext()){
			System.out.println(itor.next());
		}
		
		Enumeration  e = v.elements();
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}

	}

}
class Adapter1 implements Enumeration{
	private Iterator itor;
	
	@Override
	public boolean hasMoreElements() {
		// TODO Auto-generated method stub
		return itor.hasNext();
	}

	@Override
	public Object nextElement() {
		// TODO Auto-generated method stub
		return itor.next();
	}
	
}
