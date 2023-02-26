package ejercicio8_recursividad;

public class Ejercicio8_recursividad {

    public static void main(String[] args) {

        System.out.println(mcd(105, 70));
    }

    public static int mcd(int M, int N) {
        if (N == 0) { // MCD = M si N = 0
            return M;
        } else {
            return mcd(N, M % N); // MCD = MCD(N, M%N) si N <> 0
            /* 
            Al restar b entre a tantas veces para
            que el resultado sea menor que a, lo que
            queda es el resto de dividir a entre b.
             */
        }
    }

}
