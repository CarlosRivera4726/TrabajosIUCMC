/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;

/**
 *
 * @author Carlos
 */
public class punto4 {

    public String invertir(int num) {
        if (num == 0) {
            return "";
        } else {
            return String.valueOf(num % 10) + invertir(num / 10);
        }
    }
    // para invertir un número se sabe que se puede tomar el residuo e irlo agregando a una cadena
    // esto para que no se sume el valor
    // tenemos 123
    // 123 % 10 = 3;
    // pero a la vez tenemos que quitar el tres del valor inicial
    // así que usamos 
    // 123 / 10 = 12;
    // repetimos este paso hasta que numero sea igual que 0
    // como estamos usando cadenas, retornamos un valor vacio
    // esto para que no se cree un cero al final, o quede algo equivocado
    // y como retornamos string al hacer la "suma" estaremos concatenando cada modulo o cada residuo de la division
}
