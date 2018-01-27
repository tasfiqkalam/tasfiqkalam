package com.usa.classpratic;

public class OVERLOADING {
	//why java need polymorsim- is to reuse the code again and again
	public void getfire(){
		System.out.println();
	}
	public void getfire( int a){
	System.out.println();	
	}
	public void getfire(String a){//change data type of parameters
		System.out.println();
}
}
//how to change parameters:
//1.number of parameters.
//2.change data type of parameters
//3.change the position of parameters with dif data type (int a, double b) (doubleb, int a)