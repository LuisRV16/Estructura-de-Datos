
package Recursividad.RestaSucesiva;

public class RestaSucesiva {
    
    int cociente;
    
    public int divResta(int dividendo, int divisor){
        
        if (dividendo < divisor) {
            
            cociente = 0;
            
        } else {
            
            divResta(dividendo - divisor, divisor);
            
            cociente++;
            
        }
        
        return cociente;
        
    }
    
}
