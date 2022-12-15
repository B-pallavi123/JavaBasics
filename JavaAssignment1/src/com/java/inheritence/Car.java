package com.java.inheritence;

public class Car extends Vehicle {

	public Car() {
		
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(int numberOfTyres, int mileage) {
		super(4, 20);
		// TODO Auto-generated constructor stub
	}
public static void main(String args[]) {
	Vehicle veh=new Car(4,20);
	Vehicle veh2=new Vehicle(4,20);
	System.out.println("i am a car"); 
	
}
	

}
