
package Pilas.aplicaciones;

import java.util.Stack;

public class MainStack {

    public static void main(String[] args) {
        
        Stack stack = new Stack();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80);
        stack.push(90);
        stack.push(100);
        
        System.out.println("Tamaño de la Pila: " + stack.size());
        
        System.out.println("El tope es: " + stack.peek());
        
        System.out.println("Sacando un elemento de la Pila " + stack.pop());
        System.out.println("Sacando un elemento de la Pila " + stack.pop());
        
        System.out.println("Tamaño de la Pila: " + stack.size());
        
        System.out.println("Sacando un elemento de la Pila " + stack.pop());
        
        System.out.println("Tamaño de la Pila: " + stack.size());
        
    }
    
}
