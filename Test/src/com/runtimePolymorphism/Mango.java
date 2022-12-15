package com.runtimePolymorphism;

public class Mango implements Fruit1 {

	@Override
	public void taste() {
		// TODO Auto-generated method stub
		System.out.println("i am sweet");
		
	}
	
	public static void main(String[] args) {
		
		Mango man=new Mango();
		man.taste();
		
		
		
		
	}
	

}
