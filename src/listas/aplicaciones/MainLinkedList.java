
package Listas.aplicaciones;

import java.util.LinkedList;

public class MainLinkedList {

    public static void main(String[] args) {
        
        LinkedList lista = new LinkedList();
        
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.add(50);
        lista.add(60);
        lista.add(70);
        lista.add(80);
        lista.add(90);
        lista.add(100);
        
        int size = lista.size();
        
        int i = 0;
        
        while (i < size) { 
            
            System.out.print("["+lista.get(i)+"]");
            
            if (i < size-1)
                System.out.print(" -> ");
            else
                System.out.println("");
            
            i++;
            
        }
        
        lista.remove(2);
        
        i = 0;
        
        size = lista.size();
        
        while (i < size) { 
            
            System.out.print("["+lista.get(i)+"]");
            
            if (i < size-1)
                System.out.print(" -> ");
            else
                System.out.println("");
            
            i++;
            
        }
        
        lista.add(2, 25);
        
        i = 0;
        
        size = lista.size();
        
        while (i < size) { 
            
            System.out.print("["+lista.get(i)+"]");
            
            if (i < size-1)
                System.out.print(" -> ");
            else
                System.out.println("");
            
            i++;
            
        }
        
    }
    
}
