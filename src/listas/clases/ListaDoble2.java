
package Listas.clases;

public class ListaDoble2 {
    
    private NodoDoble inicio;
    private NodoDoble fin;
    
    public ListaDoble2(){
        inicPunteros();
    }
    
    public boolean estaVacia(){
        return inicio == null;
    }
    
    // Método para agregar un Nodo al inicio
    public void agregarInicio(Object dato){
        
        if (!estaVacia()) {
            
          inicio = new NodoDoble(dato, null, inicio);
          
          inicio.siguiente.anterior = inicio;
          
        } else {
            crearPrimerNodo(dato);
        }
        
    }
    
    //Método para agregar un Nodo al Final
    public void agregarFinal(Object dato){
        
        if (!estaVacia()) {
            
            fin = new NodoDoble(dato, fin, null);
            
            fin.anterior.siguiente = fin;
            
        } else {
            crearPrimerNodo(dato);
        }
        
    }
    
    // Método para eliminar un Nodo al inicio
    public Object eliminarInicio() {
        
        Object elemento = null;
        
        if (inicio == fin) {
            
            elemento = inicio.dato;
            
            inicPunteros();
            
        } else {
            
            elemento = inicio.dato;
            
            inicio = inicio.siguiente;
            
            inicio.anterior = null;
            
        }
        
        return elemento;
        
    }
    
    
    // Método para eliminar un Nodo al final
    public Object eliminarFinal() {
        
        Object elemento = null;
        
        if (inicio == fin) {
            
            elemento = fin.dato;
            
            inicPunteros();
            
        } else {
            
            elemento = fin.dato;
            
            fin = fin.anterior;
            
            fin.siguiente = null;
          
        }
        
        return elemento;
        
    }
    
    // Método para mostrar la lista de inicio a fin
    public String mostrarInicioAFin() {
        
        String s = "";
        
        if (!estaVacia()) {
            
            s = "<==>";
            
            NodoDoble aux = inicio;
            
            while (aux != null) {
                
                s += "["+aux.dato+"] <==> ";
                
                aux = aux.siguiente;
                
            }
            
        }
        
        return s;
        
    }
    
    // Método para mostrar la lista de fin a inicio
    public String mostrarFinAInicio() {
        
        String s = "";
        
        if (!estaVacia()) {
            
            s = "<==>";
            
            NodoDoble aux = fin;
            
            while (aux != null) {
                
                s += "["+aux.dato+"] <==> ";
                
                aux = aux.anterior;
                
            }
            
        }
        
        return s;
        
    }
    
    private void inicPunteros(){
        inicio = fin = null;
    }
    
    private void crearPrimerNodo(Object dato){
        inicio = fin = new NodoDoble(dato);
    }
    
}
