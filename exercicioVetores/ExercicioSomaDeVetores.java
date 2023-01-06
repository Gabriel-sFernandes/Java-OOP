package exercicioVetores;

import java.util.Scanner;

public class ExercicioSomaDeVetores {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int nmr = sc.nextInt();
		int[] vectA = new int[nmr];
		int[] vectB = new int[nmr];
		int[] vectC = new int[nmr];
		
		System.out.println("Digite os valores do vetor A:");
		for (int i = 0; i < vectA.length; i++) {
			vectA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B	:");
		for (int i = 0; i < vectB.length; i++) {
			vectB[i] = sc.nextInt();
		}
		
		for (int i = 0; i < vectC.length; i++) {
			vectC[i] = vectA[i] + vectB[i];
		}
		
		System.out.println("VETOR RESULTANTE:");
		for (int i = 0; i < nmr; i++) {
			System.out.println(vectC[i]);
		}
		
		sc.close();
	}

}
