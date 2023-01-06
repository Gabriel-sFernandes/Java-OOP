package exercicioVetores;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMediaNumerosPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int nmr, qtdPares, soma, media;

		System.out.print("Quantos elementos vai ter o vetor? ");
		nmr = sc.nextInt();
		int[] vect = new int[nmr];
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		soma = 0;
		qtdPares = 0;
		media= 0;
		for (int i = 0; i < vect.length; i++) {
			if(vect[i] % 2 == 0) {
				soma += vect[i];
				qtdPares++;
				media = soma / qtdPares;
			}
		}
		
		if (qtdPares > 0) {
			System.out.printf("MEDIA DOS PARES = %d.0", media);
		}
		else {
			System.out.println("NENHUM NUMERO PAR");
		}	
		sc.close();
	}
}