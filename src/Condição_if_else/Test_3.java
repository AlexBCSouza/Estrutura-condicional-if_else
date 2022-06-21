package Condição_if_else;

import java.util.Scanner;

public class Test_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        float  b = sc.nextFloat();
        float c = sc.nextFloat();

        if (a < b && a < c){
            System.out.println("Menor = " + a);
        }
        else if (b < c){
            System.out.println("Menor = " + b);
        }
        else {
            System.out.println("Menor = " + c);
        }
        sc.close();
    }
}
