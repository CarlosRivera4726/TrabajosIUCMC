/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;

/**
 *
 * @author Carlos
 */
public class punto3 {

    public double sumatoria(double n) {
        if (1/n == 1) {
            return 1;
        }else{
            return (1 / n) + sumatoria(n - 1);
        }
        
        // se nos da una funcion 1 + 1/2 + 1/3 .. 1/n
        // teniendo en cuenta esto, damos por hecho que n nunca debe ser 0, ya que la division por este numero no es posible
        // y como tenemos que el limite lo da n -> vamos a ir desde 1/n hasta 1/1 o lo que seria 1
        // entonces denotamos n - 1
        // y pues sumamos 1 / n donde vaya
        //
        
    }
}
