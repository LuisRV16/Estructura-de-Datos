
package metodosBusqueda.aplicaciones;

import metodosBusqueda.clases.MetodosBusqueda;
import metodosOrdenamiento.clases.AlgoritmosDeOrdenamiento;

public class Main {

    public static void main(String[] args) {
        
        int[] numeros = {6, 89, 25, 4, 1, 0, 43, 132, 64, 32};
        
        MetodosBusqueda busqueda = new MetodosBusqueda();
        
        int indice = busqueda.secuencial(numeros, 54675);
        
        String s = "Elemento no encontrado.";
        
        if (indice != -1) {
            s = "Elemento encontrado en el índice " + indice;
        }
        
        System.out.println(s);
        
        AlgoritmosDeOrdenamiento ordenar = new AlgoritmosDeOrdenamiento();
        
        numeros = ordenar.quick(numeros, 0, numeros.length - 1);
        
        indice = busqueda.binaria(numeros, 132);
        
        s = "Elemento no encontrado.";
        
        if (indice != -1) {
            s = "Elemento encontrado en el índice " + indice;
        }
        
        System.out.println(s);
        
    }
    
}
