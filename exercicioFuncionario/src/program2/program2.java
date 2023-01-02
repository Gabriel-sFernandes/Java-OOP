package program2;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		System.out.printf("Gross salary: ");	
		emp.grossSalary = sc.nextDouble();
		System.out.printf("Tax: ", emp.tax);
		emp.tax = sc.nextDouble();
		System.out.println();
		
		System.out.printf("Employee: %s, $ %.2f%n", emp.name, emp.netSalary());
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.println();
		System.out.print("Updated data: " + emp);
		
		sc.close();
	}

}
