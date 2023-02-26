
package recursividad;

/**
 *
 * @author Carlos
 */
public class punto5 {
    public int sumaDigitos(int n){
        
        if(n == 0){
            return 0;
        }
        return ((n % 10) ) + sumaDigitos(n / 10);
        // para sumar los digitos vamos a tomar el residuio de n / 10 -> representado como n % 10
        // una vez tenemos el residuo guardado de la division anterior lo sumamos y tenemos que guardar el número en n/10
        // esto quedaria representado en numero de la siguiente forma

        // 123 % 10 = 3
        // 123 / 10 = 12
        
        // 12 % 10 = 2
        // 12 / 10 = 1
        
        // 1 % 10 = 1
        // 1 / 10 = 0 <- esto en numeros enteros, si usaramos flotantes quedaria 0.1
        
        // esos valores en la primera iteracion de la recursividad
        // tenemos como condicion que n sea == 0 <- si esto es así retornamos 0 <- ya que así no cambia el valor
        // como tenemos que sumar pues se suma el residuo 3 + 2 + 1 + 0 = 6 <- así se representaria la funcion si la vieramos poco a poco
    }
    
}
