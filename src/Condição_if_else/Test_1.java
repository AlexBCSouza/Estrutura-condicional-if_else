package Condição_if_else;

import java.util.Locale;
import java.util.Scanner;

public class Test_1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double nota_1 = sc.nextDouble();
        double nota_2 = sc.nextDouble();
        double notaFinal = nota_1 + nota_2;

        System.out.printf("Nota final = %.1f%n", notaFinal);

        if (notaFinal <= 60 ){
            System.out.println(" Reprovado! ");
        }
        else {
            System.out.println("Aprovado!");
        }
        sc.close();
    }
}
