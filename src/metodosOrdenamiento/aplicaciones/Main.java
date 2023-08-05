
package metodosOrdenamiento.aplicaciones;

import javax.swing.JOptionPane;
import metodosOrdenamiento.clases.AlgoritmosDeOrdenamiento;

public class Main {
    
    public static void main(String[] args) {
        
        int[] numeros = {6, 89, 25, 4, 1};
        int[] numeros2 = numeros;
        int[] numeros3 = {55, 4, 43, 44, 2, 10};
        int[] numeros4 = {5, 2, 1, 8, 3, 9, 7};
        int[] numeros5 = {10, 6, 4, 3, 9};
        int[] numeros6 = {6, 1, 5, 2, 3, 4, 7};
        int[] numeros7 = {503, 573, 581, 625, 670, 762};
        int[] numeros8 = {87, 512, 677, 694};
        int[] numeros9;
        int[] numeros10 = {55, 4, 43, 44, 2, 10};
        int[] numeros11 = {55, 4, 43, 44, 2, 10, 1034, 9, 134, 64, 2462, 32, 12, 453, 13};
        
        AlgoritmosDeOrdenamiento ordenar = new AlgoritmosDeOrdenamiento();
        
        System.out.println("Bubble Sort V1:");
        
        numeros = ordenar.bubbleV1(numeros);
        
        for (int i = 0; i < numeros.length; i++)
            System.out.print("[" + numeros[i] + "]");
        
        System.out.println("\nBubble Sort V2:");
        
        numeros2 = ordenar.bubbleV2(numeros2);
        
        for (int i = 0; i < numeros2.length; i++)
            System.out.print("[" + numeros2[i] + "]");
        
        System.out.println("\nRadix:");
        
        numeros3 = ordenar.radix(numeros3);
        
        for (int i = 0; i < numeros3.length; i++)
            System.out.print("[" + numeros3[i] + "]");
        
        System.out.println("\nQuickSort:");
        
        numeros4 = ordenar.quick(numeros4, 0, numeros4.length - 1);
        
        for (int i = 0; i < numeros4.length; i++)
            System.out.print("[" + numeros4[i] + "]");
        
        System.out.println("\nInserción:");
        
        numeros5 = ordenar.insercion(numeros5, numeros5.length - 1);
        
        for (int i = 0; i < numeros5.length; i++)
            System.out.print("[" + numeros5[i] + "]");
        
//        int tam;
//        
//        tam = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el tamaño del Arreglo: "));
//        
//        numeros5 = new int[tam];
//        
//        for (int i = 0; i < numeros5.length; i++) {
//            
//            numeros5[i] = Integer.parseInt(JOptionPane.showInputDialog(null,
//                    "Ingresa el elemento del índice " + i));
//            
//            numeros = ordenar.insercion(numeros5, i + 1);
//            
//        }
//        
//        for (int i = 0; i < numeros.length; i++)
//            System.out.print("[" + numeros[i] + "]");
        
        System.out.println("\nShell sort:");
        
        numeros6 = ordenar.shell(numeros6);
        
        for (int i = 0; i < numeros6.length; i++)
            System.out.print("[" + numeros6[i] + "]");
        
        System.out.println("\nIntercalación:");
        
        numeros9 = ordenar.intercalacion(numeros7, numeros8);
        
        for (int i = 0; i < numeros9.length; i++)
            System.out.print("[" + numeros9[i] + "]");
        
        System.out.println("\nMezcla Directa:");
        
        numeros10 = ordenar.mezclaDirecta(numeros10);
        
        for (int i = 0; i < numeros10.length; i++)
            System.out.print("[" + numeros10[i] + "]");
        
        System.out.println("\nMezcla Natural:");
        
        numeros11 = ordenar.mezclaNatural(numeros11);
        
        for (int i = 0; i < numeros11.length; i++)
            System.out.print("[" + numeros11[i] + "]");
            
    }
    
}
