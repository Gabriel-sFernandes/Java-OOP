package exercicioVetores;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioAltura {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int nmr, menores;
		double alturaMedia, soma, percentualMenores;
		
		System.out.print("Quantas pessoas serao digitadas? ");
		nmr = sc.nextInt();
		
		String[] nome = new String[nmr];
		int[] idade = new int[nmr];
		double[] altura = new double[nmr];
		
		for (int i = 0; i < nmr; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			nome[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
		}
		
		alturaMedia = 0.0;
		soma = 0.0;
		
		menores = 0;
		for (int i = 0; i < nmr; i++) {
			if (idade[i] < 16) {
				menores++;
			}
			soma += altura[i];
		}
		
		alturaMedia = soma / nmr;
		percentualMenores = ((double)menores / nmr) * 100;
		
		System.out.printf("Altura média= %.2f\n", alturaMedia);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);
		
		for (int i = 0; i < nmr; i++) {
			if (idade[i] < 16) {
				System.out.printf("%s\n", nome[i]);
			}
		}
		sc.close();
	}
}
