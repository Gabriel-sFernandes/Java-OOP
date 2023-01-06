package exercicioVetores;

import java.util.Scanner;

public class ExercicioPares {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nmr, nmrPar;
		
		System.out.print	("Quantos numeros voce vai digitar? ");
		nmr = sc.nextInt();
		
		int[] vect = new int[nmr];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		nmrPar = 0;
		System.out.println("NUMEROS PARES:");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				nmrPar++;
				System.out.printf("%d ", vect[i]);
			}
		}
		
		System.out.println();
		System.out.printf("QUANTIDADE DE PARES = %d", nmrPar);
		
		sc.close();
	}

}
