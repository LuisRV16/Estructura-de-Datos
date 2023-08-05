
package grafos.aplicaciones;

import grafos.clases.Grafo;

public class MainGrafo {
    
    public static void main(String[] args) {
        
        long[][] mAdy = {
            
            {0, 3, 4, Long.MAX_VALUE, 8, Long.MAX_VALUE},
            {Long.MAX_VALUE, 0, Long.MAX_VALUE, Long.MAX_VALUE, 5, Long.MAX_VALUE},
            {Long.MAX_VALUE, Long.MAX_VALUE, 0, Long.MAX_VALUE, 3, Long.MAX_VALUE},
            {Long.MAX_VALUE, Long.MAX_VALUE, Long.MAX_VALUE, 0, Long.MAX_VALUE, Long.MAX_VALUE},
            {Long.MAX_VALUE, Long.MAX_VALUE, Long.MAX_VALUE, 7, 0, 3},
            {Long.MAX_VALUE, Long.MAX_VALUE, Long.MAX_VALUE, 2, Long.MAX_VALUE, 0}
            
        };
        
        Grafo ruta = new Grafo();
        
        System.out.println(ruta.algFloyd(mAdy));
        
    }
    
}
