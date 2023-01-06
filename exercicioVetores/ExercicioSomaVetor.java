package exercicioVetores;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioSomaVetor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int nmr;
		double soma, media;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		nmr = sc.nextInt();
		double[] vect = new double[nmr];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		soma = 0.0;
		
		for (int i = 0; i < vect.length; i++) {
			soma += vect[i]; 
		}
		
		media = 0.0;
		media = soma / nmr;
		
		System.out.print("VALORES = ");
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("%.1f ", vect[i]);
		}
		
		System.out.println();
		System.out.println("SOMA = " + soma);
		System.out.println("MEDIA = " + media);
		
		sc.close();
	}
}