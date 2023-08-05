
package Pilas.clases;

public class Pila {
    
    private int tope = -1;
    private final int[] pila;
    
    // Constructor
    public Pila(int tamanio){
        
        pila = new int[tamanio];
        
        tope = -1;
        
    }
    
    // Método push
    public void empujar(int dato) {
        
        tope++;
        
        pila[tope] = dato;
        
    }
    
    // Método pop
    public int sacar() {
        
        int dato = pila[tope];
        
        tope--;
        
        return dato;
        
    }
    
    // Método para saber si la Pila está vacía
    public boolean isVacia() {
        return tope == -1;
    }
    
    // Método para saber si la Pila está llena
    public boolean isLlena() {
        return tope == pila.length-1;
    }
    
    // Método para vaciar o limpiar la Pila
    public void vaciar() {
        
        int aux;
        
        for (int i = tope; i >= 0; i--) {
            
            aux = pila[i];
            
            tope--;
            
        }
        
    }
    
    // Método para saber que elemento o dato se encuentra en la cima
    public int topePila() {
        return pila[tope];
    }
    
    // Método para saber el tamaño de la pila
    public int length() {        
        return pila.length;
    }
    
    
}
