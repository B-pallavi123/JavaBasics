package com.compiletimePolymorphism;

public class Vehicle {
	
	
	
	public String details() {
		
		return "bike";
		
	}
	
	public void details(String name,String color) {
		
		System.out.println("the bike name is"+name);
		System.out.println("the color is"+color);
		}
	
	public void  details(int milage) {
		System.out.println("the bike milage is"+milage);
	}

	public static void main(String[] args) {
		Vehicle veh=new Vehicle();
		System.out.println("the vehicle details are as folows");
		System.out.println(veh.details());
		veh.details("royalEnfield","black");
		veh.details(60);
		
		
		// TODO Auto-generated method stub

	}

}
