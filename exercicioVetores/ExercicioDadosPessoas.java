package exercicioVetores;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDadosPessoas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int nmr, qtdMulheres, qtdHomens;
		double soma, menorAltura, maiorAltura, mediaMulheres;
		
		System.out.print("Quantas pessoas serao digitadas? ");
		nmr = sc.nextInt();
		
		double[] altura = new double[nmr];
		char[] genero = new char[nmr];
		
		for (int i = 0; i < nmr; i++) {
			System.out.printf("Altura da %da pessoa: ", i + 1);
			altura[i] = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i + 1);
			genero[i] = sc.next().charAt(0);
		}
		
		menorAltura = altura[0];
		maiorAltura = altura[0];
		qtdMulheres = 0;
		qtdHomens = 0;
		soma = 0.0;
		mediaMulheres = 0.0;
		for (int i = 0; i < nmr; i++) {
			if(altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			}
			else if(altura[i] < menorAltura) {
				menorAltura = altura[i];
			}
			if (genero[i] == 'f') {
				qtdMulheres++;
				soma += altura[i];
				mediaMulheres = soma / qtdMulheres;
			}
			else if (genero[i] == 'm') {
				qtdHomens++;
			}
		}
		
		System.out.printf("Menor altura = %.2f\n", menorAltura);
		System.out.printf("Maior altura = %.2f\n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f\n", mediaMulheres);
		System.out.println("Numero de homens = " + qtdHomens);
		
		sc.close();
	}

}
