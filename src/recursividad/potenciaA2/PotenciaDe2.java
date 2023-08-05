
package Recursividad.Potencia_2;

public class PotenciaDe2 {
    
    public int potencia(int n){
        
        if (n > 0) {
            // Caso general
            return 2 * potencia(n-1);
        } else if (n == 0) {
            // Caso base
            return 1;
        } else {
            //Excepción: Si se ingresan numeros negativos
            System.out.print("No se permiten numeros negativos: ");
            return n;
        }
        
    }
    
}
