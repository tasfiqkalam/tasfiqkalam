package com.usa.classpratic;

public class Animal {
//VOID
//STATIC
//NON STATIC
	public void salary () {
		System.out.println("HELLO WORLD");
	}
	
	public static void income () {
		System.out.println("HELLO ALL");
	}
	public static int getsalary(){
		System.out.println("HI");
		return 0;
	}
public static void main(String[] args) {
	Animal obj = new Animal(); //create object
	obj.salary();
	Animal.getsalary();
	Animal.income();
} 
}


