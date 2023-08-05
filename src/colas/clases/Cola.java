
package Colas.clases;

import Nodo.Nodo;

public class Cola {
    
    private Nodo head;
    private Nodo tail;
    private int size;
    
    public Cola() {
        inicPunteros();
    }
    
    // Método para saber si la cola está vacía
    public boolean isEmpty() {
        return head == null;
    }
    
    //Método para insertar un elemento en la cola
    public void add(int element) {
        
        Nodo node = new Nodo(element);
        
        if (!isEmpty())
            tail.siguiente = node;
        else
            head = node;
        
        tail = node;
        
        size++;
        
    }
    
    // Método para eliminar un elemento de la cola
    public int remove() {
        
        int aux = head.dato;
        
        head = head.siguiente;
        
        size--;
        
        return aux;
        
    }
    
    // Método para saber que elemento está al inicio de la cola
    public int peek() {
        return head.dato;
    }
    
    // Método para saber el tamaño de la cola
    public int size() {
        return size;
    }
    
    // Método para vaciar la cola
    public void clear() {
        inicPunteros();
    }
    
    private void inicPunteros() {
        
        head = tail = null;
        
        size = 0;
        
    }
    
}
