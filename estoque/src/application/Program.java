package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			Product product = new Product();
			
			System.out.println("Enter product data: ");
			
			System.out.println("Name: ");
			product.name = sc.nextLine();
			
			System.out.println("Price: ");
			product.price = sc.nextDouble();
			
			System.out.println("Quantity: ");
			product.quantity = sc.nextInt();
			
			System.out.println("Product data: " + product);
			
			
			System.out.println("Enter the number of products to be added in the stock: ");
			
			int quantity = sc.nextInt();
			
			product.addProducts(quantity);
			
			System.out.println("Updated product data: " + product);
			
			
			System.out.println("Enter the number of products to be removed from the stock: ");
			
			quantity = sc.nextInt();
			
			product.removeProducts(quantity);
			
			System.out.println("Updated product data: " + product);
			
			
			
			
			
			sc.close();

	}

}
