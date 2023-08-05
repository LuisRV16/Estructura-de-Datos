
package Nodo;

public class Nodo { // Nodo de enlace simple
    
    public int dato;
    public Nodo siguiente; // Puntero enlace
    
    public Nodo (int dato){ // Constructor para insertar al final
        
        this.dato = dato;
        
        this.siguiente = null;
        
    }
    
    public Nodo (int dato, Nodo nodo){ // Constructor para insertar al inicio
        
        this.dato = dato;
        
        this.siguiente = nodo;
        
    }
    
}
