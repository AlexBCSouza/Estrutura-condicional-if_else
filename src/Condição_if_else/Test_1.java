package Condição_if_else;

import java.util.Locale;
import java.util.Scanner;

public class Test_1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int nota_1 = sc.nextInt();
        int nota_2 = sc.nextInt();
        int notaFinal = (nota_1 + nota_2)/2;

        System.out.printf("Nota final = %d ", + notaFinal);

        if (notaFinal <= 6 ){
            System.out.println(" Reprovado! ");
        }
        else {
            System.out.println("Aprovado!");
        }
        sc.close();
    }
}
