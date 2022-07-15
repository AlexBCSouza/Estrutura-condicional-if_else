package Condição_if_else;

import java.util.Scanner;

public class Test_5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int N = leitor.nextInt();

        if (N < 0) {
            System.out.println("Número Negativo!");
        }
        else {
            System.out.println("Número Positivo!");
        }
        leitor.close();
    }
}
