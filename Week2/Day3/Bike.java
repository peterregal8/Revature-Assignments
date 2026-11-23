package com.vehicalrental;


// Bike inherits methods and data from Vehicle
public class Bike extends Vehicle {
	
	public Bike(String vehicleNumber, String model, int ratePerDay, int days) {
		super(vehicleNumber, model, ratePerDay, days);
	}

	@Override
	public double calculateRent() {
		// TODO Auto-generated method stub
		return(getRatePerDay() * getDays()) * 0.9;
	}

	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("Bike | " + getVehicleNumber() + " | " + getModel() + " | Days: " + getDays() + " | Rent: " + calculateRent());
	}
	
	
}

