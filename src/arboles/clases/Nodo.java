
package arboles.clases;

public class Nodo {
    
    int dato;
    Nodo izquierda, derecha;

    public Nodo(int dato) {
        
        this.dato = dato;
        
        izquierda = null;
        
        derecha = null;
        
    }
    
    @Override
    public String toString() {
        return "Su dato es: " + dato;
    }
    
}
