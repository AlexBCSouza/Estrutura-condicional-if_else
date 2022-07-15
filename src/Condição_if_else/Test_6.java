package Condição_if_else;

import java.util.Scanner;

public class Test_6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int N = leitor.nextInt();

        if (N % 2 == 0) {
            System.out.println("Número Par.");
        }
        else {
            System.out.println("Número Ímpar.");
        }

        leitor.close();

    }
}
