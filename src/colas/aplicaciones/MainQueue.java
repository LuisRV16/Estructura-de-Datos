
package Colas.aplicaciones;

import java.util.LinkedList;
import java.util.Queue;

public class MainQueue {

    public static void main(String[] args) {
        
        Queue<Integer> cola = new LinkedList<>();
        
        cola.add(10);
        cola.add(20);
        cola.add(30);
        cola.add(40);
        cola.add(50);
        cola.add(60);
        cola.add(70);
        cola.add(80);
        cola.add(90);
        cola.add(100);
        
        System.out.println("El inicio de la Cola es " + cola.peek());
        
        int tamanio = cola.size();
        
        System.out.println("Vaciando la cola:");
        
        while (!cola.isEmpty())
            System.out.println("\tDespachando al elemento " + cola.remove());
        
    }
    
}
