package ejercicio13_recursividad;

import java.util.Scanner;

public class Ejercicio13_recursividad {

    static Scanner t = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Ingrese un numero: ");
        int maxNumero = t.nextInt();

        for (int i = 0; i <= maxNumero; i++) {
            int fibonacciNumber = printFibonacci(i);
            System.out.print(" " + fibonacciNumber);
        }
        System.out.println("");
    }

    public static int printFibonacci(int n) {

        // casos bases 0 y 1
        return switch (n) {
            case 0 -> 0;
            case 1 -> 1;
            default -> printFibonacci(n - 1) + printFibonacci(n - 2);
        };
    }
}
