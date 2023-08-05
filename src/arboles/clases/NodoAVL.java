
package arboles.clases;

public class NodoAVL {
    
    int dato;
    int factorE;
    
    NodoAVL izquierdo;
    NodoAVL derecho;
    
    public NodoAVL(int dato) {
        
        this.dato = dato;
        
        this.factorE = 0;
        
        this.izquierdo = null;
        
        this.derecho = null;
        
    }
    
}
