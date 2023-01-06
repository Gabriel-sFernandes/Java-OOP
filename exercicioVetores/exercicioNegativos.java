import java.util.Scanner;

public class exercicioNegativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int nmr = sc.nextInt();
        while (nmr > 10) {
            System.out.println("Digite um número abaixo de 10: ");
            nmr = sc.nextInt();
        }
        int[] vect = new int [nmr];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < 0) {   
                System.out.println(vect[i]);
            }
        }
        sc.close();
    }
}
