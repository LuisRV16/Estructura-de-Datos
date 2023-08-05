
package Recursividad.NumeroFibonacci;

public class NumeroFibonacci {
    
    public int fibonacci(int n){
        
        if (n > 1) {
            
            // Caso general
            return fibonacci(n-1) + fibonacci(n-2);
            
        } else if (n == 0 || n == 1) {
            
            // Caso base
            return n;
        
        } else {
            
            //Excepción salta si se ingresa un numero negativo
            System.out.print("La sucesión fibonaccio no cuenta con numeros negativos: ");
            return n;
        
        }
        
    }
    
}
