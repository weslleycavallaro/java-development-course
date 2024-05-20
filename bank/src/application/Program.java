package application;

import java.util.Locale;
import java.util.Scanner;

import entities.User;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		
		System.out.println("Welcome!");
		System.out.println("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.println("Enter tour name: ");
		sc.nextLine();
		String username = sc.nextLine();
		System.out.println("Do you want to make a initial deposit? 1 for yes e 2 for no!");
		int option = sc.nextInt();
		double initialDeposit;
		
		User user;
		
		if(option == 1) {
			
			System.out.println("Enter a value to be deposite: ");
			initialDeposit = sc.nextDouble();
			
			user = new User(accountNumber, username, initialDeposit);
			
		}else {
			
			user = new User(accountNumber, username);
			
		}
		
		System.out.println("Account data: ");
		System.out.println(user);
		
		System.out.println("Enter a deposit value: ");
		
		double deposit = sc.nextDouble();
		user.deposit(deposit);
		
		System.out.println("Updated account data: ");
		System.out.println(user);
		
		System.out.println("Enter a withdraw value: ");
		
		double withdraw = sc.nextDouble();
		user.withdraw(withdraw);
		
		System.out.println("Updated account data: ");
		System.out.println(user);
		
		sc.close();
		
	}

}
