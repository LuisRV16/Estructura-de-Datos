
package metodosBusqueda.aplicaciones;

import metodosBusqueda.clases.FuncionesHash;

public class MainHASH {

    public static void main(String[] args) {
        
        FuncionesHash hash = new FuncionesHash(8);
        
        String[] elementos = {"20", "33", "21", "10", "12", "14", "56", "100"};
        
        hash.funcionHash(elementos, hash.getArreglo());
        
        hash.mostrar();
        
        String buscado = hash.buscarClave("333");
        
        if (buscado == null) {
            System.out.println("El elemento 333 no se encuentra en la tabla");
        }
        
    }
    
}
