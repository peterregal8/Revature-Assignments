package com.day1;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = "Hello"; // using literal
		String s2 = "Java"; // creates an object reference in pool
		String s3 = new String("Hello"); // creating a String using 'new' operator
		String s4 = "Hello";
		System.out.println(s1==s4);
		System.out.println(s1==s3); // comparing the reference
		System.out.println(s1.equals(s3)); // comparing the content
		
		String name = "Alice";
		String newname = name.concat("Max");
		System.out.println(newname);
		System.out.println(name);
		
		int nameLength = name.length();
		System.out.println("length of string: " + nameLength);
		
		System.out.println("length of string: " + name.length());
		
		System.out.println("index of l: " + name.indexOf('l'));
		
		System.out.println("index of Max: " + newname.indexOf("Max"));
		
		String capName = "ALICE";
		System.out.println(name.equals(capName));
		
		System.out.println(name.equalsIgnoreCase(capName));
		
		System.out.println(capName.toLowerCase());
		
		System.out.println(name.toUpperCase().equals(capName));
		
		String words = "Java,Python,C++,Java";
		
		System.out.println(words.replace("Java", "SQL"));
		
		System.out.println(words);

		
		String[] parts = words.split(",");
		for (String part : parts) {
			System.out.println(part);
		}
		
		
		StringBuffer bf = new StringBuffer("Hello");
		bf.append(" Java!");
		System.out.println(bf);
		
		String s5 = new String("Hello");
		s5.concat(" Java!");
		System.out.println(s5);
		
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(" Java!");
		System.out.println(sb);
		
		
		String s6 = "  Hello\t  ";
		System.out.println(s6);
		
		
		String s7 = s6.trim();
		System.out.println(s7);
		
	}

}