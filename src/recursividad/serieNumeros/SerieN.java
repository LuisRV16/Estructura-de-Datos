
package Recursividad.Serie_Numeros;

public class SerieN {
    
    public String serieN(int n){
        
        if (n > 1)
            // Caso general
            return n + ", " + serieN(n-1);
        else if (n == 1)
            // Caso base
            return "1";
        else
            // Excepción
            return "No se permite 0 o valores negativos";
        
    }
    
}
