package com.runtimePolymorphism;

public class Orange implements Fruit1{

	@Override
	public void taste() {
		// TODO Auto-generated method stub
		System.out.println("i am sour");
		
	}
	
	public static void main(String[] args) {
		Orange org =new Orange();
		org.taste();
		
	}

}
