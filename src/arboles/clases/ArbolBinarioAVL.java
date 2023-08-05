
package arboles.clases;

public class ArbolBinarioAVL {
    
    private NodoAVL raiz;
    
    public ArbolBinarioAVL() {
        raiz = null;
    }
    
    public boolean estaVacio() {
        return raiz == null;
    }
    
    public NodoAVL raiz() {
        return raiz;
    }
    
    public int getRaiz() {
        return raiz.dato;
    }
    
    // Método que busca un Nodo por medio de un elemento específico.
    public NodoAVL buscar(int dato, NodoAVL r) {
        
        if (r.dato == dato)
            return r;
        else if (r.dato < dato)
            return buscar(dato, r.izquierdo);
        else if (r.dato > dato)
            return buscar(dato, r.derecho);
        else
            return null;
        
    }
    
    // Método para obtener el Factor de Equilibrio.
    private int getFE(NodoAVL nodo) {
        
        if (nodo == null)
            return -1;
        else
            return nodo.factorE;
        
    }
    
    // Método para realizar Rotación simple a la izquierda.
    private NodoAVL rotacionIzquierda(NodoAVL c) {
        
        NodoAVL aux = c.izquierdo;
        
        c.izquierdo = aux.derecho;
        
        aux.derecho = c;
        
        c.factorE = Math.max(getFE(c.izquierdo), getFE(c.derecho)) + 1;
        
        aux.factorE = Math.max(getFE(aux.izquierdo), getFE(aux.derecho)) + 1;
        
        return aux;
        
    }
    
    // Método para realizar Rotación simple a la derecha.
    private NodoAVL rotacionDerecha(NodoAVL c) {
        
        NodoAVL aux = c.derecho;
        
        c.derecho = aux.izquierdo;
        
        aux.izquierdo = c;
        
        c.factorE = Math.max(getFE(c.izquierdo), getFE(c.derecho)) + 1;
        
        aux.factorE = Math.max(getFE(aux.izquierdo), getFE(aux.derecho)) + 1;
        
        return aux;
        
    }
    
    // Método para realizar Rotación doble a la izquierda.
    private NodoAVL rotacionDobleIzquierda(NodoAVL c) {
        
        NodoAVL aux;
        
        c.izquierdo = rotacionDerecha(c.izquierdo);
        
        aux = rotacionIzquierda(c);
        
        return aux;
        
    }
    
    // Método para realizar Rotación doble a la derecha.
    private NodoAVL rotacionDobleDerecha(NodoAVL c) {
        
        NodoAVL aux;
        
        c.derecho = rotacionIzquierda(c.derecho);
        
        aux = rotacionDerecha(c);
        
        return aux;
        
    }
    
    // Método para insertar AVL si el árbol no está vacío.
    private NodoAVL agregarAVL(int dato, NodoAVL subArb) {
        
        NodoAVL nuevo = new NodoAVL(dato);
        NodoAVL nuevoPadre = subArb;
        
        if (nuevo.dato < subArb.dato) {
            
            if (subArb.izquierdo == null) {
                subArb.izquierdo = nuevo;
            } else {
                
                subArb.izquierdo = agregarAVL(dato, subArb.izquierdo);
                
                if (getFE(subArb.izquierdo) - getFE(subArb.derecho) == 2) {
                    
                    if (nuevo.dato < subArb.izquierdo.dato)
                        nuevoPadre = rotacionIzquierda(subArb);
                    else
                        nuevoPadre = rotacionDobleIzquierda(subArb);
                    
                }
                
            }
            
        } else if (nuevo.dato > subArb.dato) {
            
            if (subArb.derecho == null) {
                subArb.derecho = nuevo;
            } else {
                
                subArb.derecho = agregarAVL(dato, subArb.derecho);
                
                if (getFE(subArb.derecho) - getFE(subArb.izquierdo) == 2) {
                    
                    if (nuevo.dato > subArb.derecho.dato)
                        nuevoPadre = rotacionDerecha(subArb);
                    else
                        nuevoPadre = rotacionDobleDerecha(subArb);
                    
                }
                
            }
            
        } else {
            System.out.println("No se permiten datos duplicados.");
        }
        
        // Actualizando el Factor de Equilibrio
        if (subArb.izquierdo == null && subArb.derecho != null)
            subArb.factorE = subArb.derecho.factorE + 1;
        else if (subArb.derecho == null && subArb.izquierdo != null)
            subArb.factorE = subArb.izquierdo.factorE + 1;
        else
            subArb.factorE = Math.max(getFE(subArb.izquierdo), getFE(subArb.derecho)) + 1;
        
        return nuevoPadre;
        
    }
    
    // Método para insertar un Dato si el árbol está vacío
    public void agregar(int dato) {
        
        NodoAVL nuevo = new NodoAVL(dato);
        
        if (estaVacio())
            raiz = nuevo;
        else
            raiz = agregarAVL(dato, raiz);
        
    }
    
    // Método para recorrer un árbol binario AVL en InOrden
    public void inOrden(NodoAVL r) {

        if (r != null) {

            inOrden(r.izquierdo);

            System.out.print(r.dato + ". ");

            inOrden(r.derecho);

        }

    }

    // Método para recorrer un árbol binario AVL en PreOrden
    public void preOrden(NodoAVL r) {

        if (r != null) {

            System.out.print(r.dato + ". ");

            preOrden(r.izquierdo);

            preOrden(r.derecho);

        }

    }

    // Método para recorrer un árbol binario AVL en PostOrden
    public void postOrden(NodoAVL r) {

        if (r != null) {

            postOrden(r.izquierdo);

            postOrden(r.derecho);

            System.out.print(r.dato + ". ");

        }

    }    
    
}
