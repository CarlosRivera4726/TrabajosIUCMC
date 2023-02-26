/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;

/**
 *
 * @author Carlos
 */
public class punto2 {
    public int sumatoria(int n){
        if (n == 0) return 0;
        return n + sumatoria(--n);
        // tenemos que la sumatoria de un número es
        // n + n - 1;
        // esto representado en numeros seria
        // sumatoria(5) = 5 + sumatoria(4) <- 5-1
        // sumatoria(4) = 4 + sumatoria(3) <- 4-1
        // sumatoria(3) = 3 + sumatoria(2) <- 3-1
        // sumatoria(2) = 2 + sumatoria(1) <- 2-1        
        // sumatoria(1) = 1 + sumatoria(0) <- 1-1        
        // sumatoria(1) = 1 + sumatoria(0) <- 1-1
        // sumatoria(0) = 0
        // como vemos es similar a el factorial, pero en este caso la sumatoria de 0 es igual a 0
        // así que hasta que llegue a 0 el numero inicial retornamos 0, si retornamos 1 se sumaria 1 al final y eso nos daria un mal resultado, aunque sea solo por 1
        // n + sumatoria(--n);
        // --n -> nos representa (n - 1); -> no lo coloco n--; ya que se enviar el numero 5 y despues se le restaria 1, así que cada iteracion seria 5
        // así que generaria un "bucle infinito" o una excepcion de memoria, ya que nunca finalizaria la sumatoria
        // java.lang.StackOverflowError
        // 


    }
    
}
