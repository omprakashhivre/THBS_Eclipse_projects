package pack11;

public class User {
	private String username;
	private String password;
	
	public User() {
		System.out.println("default constructor called");
	}
	
	public User(String name,String pass) {
		this.username = name;
		this.password = pass;
	}
	
	void display() {
		System.out.println("username : "+username+"\npassword : "+password);
	}
}
