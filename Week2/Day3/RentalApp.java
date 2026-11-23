package com.vehicalrental;

import java.util.Scanner;

public class RentalApp {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter number of vehicles: ");
		int numVehicles = sc.nextInt();
		sc.nextLine();
		
		Vehicle[] vehicles = new Vehicle[numVehicles];
		
		for (int i = 0; i < numVehicles; i++) {
			int type = 0;
			while (type != 1 && type != 2) {
				System.out.println("Enter type (1-Car, 2-Bike): ");
				type = sc.nextInt();
				if (!(type == 1 || type == 2)) {
					System.out.println("Invalid type, try again");
				}
			}
			sc.nextLine();
			
			System.out.println("Enter Vehicle Number: ");
			String vehicleNumber = sc.nextLine();
			
			
			System.out.println("Enter Model: ");
			String vehicleModel = sc.nextLine();
			
			System.out.println("Enter Rate Per Day: ");
			int rate = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Days: ");
			int days = sc.nextInt();
			sc.nextLine();
			
			Vehicle v;
			
			
			// Polymorphism used here to assign the correct type of vehicle
			if (type == 1) {
				System.out.println("Enter Insurance per Day: ");
				int insurance = sc.nextInt();
				sc.nextLine();
				v = new Car(vehicleNumber, vehicleModel, rate, days, insurance);
			} else {
				v = new Bike(vehicleNumber, vehicleModel, rate, days);
			}
			
			vehicles[i] = v;
		}
		
		System.out.println("--- Rental Details --- ");
		
		double totalRent = 0;
		for (Vehicle v : vehicles) {
			// Polymorphism used to call the correct displayDetails method for each vehicle
			totalRent += v.calculateRent();
			v.displayDetails();
		}
		
		System.out.println("Total Rent Collected: " + totalRent);
		
		sc.close();
	}
}
