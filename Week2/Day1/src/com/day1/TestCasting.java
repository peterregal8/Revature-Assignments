package com.day1;

public class TestCasting {

	public static void main(String[] args) {
		int num = 200;
		double d = num; // implicit casting
		System.out.println("Widening cast conversion from int to double " + d);
		
		double value = 9.87;
		int rounded = (int) value; // explicit/narrow casting
		System.out.println("Double to int conversion: " + rounded);
		
		char ch = 'A';
		int ascii = ch; // implicit casting
		System.out.println("Char to int conversion: " + ascii);
	}
}
