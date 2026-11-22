package com.methodlab;

public class MethodLab {
	
	
	public static void printProfile(String name, int age, double height, boolean student, char grade) {
		System.out.println("Name: " + name +
						   "\nAge: " + age +
						   "\nHeight: " + height + 
						   "\nStudent: " + student + 
						   "\nGrade: " + grade);
	}
	
	
	public static double average(int a, int b, int c) {
		return (a + b + c) / 3.0;
	}
	
	
	
	public static boolean fitsInByte(int value) {
		return -128 <= value && value <= 127;
	}
	
	
	public static int addTexts(String a, String b) {
		return Integer.parseInt(a) + Integer.parseInt(b);
	}
	
	
	public static Integer boxTwice(int x) {
		Integer boxedX = x;
		return Integer.valueOf(boxedX * 2);
	}
	
	
	public static void describe(Integer n) {
		System.out.println("Binary: " + Integer.toBinaryString(n) + 
						   "\nMax: " + Integer.MAX_VALUE +
						   "\nCompare with 10.5: " + Double.compare(n, 10.5));
	}
	
	
	
	public static boolean sameValue(Integer a, Integer b) {
		return a.equals(b);
	}
	
	
	public static int truncate(double d) {
		return (int) d;
	}
	
	
	
	public static double widen(int i) {
		return i;
	}
	
	
	
	public static void overflowDemo() {
		int big = 130;
		byte b = (byte) big;
		System.out.println(b);
	}
	
	
	public static char shiftLetter(char c, int by) {
		return (char) (c + by);
	}
	
	
	public static void describeValue(int n) {
		System.out.println("int: " + n);
	}
	
	
	public static void describeValue(double d) {
		System.out.println("double: " + d);
	}
	
	
	public static void describeValue(String s) {
		System.out.println("String: " + s);
	}
	
	
	public static void tryChange(int n) {
		n = 99;
	}
	
	
	public static void appendBang(StringBuilder sb) {
		sb.append("!");
	}
	
	
	public static void replaceBuilder(StringBuilder sb) {
		// The parameter holds a copy of the reference.
		// Pointing the copy at a new object does not move the caller's variable.
		sb = new StringBuilder("New");
	}
	
	
	public static void shout(String s) {
		s = s.toUpperCase();
	}
	
	
	public static void compareRefs() {
		String s1 = "java";
		String s2 = "java";
		String s3 = new String("java");
		// True because both literals share one pooled object
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
	}
	
	
	public static int safeLength(String s) {
		return s == null ? -1 : s.length();
	}
	
	
	public static String initials(String first, String last) {
		String f = first.toUpperCase().substring(0, 1);
		String l = last.toUpperCase().substring(0, 1);
		return new String(f + l);
	}
	
	
	public static String clean(String raw) {
		return raw.trim().toLowerCase();
	}
	
	
	public static boolean isPalindromeWord(String w) {
		String reverse = new StringBuilder(w).reverse().toString();
		return w.equalsIgnoreCase(reverse);
	}
	
	
	public static String maskEmail(String email) {
		StringBuilder sb = new StringBuilder();
		sb.append(email.charAt(0));
		int cut = email.indexOf('@');
		int i = 1;
		while (i < cut) {
			sb.append("*");
			i++;
		}
		while (i < email.length()) {
			sb.append(email.charAt(i));
			i++;
		}
		return sb.toString();
	}
	
	
	public static String buildCsv(String a, String b, String c) {
		StringBuilder sb = new StringBuilder();
		sb.append(a + "," + b + "," + c);
		return sb.toString();
	}
	
	
	public static String edit(String text) {
		StringBuilder sb = new StringBuilder(text);
		sb.insert(0, "[");
		sb.append("]");
		sb.replace(7, 12, "Java");
		sb.deleteCharAt(6);
		return sb.toString();
	}
	
	
	public static long timeJoin(boolean useBuilder) {
		StringBuilder sb = new StringBuilder();
		String s = "";
		long start = System.nanoTime();
		if (useBuilder) {
			for (int i = 0; i < 20000; i++) {
				sb.append("x");
			}
		} else {
			for (int i = 0; i < 20000; i++) {
				s = s + "x";
			}
		}
		long stop = System.nanoTime();
		return (stop - start);
	}
	
	
	public static String safeAppend(StringBuffer sb, String part) {
		sb.append(part);
		return sb.toString();
	}
	
	
	
