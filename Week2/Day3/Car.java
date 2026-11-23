package com.vehicalrental;


// Car inherits methods and data from Vehicle
public class Car extends Vehicle {
	
	private int insuranceCharge;
	
	public Car(String vehicleNumber, String model, int ratePerDay, int days, int insuranceCharge) {
		super(vehicleNumber, model, ratePerDay, days);
		this.insuranceCharge = insuranceCharge;
	}

	@Override
	public double calculateRent() {
		// TODO Auto-generated method stub
		return(getRatePerDay() + insuranceCharge) * getDays();
	}

	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("Car | " + getVehicleNumber() + " | " + getModel() + " | Days: " + getDays() + " | Rent: " + calculateRent());
	}
	
	
}
