package exercicioVetores;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMaisVelho {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int nmr, maisVelho, posicao;
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		nmr = sc.nextInt();
		
		String[] nome = new String[nmr];
		int[] idade = new int[nmr];
		
		
		for (int i = 0; i < nmr; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			nome[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
		}
		
		maisVelho = idade[0];
		posicao = 0;
		for (int k = 0; k < nmr; k++) {
			if(idade[k] > maisVelho) {
				maisVelho = idade[k];
				posicao = k;
			}
		}
		
		System.out.printf("PESSOA MAIS VELHA= %s\n", nome[posicao]);
		
		sc.close();
	}
}