	public static String formatReceipt(String customer, int quantity, double unitPrice) {
		int total = (int) (quantity * unitPrice);
		StringBuilder sb = new StringBuilder();
		sb.append("Customer: " + customer.toUpperCase());
		sb.append("\nQty: " + quantity + " | Price: " + unitPrice);
		sb.append("\nTotal: " + quantity * unitPrice + " (whole: " + total + ")");
		return sb.toString();
	}
	
	
	public static double toFahrenheit(double celcius) {
		return celcius * 9 / 5 + 32;
	}
	
	
	public static int percent(int obtained, int total) {
		double percent = (double) obtained / total * 100;
		return (int) percent;
	}
	
	
	public static String describeInt(int n) {
		return n + " -> binary " + Integer.toBinaryString(n) + ", hex " 
			+ Integer.toHexString(n) + ", octal " + Integer.toOctalString(n);
	}
	
	
	public static void swap(int a, int b) {
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("inside: a=" + a + " b=" + b);
	}
	
	
	public static void addTitle(StringBuilder name) {
		name.insert(0, "Dr. ");
	}
	
	
	public static String addTitleToString(String name) {
		return "Dr. " + name;
	}
	
	
	public static int countChar(String s, char c) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}
	
	
	public static String capitalize(String word) {
		StringBuilder sb = new StringBuilder();
		sb.append(Character.toUpperCase(word.charAt(0)));
		sb.append(word.substring(1).toLowerCase());
		return sb.toString();
	}
	
	
	public static String padLeft(String s, int width, char fill) {
		StringBuilder sb = new StringBuilder(s);
		if (s.length() < width) {
			for (int i = 0; i < width - s.length(); i++) {
				sb.insert(0, fill);
			}
		}
		return sb.toString();
	}
	
	
	public static String joinWithDash(String s, int times) {
		StringBuilder sb = new StringBuilder();
		int i = 0;
		while (i < times - 1) {
			sb.append(s);
			sb.append("-");
			i++;
		}
		sb.append(s);
		return sb.toString();
	}
	
	
	public static int roundHalfUp(double d) {
		return (int) (d + 0.5);
	}
	
	
	public static int factorialInt(int n) {
		int num = 1;
		for (int i = 1; i <= n; i++) {
			num *= i;
		}
		return num;
	}
	
	
	public static long factorialLong(int n) {
		long num = 1;
		for (int i = 1; i <= n; i++) {
			num *= i;
		}
		return num;
	}
	
	
	public static int countVowels(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if ("aeiou".indexOf(s.charAt(i)) != -1) {
				count++;
			}
		}
		return count;
	}
	
	
	public static String summarize(String text) {
		StringBuilder sb = new StringBuilder();
		sb.append("Length: " + text.length());
		sb.append(" | Upper: " + text.toUpperCase());
		sb.append(" | Vowels: " + countVowels(text));
		return sb.toString();
	}

	public static void main(String[] args) {
		printProfile("Asha", 21, 5.6, true, 'A');
		printProfile("Ravi", 30, 5.9, false, 'B');
		
		System.out.println("\n" + average(1, 2, 2));
		
		System.out.println("\n" + fitsInByte(127));
		System.out.println(fitsInByte(128));
		System.out.println(fitsInByte(-129));
		
		System.out.println("\n" + addTexts("12", "30"));
		
		int r = boxTwice(21);
		System.out.println("\n" + r);
		
		System.out.println("");
		describe(10);
		
		
		Integer a = 127;
		Integer b = 127;
		Integer c = 1000;
		Integer d = 1000;
		// Integer caches -128 to 127, so == compares the same object for 127
		// but two different objects for 1000. Use equals for wrapper values.
		System.out.println("\n127: equals=" + sameValue(a, b) + " ==" + (a==b));
		System.out.println("1000: equals=" + sameValue(c, d) + " ==" + (c==d));
		
		
		System.out.println("\n" + truncate(9.99));
		System.out.println(truncate(-9.99));
		
		System.out.println("\n" + widen(7));
		
		System.out.println("");
		// 130 is 2 more than the byte maximum of 127, so it wraps:
		// 130 - 256 = -126
		overflowDemo();
		
		
		System.out.println("\n" + shiftLetter('a', 2));
		
		System.out.println("");
		describeValue(5);
		describeValue(2.5);
		describeValue("hi");
		// Java widens char to int, and long to double, 
		// choosing the closest available method
		describeValue('A');
		describeValue(5L);
		
		int x = 1;
		tryChange(x);
		System.out.println("");
		System.out.println("x = " + x);

		StringBuilder sb = new StringBuilder("Hi");
		appendBang(sb);
		System.out.println("");
		System.out.println(sb);

		StringBuilder sb2 = new StringBuilder("Hi");
		// The parameter holds a copy of the reference. 
		replaceBuilder(sb2);
		System.out.println("");
		System.out.println(sb2);
		
		String s = "java";
		shout(s);
		System.out.println("");
		// Strings are immutable. toUpperCase() returns a new String,
		// which the method then discards.
		System.out.println(s);

		StringBuilder sba = new StringBuilder("cat");
		StringBuilder sbb = sba;
		sbb.append("s");
		System.out.println("");
		System.out.println(a);
		
		System.out.println("");
		compareRefs();
		
		System.out.println("\n" + safeLength(null));
		System.out.println(safeLength("hello"));
		
		System.out.println("\n" + initials("ashu", "jauhari"));
		
		System.out.println("\n" + clean("  HeLLo" ));
		
		System.out.println("\n" + isPalindromeWord("Level"));
		System.out.println(isPalindromeWord("Java"));
		
		System.out.println("\n" + maskEmail("asha@mail.com"));
		
		System.out.println("\n" + buildCsv("a", "b", "c"));
		
		System.out.println("\n" + edit("Hello World"));
		
		System.out.println("\nString +=     : " + timeJoin(false) + " ns"); 
		System.out.println("StringBuilder : " + timeJoin(true) + " ns"); 
		
		// Use StringBuffer when several threads may change the same text,
		// because its methods are synchronized. Otherwise, use the faster
		// StringBuilder.
		System.out.println("\n" + safeAppend(new StringBuffer("Hi"), " there"));
		
		System.out.println("\n" + formatReceipt("Asha", 3, 9.99));
		System.out.println(formatReceipt("Ravi", 2, 4.5));
		
		System.out.println("\n" + toFahrenheit(0));
		System.out.println(toFahrenheit(37.5));
		System.out.println(toFahrenheit(-40));
		
		System.out.println("\n" + percent(45, 60));
		System.out.println(percent(1, 3));
		
		System.out.println("\n" + describeInt(255));
		System.out.println(describeInt(8));

		System.out.println("");
		int x1 = 1, y = 2;
		swap(x1, y);
		// x and y don't change on the outside because their values are 
		// passed into the swap function, not their references. So the 
		// inside values change but the outside stays the same
		System.out.println("outside: x=" + x1 + " y=" + y);
		
		
		System.out.println("");
		StringBuilder sb3 = new StringBuilder("Rao");
		addTitle(sb3);
		// Builder changes because it is mutable, so the StringBuilder
		// that gets passed into the function gets directly modified
		System.out.println(sb3);
		String s1 = "Rao";
		addTitleToString(s1);   // result ignored
		System.out.println(s1);
		// the String does not change because we didn't save the value of 
		// addTitleToString anywhere. Strings are immutable, so addTitleToString
		// doesn't directly modify s1; it instead returns a new String with 
		// the modified value.
		System.out.println(addTitleToString(s1));
		
		System.out.println("");
		System.out.println(countChar("banana", 'a'));
		System.out.println(countChar("banana", 'z'));
		System.out.println(capitalize("jAVA"));

		
		System.out.println("");
		System.out.println(padLeft("42", 5, '0'));
		System.out.println(padLeft("12345", 3, '0'));
		System.out.println(joinWithDash("ab", 3));
		System.out.println(joinWithDash("x", 1));

		System.out.println("");
		System.out.println(roundHalfUp(2.5));
		System.out.println(roundHalfUp(2.4));
		System.out.println(roundHalfUp(7.0));

		System.out.println("");
		System.out.println(factorialInt(5));
		System.out.println(factorialLong(5));
		// This result is wrong because the answer is greater than 
		// Integer.MAX_VALUE, so it gets wrapped around as 
		// 6227020800 + 2(Integer.MIN_VALUE).
		System.out.println(factorialInt(13));
		System.out.println(factorialLong(13));
		System.out.println(factorialLong(20));
		
		System.out.println("");
		System.out.println(summarize("Hello World"));
		System.out.println(summarize("Sky"));


	}

}
