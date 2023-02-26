package ejercicio9_recursividad;

public class Ejercicio9_recursividad {

    // Leer 2 números enteros y calcular el cociente de 
    // la división entera.(sugerencia: use restas sucesivas)
    public static void main(String[] args) {

        System.out.println(cocienteNumeros(40, 4));
        System.out.println(restaSuc(40, 4));

    }

    public static float cocienteNumeros(float numerador, float denominador) {
        if ((numerador / denominador) > 0) {
            return numerador / denominador; // caso base
            // el minimo es un numero entre 1 ya que entre 0 da indefinido
        } else {
            return numerador / cocienteNumeros(numerador, denominador);
        }
    }
    
    // otra forma (con restas sucesivas)

    public static float restaSuc(float dividendo, float divisor) {
        if (divisor > dividendo) {
            return 0;
        } else {

            return 1 + restaSuc(dividendo- divisor, divisor);
        }
    }

}
