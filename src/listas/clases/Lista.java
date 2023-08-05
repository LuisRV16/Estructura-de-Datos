package Listas.clases;

import Nodo.Nodo;

public class Lista { // Clase de Lista Simplemente Enlazada

    protected Nodo inicio;
    protected Nodo fin; // Punteros

    public Lista() {
        inicPunteros();
    }

    // Método para saber si la lista está vacía
    public boolean estaVacia() {
        return (inicio == null);
    }

    // Método para Agregar un Nodo al Inicio de la lista
    public void agregarInicio(int dato) {

        // Creando al nodo
        inicio = new Nodo(dato, inicio);

        if (fin == null)
            fin = inicio;

    }

    // Método para Agregar un Nodo al Final de la lista
    public void agregarFinal(int dato) {

        if (!estaVacia()) {

            fin.siguiente = new Nodo(dato);

            fin = fin.siguiente;

        } else {
            inicio = fin = new Nodo(dato);
        }

    }
    
    // Método para eliminar un Nodo del inicio
    public boolean eliminarInicio() {
        
        boolean band = true;
        
        if (!inicio.equals(fin))
            inicio = inicio.siguiente;
        else if (inicio == null)
            band = false;
        else
            inicPunteros();
        
        return band;
        
    }
    
    // Método para eliminar un Nodo del final
    public boolean eliminarFinal(){
        
        boolean band = true;
        
        if (inicio != fin) {
            
            Nodo temp = inicio;
            
            while(temp.siguiente != fin)
                temp = temp.siguiente;
            
            fin = temp;
            
            fin.siguiente = null;
            
        } else if (inicio == null) {
            band = false;
        } else {
            inicPunteros();
        }
        
        return band;
        
    }
    
    // Método para eliminar un dato en específico de la lista
    public boolean eliminarEspecifico(int dato){
        
        boolean band = true;
        
        if (!estaVacia()) {
            
            if (!inicio.equals(fin) && dato != inicio.dato) {
                
                Nodo anterior = inicio;
                Nodo temporal = inicio.siguiente;
                
                while(temporal != null && temporal.dato != dato){
                    
                    anterior = anterior.siguiente;
                    
                    temporal = temporal.siguiente;
                    
                }
                
                if (temporal != null) {
                    
                    anterior.siguiente = temporal.siguiente;
                    
                    if (temporal == fin)
                        fin = anterior;
                    
                } else {
                    band = false;
                }
                
            } else if (dato == inicio.dato) {
                inicio = inicio.siguiente;
            } else {
                inicPunteros();
            }
            
        } else {
            band = false;
        }
        
        return band;
        
    }
    
    // Método para buscar un elemento
    public boolean buscarElemento(int dato){
        
        Nodo temporal = inicio;
        
        while (temporal != null && temporal.dato != dato)
            temporal = temporal.siguiente;
        
        return temporal != null;
        
    }

    // Método para mostrar los elementos contenido en la Lista
    public String mostrarLista() {

        String recorrido = "";

        Nodo recorrer = inicio;

        while (recorrer != null) {

            recorrido += "[" + recorrer.dato + "] ==> ";

            recorrer = recorrer.siguiente;

        }

        recorrido += null;

        return recorrido;

    }
    
    // Método para vaciar la Lista por completo
    public void vaciarLista(){
        inicPunteros();
    }
    
    private void inicPunteros(){
        inicio = fin = null;
    }

}
