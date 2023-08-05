package Listas.clases;

public class ListaDoble {

    protected NodoDoble inicio;
    protected NodoDoble fin;

    public ListaDoble() {
        inicPunteros();
    }

    // Método para saber si la lista está vacía
    public boolean estaVacia() {
        return inicio == null;
    }

    // Método para agregar un dato al inicio de la lista
    public void agregarInicio(Object dato) {

        inicio = new NodoDoble(dato, inicio);

        if (fin == null) {
            fin = inicio;
        }

    }

    // Método para agregar un dato al final de la lista
    public void agregarFinal(Object dato) {

        NodoDoble temp = new NodoDoble(fin, dato);

        if (!estaVacia()) {

            fin.siguiente = temp;

            fin = temp;

        } else {
            inicio = fin = temp;
        }

    }

    // Método para eliminar un dato al inicio de la lista
    public Object eliminarInicio() {

        Object dato = null;

        if (!estaVacia()) {

            dato = inicio.dato;
            
            inicio.siguiente.anterior = null;

            inicio = inicio.siguiente;

        }

        return dato;

    }

    // Método para eliminar un dato al final de la lista
    public Object eliminarFinal() {

        Object dato = null;

        if (inicio != fin) {

            dato = fin.dato;

            fin = fin.anterior;

            fin.siguiente = null;

        } else if (fin != null) {

            dato = fin.dato;

            inicPunteros();

        }

        return dato;

    }
    
    // Método que elimina un dato específico de la lista
    public Object eliminarEspecifico(Object dato) {

        Object elemento = null;

        if (inicio != fin) {

            if (inicio.dato == dato) {
                elemento = eliminarInicio();
            } else if (fin.dato == dato) {
                elemento = eliminarFinal();
            } else {

                NodoDoble temporal = inicio.siguiente;
                NodoDoble anterior = temporal.anterior;

                elemento = temporal.dato;

                while (temporal.siguiente != fin && elemento != dato) {

                    temporal = temporal.siguiente;

                    anterior = temporal.anterior;

                    elemento = temporal.dato;

                }

                if (elemento == dato) {
                    
                    temporal.siguiente.anterior = anterior;
                    
                    anterior.siguiente = temporal.siguiente;
                    
                } else {
                    elemento = null;
                }

            }
            
        } else if (fin != null) {
            
            if (inicio.dato == dato)
                elemento = dato;
            
        }

        return elemento;

    }
    
    // Método que busca un elemento específico en la lista
    public boolean buscarElemento(Object dato) {
        
        NodoDoble temp = inicio;
        
        while (temp != null){
            
            if (temp.dato.equals(dato))
                return true;
            
            temp = temp.siguiente;
            
        }
        
        return false;
        
    }

    // Método que retorna todos los datos de la lista desde el primero hasta el último
    public String mostrarInicioAFin() {

        String recorrido = null;

        if (!estaVacia()) {
            recorrido = "null <== ";
        }

        NodoDoble recorrer = inicio;

        while (recorrer != null) {

            recorrido += "[" + recorrer.dato + "]";

            if (recorrer.siguiente != null) {
                recorrido += " <==> ";
            }

            recorrer = recorrer.siguiente;

        }

        if (!estaVacia()) {
            recorrido += " ==> " + null;
        } else {
            recorrido = "null";
        }

        return recorrido;

    }

    // Método que retorna todos los datos de la lista desde el último hasta el primero
    public String mostrarFinAInicio() {

        String recorrido = null;

        if (!estaVacia()) {
            recorrido = "null <== ";
        }

        NodoDoble recorrer = fin;

        while (recorrer != null) {

            recorrido += "[" + recorrer.dato + "]";

            if (recorrer.anterior != null) {
                recorrido += " <==> ";
            }

            recorrer = recorrer.anterior;

        }

        if (!estaVacia()) {
            recorrido += " ==> " + null;
        } else {
            recorrido = "null";
        }

        return recorrido;

    }

    public void vaciarLista() {
        inicPunteros();
    }

    private void inicPunteros() {
        inicio = fin = null;
    }

}
