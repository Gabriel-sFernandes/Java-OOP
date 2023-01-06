package exercicioVetores;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioAbaixoDaMedia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int nmr;
		double soma, media;

		System.out.print("Quantos elementos vai ter o vetor? ");
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
		System.out.printf("MEDIA DO VETOR = %.3f\n", media);
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		for (int i = 0; i < vect.length; i++) {
			if(vect[i] < media) {
				System.out.println(vect[i]);
			}
		}
		sc.close();
	}
}