package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Register {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account acc;

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			System.out.println();
			acc = new Account(number, holder, initialDeposit);
		}
		else {
			acc = new Account(number, holder);
		}
		
		System.out.println("Account data:");
		System.out.println(acc);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		acc.deposit(depositValue);
		System.out.println(acc);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		acc.withdraw(withdrawValue);
		System.out.println(acc);
		
		sc.close();
	}

}
