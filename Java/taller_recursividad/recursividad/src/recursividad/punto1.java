package recursividad;

public class punto1 {
    
    public int factorial(int n){
        if (n == 0) return 1;
        return n * factorial (n-1);
        //tenemos que el factorial de un numero es el numero * factorial del numero - 1
        // representamos en numeros:
        // n = 5
        // factorial(5) = 5 * factorial(4) <- 5-1        
        // factorial(4) = 4 * factorial(3) <- 4-1
        // factorial(3) = 3 * factorial(2) <- 3-1
        // factorial(2) = 2 * factorial(1) <- 2-1        
        // factorial(1) = 1 * factorial(0) <- 1-1
        // factorial(0) = 1
        
        // una vez sabemos eso, nos damos cuenta que cuando llega a 0 el resultado se vuelve 1 -> así que si n == 0 retornamos 1
        // y multiplicamos el resultado del anterior
        // eso nos da a entender que el factorial de 5 es igual a -> 5 * 4 * 3 * 2 * 1
        // y al final seria 120 <- 
        // n * factorial(n - 1);

    }
    
}
