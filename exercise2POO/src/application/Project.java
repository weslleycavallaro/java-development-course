package application;

import java.util.Scanner;

import entities.Employee;

public class Project {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println("Employee: " + employee.name + ", $ " + employee.netSalary());
		
		System.out.print("Wish percentage to increase salary? ");
		double percentage = sc.nextDouble();
		
		employee.increaseSalary(percentage);
		
		System.out.println("Updated data: " + employee.name + ", $ " + employee.netSalary());
		
		sc.close();

	}

}
