package com.xcs;

public class Passenger {
	private String name ;
	private int age;
	private char gender;
	
	public Passenger(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	Passenger(){
		super();
	}
	
	void display() {
		String gen = null;
		if(gender == 'm' || gender == 'M')
			gen = "MALE";
		else if (gender == 'f' || gender == 'F')
			gen = "FEMALE";
		
		System.out.println("name : "+name+"\nage : "+age+"\ngender : "+gen);
		System.out.println();
	}
	
}
