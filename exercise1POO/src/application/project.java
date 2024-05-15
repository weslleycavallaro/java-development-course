package application;

import java.util.Scanner;
import entities.Rectangle;

public class project {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		
		System.out.print("Enter rectangle width and height");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.printf("%.2f, %.2f, %.2f", rectangle.area(), rectangle.perimeter(), rectangle.diagonal());
			
		sc.close();

	}

}
