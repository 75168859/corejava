package day01.simplefactory;

import java.util.Properties;

public class FruitFactory {
	private static Properties prop = new Properties();
	static{
		try {
			prop.load(FruitFactory.class.getResourceAsStream("/day01/simplefactory/fruit.properties"));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static Fruit getInstance(String name){
		if("apple".equals(name))
			return new Apple();
		else if("bananna".equals(name))
			return new Banana();
		else 
			throw new RuntimeException("²»´æÔÚ!");
	}
	
	public static Fruit getInstance(){
		try {
			return (Fruit)Class.forName(prop.getProperty("fruit")).newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} 
	}
}
