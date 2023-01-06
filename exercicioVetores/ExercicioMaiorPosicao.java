package exercicioVetores;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMaiorPosicao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int nmr, posicao;
		double maiorNumero;

		System.out.print("Quantos numeros voce vai digitar? ");
		nmr = sc.nextInt();

		double[] vect = new double[nmr];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		maiorNumero = 0;
		posicao = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] > maiorNumero) {
				maiorNumero = vect[i];
				posicao = i;
			}
		}
		
		System.out.println();
		System.out.println("MAIOR VALOR = " + maiorNumero);
		System.out.println("POSICAO DO MAIOR VALOR = " + posicao);
		
		sc.close();
	}

}
