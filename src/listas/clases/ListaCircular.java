
package Listas.clases;

import javax.swing.JOptionPane;

public class ListaCircular {
    
    NodoLC ultimo;
    
    public ListaCircular() {
        ultimo = null;
    }
    
    // Método para saber si la lista está vacía
    public boolean estaVacia(){
        return ultimo == null;
    }
    
    // Método para insertar Nodos
    public ListaCircular agregar(int dato) {
        
        NodoLC nodo = new NodoLC(dato);
        
        if (!estaVacia()) {
            
            nodo.siguiente = ultimo.siguiente;

            ultimo.siguiente = nodo;
            
        }
        
        ultimo = nodo;
        
        return this;
        
    }
    
    // Método para eliminar un Nodo de la Lista
    public boolean eliminar(int dato) {
        
        NodoLC actual;
        
        boolean encontrado = false;
        
        actual = ultimo;
        
        while (actual.siguiente != ultimo && !encontrado) {  
            
            encontrado = actual.siguiente.dato == dato;
            
            if (!encontrado)
                actual = actual.siguiente;
            
        }
        
        encontrado = actual.siguiente.dato == dato;
        
        if (encontrado) {
            
            NodoLC aux = actual.siguiente;
            
            if (ultimo == ultimo.siguiente){
                ultimo = null;
            } else {
                
                if (aux == ultimo)
                    ultimo = actual;
                
                actual.siguiente = aux.siguiente;
                
            }
            
            aux = null;
            
        }
        
        return encontrado;
        
    }
    
    // Método para mostrar la lista
    public void mostarLista() {
        
        NodoLC aux = ultimo.siguiente;
        
        String recorrido = "";
        
        do {
            
            recorrido += "["+aux.dato+"] => ";
            
            aux = aux.siguiente;
            
        } while (aux != ultimo.siguiente);
        
        JOptionPane.showMessageDialog(null, recorrido,
                "Mostrando la Lista Circular", JOptionPane.INFORMATION_MESSAGE );
        
    }
    
}
