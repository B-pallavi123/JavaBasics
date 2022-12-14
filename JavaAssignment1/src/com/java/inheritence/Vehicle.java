package com.java.inheritence;

public class Vehicle {

	private int numberOfTyres;
	private int mileage;

	Vehicle() {
		System.out.println("i am a vehicle");

	}

	Vehicle(int numberOfTyres, int mileage) {
		this.numberOfTyres = numberOfTyres;
		this.mileage = mileage;
System.out.println(numberOfTyres);
System.out.println(mileage);
	}

}
