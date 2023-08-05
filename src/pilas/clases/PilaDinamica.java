
package Pilas.clases;

import Nodo.Nodo;

public class PilaDinamica {
    
    private Nodo top;
    private int size;
    
    public PilaDinamica(){
        
        top = null;
        
        size = 0;
        
    }
    
    public boolean isEmpty() {
        return top  == null;
    }
    
    public void push(int element) {
        
        Nodo node = new Nodo(element);
        
        node.siguiente = top;
        
        top = node;
        
        size++;
        
    }
    
    public int pop() {
        
        int element = top.dato;
        
        top = top.siguiente;
        
        size--;
        
        return element;
        
    }
    
    public int getTop() {
        return top.dato;
    }
    
    public int size() {
        return size;
    }
    
    public void clear() {
        
        while(isEmpty())
            pop();
        
    }  
    
}
