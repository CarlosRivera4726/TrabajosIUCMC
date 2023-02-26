/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;

/**
 *
 * @author Carlos
 */
public class punto7 {
    
    public int potencia(int base, int exponente){
        if (exponente == 0){
            return 1;
        }
        // se va recorrer base * base, hasta que exponente se vuelva 0
        //esto sirve para que la funcion recursiva vaya de por ejemplo exponente = 5
        // 5 - 1 = 4        
        // 4 - 1 = 3
        // 3 - 1 = 2
        // 2 - 1 = 1
        // 1 - 1 = 0 <- en ese punto la funcion retorna 1 para no borrar todo el procedimiento
        // y se devuelve multiplicando la misma base * base las veces que se resto, en este caso 5 veces hasta que encuentre el 0 y como retorna 1
        // pues queda 125 * 1 = 125 y ya

        return base * potencia(base, exponente - 1);
    }
    
}
