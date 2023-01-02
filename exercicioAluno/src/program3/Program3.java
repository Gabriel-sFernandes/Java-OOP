package program3;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student std = new Student();
		
		std.nome = sc.nextLine();
		std.nota1 = sc.nextDouble();
		std.nota2 = sc.nextDouble();
		std.nota3 = sc.nextDouble();
		
		System.out.println("FINAL GRADE = " + std.finalGrade());
		System.out.println(std.situation());
		
		sc.close();
	}
}