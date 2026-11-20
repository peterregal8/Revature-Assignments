package com.day1;

public class TestWrapper {

	 public static void main(String[] args) {
		// wrapping a primitive value into corresponding wrapper class
		Integer age = 20;
		Double price = 5.00;
		Character grade = 'A';
		Boolean active = true;
		System.out.println(age);
		System.out.println(price);
		System.out.println(grade);
		System.out.println(active);
		
		
		// Autoboxing (converting from primitive to wrapper)
		int x = 210;
		Integer y = x;
		System.out.println(y);
		
		
		// Unboxing (converting from wrapper to primitive)
		int z = 2;
		age.intValue();
		
		double p = price.doubleValue();
		System.out.println(p);
		
		String num = "200";
		int amount = Integer.parseInt(num);
		System.out.println(amount);
		
	}

}
