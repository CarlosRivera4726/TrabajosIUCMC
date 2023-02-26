package ejercicio11_recursividad;

import java.util.Scanner;

public class Ejercicio11_recursividad {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Leer n valores enteros, almacenarlos en un arreglo y realizar la suma de los elementos del vector.
        int p = 0;
        System.out.println("Ingrese el tamaño del vector: ");
        int i = input.nextInt();
        int[] vect = new int[i];

        rellenarVector(vect, p, i);

        for (int valor : vect) {
            System.out.println("valor: " + valor);
        }

        System.out.println(sumarValoresVect(vect, p, i));
    }

    public static int sumarValoresVect(int[] vect, int p, int i) {
        if (p == i) {
            System.out.println("Suma Completa: ");

        }

        if (p < i) {
            return vect[p] + sumarValoresVect(vect, p + 1, i);
        }
        return 0;
    }

    public static void rellenarVector(int[] vect, int p, int i) {
        if (p == i) {
            System.out.println("vector rellenado!");
        }

        if (p < i) {
            System.out.println("Ingrese un valor para el vector: ");

            vect[p] = input.nextInt();
            //p++;
            /*
            System.out.println("J: " + j);
            System.out.println("P: " + p);
            System.out.println("vect: " + vect[(p)]);
            */
            rellenarVector(vect, p + 1, i);
            // i tamaño del arreglo
            // p el aumento de la pos
        }

    }

}
