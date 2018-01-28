package com.usa.classpratic;

public class TestEncapsulationchild extends TestEncapsulatioParent {
	//parent=common properties
//variable must be private
//all the method will be public
//2 kind of methods: 1>getter-to get something
	                   //2>setter-to set some value
	
	public static void main(String[] args) {
		TestEncapsulationchild obj= new TestEncapsulationchild();
	obj.getSalary();
	obj.setSalary(20000);
	System.out.println(obj.getSalary());
	obj.getName();
	obj.setName("John");
	System.out.println(obj.getName());
}
}