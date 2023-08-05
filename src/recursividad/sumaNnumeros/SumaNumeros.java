
package Recursividad.Suma_N_numeros;

public class SumaNumeros {
    
    public int SumaNumerosEnteros(int n){
        
        if (n > 1) {
            
            // Caso general
            
            return n + SumaNumerosEnteros(n-1);
            
        } else if (n == 1) {
            
            // Caso base
            
            return n;
            
        } else {
            
            // Excepción: En caso de  0 o numero negativo
            
            System.out.print("No es un numero entero positivo: ");
            return n;
            
        }
        
    }
    
}
