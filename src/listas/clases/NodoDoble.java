
package Listas.clases;

public class NodoDoble{ // Nodo de Doble enlace
    
    Object dato;
    NodoDoble siguiente;
    NodoDoble anterior; // Puntero anterior
    
    // Constructor para insertar si la lista está vacía
    
    public NodoDoble(Object dato){
        
        this.anterior = null;
        
        this.dato = dato;
        
        this.siguiente = null;
        
    }
    
    // Constructor para insertar al inicio
    public NodoDoble(Object dato, NodoDoble siguiente) {
        
        this.anterior = null;
        
        this.dato = dato;
        
        this.siguiente = siguiente;
        
    }
    
    // Constructor para insertar al final
    public NodoDoble(NodoDoble anterior, Object dato){
        
        this.anterior = anterior;
        
        this.dato = dato;
        
        this.siguiente = null;
        
    }
    
    // Constructor para insertar Nodo en cualquier parte
    public NodoDoble(Object dato, NodoDoble anterior, NodoDoble siguiente) {
        
        this.anterior = anterior;
        
        this.dato = dato;
        
        this.siguiente = siguiente;
        
    }
    
}
