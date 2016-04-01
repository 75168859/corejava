package day01;

import java.util.Properties;

public class ValidatorFactory {
	private static Properties prop = new Properties();
	static{
		try {
			prop.load(ValidatorFactory.class.getResourceAsStream("/day01/va.properties"));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static Validator getInstance(){
		Validator validator = new Validator();
		Encrty encrty = getEncrty();
		KeepStore keepStore = getStore();
		validator.setEncrty(encrty);
		validator.setKeepStore(keepStore);
		return validator;
	}
	public static Encrty getEncrty(){
		try {
			return (Encrty)Class.forName(prop.getProperty("encrty")).newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	public static KeepStore getStore(){
		try {
			return (KeepStore)Class.forName(prop.getProperty("store")).newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
