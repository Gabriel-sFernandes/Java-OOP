package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
		Rectangle rect = new Rectangle();
		
		System.out.println("Enter rectangle width and height:");
		rect.height = sc.nextDouble();
		rect.width = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", rect.area());
		System.out.printf("PERIMETRO = %.2f%n", rect.perimetro());
		System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());
		
		sc.close();
	}
}
