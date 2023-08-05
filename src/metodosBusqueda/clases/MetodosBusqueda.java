
package metodosBusqueda.clases;

public class MetodosBusqueda {
    
    // Método de busqueda secuencial
    public int secuencial(int[] numeros, int elemento) {
        
        int i;
        boolean encontrado = false;
        
        for (i = 0; i < numeros.length && encontrado == false; i++) {
            
            if (elemento == numeros[i]) {
                
                encontrado = true;
                
                return i;
                
            }
            
        }
        
        return -1;
        
    }
    
    // Método de busqueda binaria
    public int binaria(int[] numeros, int elemento) {
        
        int centro;
        int primero;
        int ultimo;
        int valorCentro;
        
        primero = 0;
        ultimo = numeros.length - 1;
        
        while (primero <= ultimo) {         
            
            centro = (primero + ultimo) / 2;
            
            valorCentro = numeros[centro];
            
            System.out.println("Comparando a " + elemento + " con " + numeros[centro]);
            
            if (elemento == valorCentro) {
                return centro;
            } else if (elemento < valorCentro) {
                ultimo = centro - 1; // Desplazarnos hacia la izquierda
            } else {
                primero = centro + 1; // Desplazarnos hacia la derecha
            }
            
        }
        
        return -1;
        
    }
    
}
