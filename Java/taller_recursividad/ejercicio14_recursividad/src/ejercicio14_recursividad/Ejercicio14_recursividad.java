/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14_recursividad;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Ejercicio14_recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*  
            
            Ackerman(m, n) = Ackerman(m - 1,
            Ackerman(m, n - 1))   si m > 0 y n >
            0
            Ej. 
            Si se tiene  Ackermann(1, 2) = 4;  Ackermann(3, 2) = 29
            Realice un programa para encontrar
            el valor de lfuncion de
            Ackerman, para dos valores enteros m,n.
            
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el valor de m: ");
        int m = input.nextInt();
        
        System.out.println("Ingrese el valor de n: ");
        int n = input.nextInt();
        System.out.println(ackerman(m, n));
    }

    public static int ackerman(int m, int n) {
        if (m == 0) {
            return n + 1;
        }
        if(m > 0 && n == 0){
            return n + ackerman(m-1, 1);
        }
        if(m > 0 && n > 0){
            return ackerman(m - 1, ackerman(m, n - 1));
        }
        
        return 0;
    }

}
