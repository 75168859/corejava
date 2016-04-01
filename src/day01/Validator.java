package day01;

public class Validator {
	private Encrty encrty;
	private KeepStore keepStore;
	public void setEncrty(Encrty encrty) {
		this.encrty = encrty;
	}
	public void setKeepStore(KeepStore keepStore) {
		this.keepStore = keepStore;
	}
	public Validator() {
		// TODO Auto-generated constructor stub
	}
	public Validator(Encrty encrty, KeepStore keepStore) {
		super();
		this.encrty = encrty;
		this.keepStore = keepStore;
	}
	public void save(String username,String password){
		String newPass = encrty.encrty(password);
		keepStore.store(username, newPass);
	}
	public boolean validate(String username,String password){
		String newPass = encrty.encrty(password);
		return newPass.equals(encrty.encrty(password));
	}
	
}
