
package Recursividad.InvertirNumero;

public class InvertirNumero {
    
    public int invertir(int n, int cif){
        
        if (n > 0) {
            
            int digito = n % 10;
            int numero = n / 10;
            
            return invertir(numero, digito + cif*10);
            
        } else {

            return cif;
            
        }
        
    }
    
}
