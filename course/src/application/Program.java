package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			Locale.setDefault(Locale.US);
			
			Triangle x, y;
			
			x = new Triangle();
			y = new Triangle();
			
			System.out.println("Digite os dados do triângulo x: ");
			x.a = sc.nextDouble();
			x.b = sc.nextDouble();
			x.c = sc.nextDouble();
			
			System.out.println("Digite os dados do triângulo y: ");
			y.a = sc.nextDouble();
			y.b = sc.nextDouble();
			y.c = sc.nextDouble();
			
			double areaX = x.area();
			double areaY = y.area();
			
			System.out.printf("Área do triângulo x: %.4f\n", areaX);
			System.out.printf("Área do triângulo y: %.4f\n", areaY);
			
			if(areaX > areaY) {
				
				System.out.printf("A área x é maior");
				
			}else {
				
				System.out.printf("A área y é maior");
				
			}
			
			sc.close();
	}

}
