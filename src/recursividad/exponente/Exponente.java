
package Recursividad.Exponente;

public class Exponente {
    
    public int exponente(int v, int n){
        
        if (n > 0) {
            return exponente(v, n-1) * v;
        } else if (n == 0) {
            return 1;
        } else {
            System.out.print("No se permiten valores negativos para el exponente: ");
            return n;
        }
        
    }
    
}
