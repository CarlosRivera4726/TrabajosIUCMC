package ejercicio10_recursividad;

public class Ejercicio10_recursividad {

    public static void main(String[] args) {
        System.out.println(multiplicacionSumasSucesivas(10, 2));

    }

    public static int multiplicacionSumasSucesivas(int multiplicando, int multiplicador) {
        if (multiplicador == 0) {
            return 0;
        }
        return multiplicando + multiplicacionSumasSucesivas(multiplicando, multiplicador-1);
    }
}
