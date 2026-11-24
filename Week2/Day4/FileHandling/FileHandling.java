package com.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileHandling {

	public static void main(String[] args) {
		Employee[] emps = new Employee[5];
		emps[0] = new Employee(100, "Bob", "Sales", 80000);
		emps[1] = new Employee(101, "Jim", "Technology", 40000);
		emps[2] = new Employee(102, "Hannah", "Health", 60000);
		emps[3] = new Employee(103, "Ella", "HR", 50000);
		emps[4] = new Employee(104, "Rich", "Executive", 400000);
		
		try (FileOutputStream fos = new FileOutputStream("employees.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(emps);
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Wrote employees to employees.dat");
		
		
		
		try (FileInputStream fis = new FileInputStream("employees.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			Employee[] readEmps = (Employee[]) ois.readObject();
			for (Employee e : readEmps) {
				System.out.println(e);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
