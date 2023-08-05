
package Recursividad.SumaDigitos;

public class SumaDigitos {
    
    public int sumaDigitos(int n){
        
        if (n > 0) {
            // Caso general
            return n%10 + sumaDigitos(n/10);
        } else if (n == 0) {
            // Caso base
            return 0;
        } else {
            //Excepción: Si se ingresan numeros negativos
            System.out.print("No se permiten numeros negativos: ");
            return n;
        }
        
    }
    
}
