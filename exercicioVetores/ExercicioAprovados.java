package exercicioVetores;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioAprovados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int nmr;
		double soma, media;
		
		System.out.print("Quantos alunos serao digitados? ");
		nmr = sc.nextInt();
		
		String[] nome = new String[nmr];
		double[] nota1 = new double[nmr];
		double[] nota2 = new double[nmr];
		
		for(int i = 0; i < nmr; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i + 1);
			sc.nextLine();
			nome[i] = sc.nextLine();
			nota2[i] = sc.nextDouble();
			nota1[i] = sc.nextDouble();
		}
		
		soma = 0.0;
		media = 0.0;
		System.out.println("Alunos aprovados:");
		for (int i = 0; i < nmr; i++) {
			soma = nota1[i] + nota2[i];
			media = soma / 2;
			if (media >= 6.0) {
				System.out.println(nome[i]);
			}
		}
		sc.close();
	}
}
