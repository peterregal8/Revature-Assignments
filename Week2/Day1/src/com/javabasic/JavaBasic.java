package com.javabasic;

import java.util.Arrays;

public class JavaBasic {
	
	public static int reverseNumber(int input) {
		int reversed = 0;
		
		while (input != 0) {
			int digit = input % 10;
			input /= 10;
			
			// checking for integer overflow
			if (reversed > Integer.MAX_VALUE / 10 || reversed == Integer.MAX_VALUE / 10 && digit > 7) {
				return 0;
			}
			
			// checking for integer underflow
			if (reversed < Integer.MIN_VALUE / 10 || reversed == Integer.MIN_VALUE / 10 && digit > 8) {
				return 0;
			}
			
			reversed = reversed * 10 + digit;
		}
		
		return reversed;
		
	}
	
	public static void countVowelsConsonants(String s) {
		s = s.trim().toLowerCase();
		int numVowels = 0;
		int numConsonants = 0;
		for (char c : s.toCharArray()) {
			if (c >= 'a' && c <= 'z') {
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					numVowels++;
				}
				else {
					numConsonants++;
				}
			}
		}
		System.out.println("Vowels: " + numVowels);
		System.out.println("Consonants: " + numConsonants);
	}
	
	public static String checkAnagrams(String s1, String s2) {
		s1 = s1.trim().toLowerCase().replace(" ", "");
		s2 = s2.trim().toLowerCase().replace(" ", "");
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if (Arrays.equals(c1, c2)) {
			return "Anagram";
		}
		return "Not Anagram";
	}
	
	
	
	public static void swapArithmetic(int a, int b) {
		if ((b > 0 && a > Integer.MAX_VALUE - b) ||
			(b < 0 && a < Integer.MIN_VALUE - b)) {
			System.out.println("Integer overflow");
		}
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	
	public static void swapXOR(int a, int b) {
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	
	public static void modifyArray(int[] arr) {
		arr = Arrays.copyOf(arr, arr.length);
		arr[0] = 100;
	}
	
	
	
	public static void removeDuplicates(String s) {
		StringBuilder sb = new StringBuilder();
		for (char c : s.toCharArray()) {
			if (sb.indexOf(String.valueOf(c)) == -1) {
				sb.append(c);
			}
		}
		System.out.println(sb);
	}
	
	
	
	
	public static void findFirstNonRepeatedChar(String s) {
		int[] frequencies = new int[256];
		for (char c : s.toCharArray()) {
			frequencies[c] += 1;
		}
		for (char c : s.toCharArray()) {
			if (frequencies[c] == 1) {
				System.out.println(c);
				return;
			}
		}
		System.out.println("No non-repeated character");
	}
	
	
	
	public static int longestSubstringNoRepeats(String s) {
		int maxLength = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			while (sb.indexOf(String.valueOf(s.charAt(i))) != -1) {
				sb.deleteCharAt(0);
			}
			sb.append(s.charAt(i));
			maxLength = Math.max(maxLength, sb.length());
		}
		return maxLength;
		
	}
	
	
	public static String compress(String s) {
		if (s.length() > 0) {
			StringBuilder sb = new StringBuilder();
			int i = 0;
			while (i < s.length()) {
				char c = s.charAt(i);
				sb.append(c);
				int count = 1;
				i++;
				while (i < s.length() && s.charAt(i) == c) {
					count++;
					i++;
				}
				sb.append(count);
			}
			return sb.toString();
		}
		return "Must have at least one character";
		
	}
	
	
	
	public static String reverseWords(String s) {
		StringBuilder sb = new StringBuilder();
		int end = s.length() - 1;
		while (end >= 0) {
			while (end >= 0 && s.charAt(end) == ' ') {
				end--;
			}
			if (end < 0) {
				break;
			}
			
			int start = end;
			while (start >= 0 && s.charAt(start) != ' ') {
				start--;
			}
			
			if (sb.length() > 0) {
				sb.append(' ');
			}
			
			sb.append(s, start + 1, end + 1);
			end = start - 1;
		}
		return sb.toString();
	}

	public static void main(String[] args) throws InterruptedException {
		
		// Q1
		System.out.println("Q1");
		System.out.println(reverseNumber(12345));
		System.out.println(reverseNumber(Integer.MAX_VALUE));
		System.out.println(reverseNumber(1763847412));
		System.out.println(reverseNumber(20));
		System.out.println(reverseNumber(-1224143119));
		
		
		// Q2
		System.out.println("\nQ2");
		int a = 10;
		double b = 3.5;
		
		int result = (int) (a + b); // explicit casting
		
		System.out.println(result);
		
		char ch = 'A';
		int value = ch + 5;
		double val = value; // implicit casting
		
		System.out.println(value);
		System.out.println((char) value);
		System.out.println(val);
		
		
		// Q3
		System.out.println("\nQ3");
		countVowelsConsonants("     Programming###\n");
		
		
		// Q4
		System.out.println("\nQ4");
		String age = "25";
		String salary = "45000.75";
		String active = "true";
		
		Integer ageInt = 0;
		Double salaryDouble = 0.0;
		try {
			ageInt = Integer.valueOf(age);
		} catch (NumberFormatException e) {
			System.out.println("Cannot parse Integer");
		}
		
		try {
			salaryDouble = Double.valueOf(salary);
		} catch (NumberFormatException e) {
			System.out.println("Cannot parse Double");
		}
		Boolean activeBool = Boolean.valueOf(active);
		
		System.out.println("Salary after 10% increment: " + salaryDouble * 1.1);
		System.out.println("age - value: " + age + ", type: " + age.getClass().getSimpleName());
		System.out.println("salary - value: " + salary + ", type: " + salary.getClass().getSimpleName());
		System.out.println("active - value: " + active + ", type: " + active.getClass().getSimpleName());
		System.out.println("ageInt - value: " + ageInt + ", type: " + ageInt.getClass().getSimpleName());
		System.out.println("salaryDouble - value: " + salaryDouble + ", type: " + salaryDouble.getClass().getSimpleName());
		System.out.println("activeBool - value: " + activeBool + ", type: " + activeBool.getClass().getSimpleName());
		
		// Q5
		System.out.println("\nQ5");
		System.out.println(checkAnagrams("listen", "silent   "));
		System.out.println(checkAnagrams("race car", "carrace"));
		System.out.println(checkAnagrams("racecar", "carrace"));
		
		
		// Q6
		System.out.println("\nQ6");
		int c = 10;
		int d = 20;
		swapArithmetic(c, d);
		
		swapXOR(c, d);
		
		
		// Q7
		System.out.println("\nQ7");
		int[] numbers = {10, 20, 30};
		modifyArray(numbers);
		System.out.println(numbers[0]);
		
		
		// Q8
		System.out.println("\nQ8");
		removeDuplicates("programming");
		
		
		// Q9
		System.out.println("\nQ9");
		findFirstNonRepeatedChar("swiss");
		findFirstNonRepeatedChar("aabbcc");
		
		
		// Q11
		System.out.println("\nQ11");
		System.out.println(longestSubstringNoRepeats("abcabcbb"));
		System.out.println(longestSubstringNoRepeats("pwwkew"));
		System.out.println(longestSubstringNoRepeats(""));
		
		
		// Q12
		System.out.println("\nQ12");
		System.out.println(compress("aaabbccccd"));
		System.out.println(compress("abc"));
		System.out.println(compress(""));
		System.out.println(compress("A"));
		
		
		// Q13
		System.out.println("\nQ13");
		System.out.println(reverseWords("   Java is easy   to learn "));
		
		// Q14
		System.out.println("\nQ14");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 1000; i++) {
			sb.append("a");
		}
		
		StringBuffer bf = new StringBuffer();
		for (int i = 0; i < 1000; i++) {
			bf.append("a");
		}
		
		System.out.println(sb);
		System.out.println(bf);
		
		StringBuffer bf2 = new StringBuffer();
		
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 50000; i++) {
				bf2.append("A");
			}
		});
		
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 50000; i++) {
				bf2.append("B");
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		// length always 100000
		System.out.println("StringBuffer length: " + bf2.length());
		
		
		StringBuilder sb2 = new StringBuilder();
		Thread t3 = new Thread(() -> {
			for (int i = 0; i < 50000; i++) {
				sb2.append("A");
			}
		});
		
		Thread t4 = new Thread(() -> {
			for (int i = 0; i < 50000; i++) {
				sb2.append("B");
			}
		});
		
		t3.start();
		t4.start();
		
		t3.join();
		t4.join();
		
		
		// length fluctuates
		System.out.println("StringBuilder length: " + sb2.length());
		
		
		
		
		// Q15
		System.out.println("\nQ15");
		class Employee {
			private int id;
			private String name;
			private double basicSalary;
			private double bonusPercentage;
			private boolean status;
			
			public Employee(int id, String name, String basicSalary, 
					String bonusPercentage, boolean status) {
				this.id = id;
				this.name = name;
				try {
					this.basicSalary = Double.valueOf(basicSalary);
				} catch (NumberFormatException e) {
					System.out.println("Invalid salary; using default");
					this.basicSalary = 50000.0;
				}
				try {
					this.bonusPercentage = Double.valueOf(bonusPercentage);
				} catch (NumberFormatException e) {
					System.out.println("Invalid bonus; using default");
					this.bonusPercentage = 10;
				}
				status = true;
			}
			
			public double calculateBonus() {
				return basicSalary * (bonusPercentage / 100);
			}
			
			public double calculateFinalSalary() {
				return basicSalary + calculateBonus();
			}
			
			public boolean isHighEarner() {
				return calculateFinalSalary() > 75000;
			}
			
			// doesn't modify the object reference, creates a new String
			public String uppercaseName() {
				return name.toUpperCase();
			}
			
			// modifies the instance variable directly
			public void reverseName() {
				StringBuilder sb = new StringBuilder(name);
				name = sb.reverse().toString();
			}
			
			
		}
		
		Employee rahul = new Employee(101, "Rahul", "60000,", "20", true);
		System.out.println(rahul.uppercaseName());
		System.out.println(rahul.name);
		System.out.println(rahul.calculateBonus());
		System.out.println(rahul.calculateFinalSalary());
		rahul.reverseName();
		System.out.println(rahul.name);
 
	}
}
