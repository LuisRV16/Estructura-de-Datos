package Memoria_Estatica;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class MemoriaEstatica {
    
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int[] numerotes = new int[numeros.length];
        String[] palabras = new String[5];
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Ingresa el elemento del índice " + i));
        }
        
        //Mostrando los datos ingresados
        System.out.println("Los datos sin Ordenar son:");
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("["+numeros[i]+"]");
        }
        
        System.out.println("\nLos datos Ordenados son:");
        
        Arrays.sort(numeros); //El arreglo de numeros es ordenado de menor a mayor
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("["+numeros[i]+"]");
        }
        //Rellenando al arreglo palabras
        
        Arrays.fill(palabras, "Bienvenido a la Baticueva");
        
        System.out.println("\nElementos del arreglo palabras:");
        
        for (int i = 0; i < palabras.length; i++) {
            System.out.print("["+palabras[i]+"]");
        }
        
        //Copiando los elementos del arreglo numeros a numerotes
        
//        System.arraycopy(numeros, 0, numerotes, 0, numeros.length);
//        
        System.out.println("\nElementos del arreglo numerotes:");
//        
//        for (int i = 0; i < numerotes.length; i++) {
//            System.out.print("["+numerotes[i]+"]");
//        }
        
        numerotes = Arrays.copyOf(numeros, numeros.length);
        
        for (int i = 0; i < numerotes.length; i++) {
            System.out.print("["+numerotes[i]+"]");
        }
        
    }
    
}
