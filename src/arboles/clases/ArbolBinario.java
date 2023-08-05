package arboles.clases;

import java.util.Stack;

public class ArbolBinario {

    private Nodo raiz;

    public ArbolBinario() {
        raiz = null;
    }

    // Método para saber si el árbol está vacío
    public boolean estaVacio() {
        return raiz == null;
    }

    // Método para insertar un Nodo en el árbol
    public void agregar(int dato) {

        Nodo nodo = new Nodo(dato);

        if (!estaVacio()) {

            Nodo aux = raiz;
            Nodo padre;

            while (true) {

                padre = aux;

                if (dato < aux.dato) {

                    aux = aux.izquierda;

                    if (aux == null) {

                        padre.izquierda = nodo;

                        return; // Sale del método

                    }

                } else {

                    aux = aux.derecha;

                    if (aux == null) {

                        padre.derecha = nodo;

                        return; // Sale del método

                    }

                }

            }

        } else {
            raiz = nodo;
        }

    }
    
    // Método para eliminar un Nodo con un dato específico del árbol
    public boolean eliminar(int dato) {
        
        Nodo auxiliar = raiz;
        Nodo padre = raiz;
        
        boolean esIzq = true;
        
        while (auxiliar.dato != dato) { 
        /*
         * Mientras el dato que se
         * encuentre en el nodo auxiliar
         * sea diferente del dato a eliminar
         * se hace:
         */            
            padre = auxiliar; // El Nodo padre apunta el Nodo auxiliar
            
            if (dato < auxiliar.dato) {
                
                /*
                 * Si el dato a eliminar es menor al dato en el Nodo auxiliar,
                 * entonces esIzq es verdadero y el Nodo auxiliar toma el valor
                 * del hijo izquierdo del Nodo al que apunta auxiliar en ese momento.
                 */
                
                esIzq = true;
                
                auxiliar = auxiliar.izquierda;
                
            } else {
                
                /*
                 * Si no, entonces esIzq es falso y el Nodo auxiliar apunta al
                 * hijo derecho del Nodo al que apunta auxiliar en ese momento.
                 */
                
                esIzq = false;
                
                auxiliar = auxiliar.derecha;
                
            }
            
            if (auxiliar == null)
                /*
                 * Se evalua que el Nodo auxiliar sea igual a nulo, si ese es el
                 * caso, entonces se retorna falso y se sale del método.
                 * Esto se hace, en caso de que se haya llegado a un Nodo hoja y
                 * aún no se haya encontrado el dato, en ese caso, aux apuntaría
                 * a uno de los hijos y se evalua al final del ciclo que el nodo
                 * al que ahora apunte aux sea nulo, si ese es el caso, quiere
                 * decir que no se encontró el dato a eliminar, es decir, no
                 * está en el árbol. Ese if cuenta para todos los casos, incluso
                 * en el que el nodo raíz no tenga hijos, es decir, sea un nodo
                 * hoja como se mencionó anteriormente.
                 */
                return false;
            
        } // Fin del ciclo While
        
        /*
         * Una vez terminado el ciclo, si se encontró el elemento a eliminar,
         * se pasarán a evaluar otras condiciones relevantes para la correcta 
         * eliminación del nodo.
         */
        
        if (auxiliar.izquierda == null && auxiliar.derecha == null) {
            
            /*
             * En esta parte se evalua si el Nodo auxiliar, es decir, el Nodo
             * con el dato ya encontrado no tiene hijos, entonces se proceden a
             * evaluar otras condiciones.
             */
            
            if (auxiliar == raiz)
                /*
                 * En caso de que el árbol sólo contenga el nodo raíz y el dato
                 * a eliminar estuviera contenido en ese nodo, el nodo raíz se
                 * elimina y se procede a igual el puntero raíz a nulo, es decir
                 * el árbol está vacío.
                 */
                raiz = null;
            else if (esIzq)
                /*
                 * Si el Nodo hoja es un Nodo hijo izquierdo de un subárbol o del
                 * propio árbol principal, entonces el Nodo padre apuntando al
                 * Nodo hijo izquierdo se vuelve nulo, es decir, se elimina al
                 * hijo izquierdo de ese subárbol.
                 */
                padre.izquierda = null;
            else
                /*
                 * Si no, entonces quiere decir que el hijo derecho del Nodo
                 * padre de ese subárbol es el Nodo a eliminar, entonces el Nodo
                 * padre apuntando al hijo derecho se vuelve nulo, es decir, se
                 * elimina al hijo izquierdo de ese subárbol.
                 */
                padre.derecha = null;
            
        } else if (auxiliar.derecha == null) {
            /*
             * En caso de que el Nodo con el dato a eliminar no tenga un hijo a
             * la derecha, entonces se evaluan otras condiciones
             */
             
            if (auxiliar == raiz)
                /*
                 * Si el Nodo con el dato a eliminar apunta al Nodo raíz,
                 * entonces el Nodo raíz ahora será el hijo izquierdo.
                 */
                raiz = auxiliar.izquierda;
            else if (esIzq)
                /*
                 * Si el Nodo con el dato a eliminar es un Nodo hijo izquierdo,
                 * entonces el hijo izquierdo del Nodo padre ahora es el hijo
                 * izquierdo del Nodo a eliminar, el cual es el nodo auxiliar.
                 * Dicho de otra forma El Nodo auxiliar es el hijo izquierdo de
                 * su Nodo padre, y el hijo izquierdo del Nodo padre ahora es el
                 * hijo izquierdo del Nodo auxiliar, entonces el Nodo auxiliar
                 * es eliminado.
                 */
                padre.izquierda = auxiliar.izquierda;
            else
                /*
                 * Si el Nodo con el dato a eliminar (auxiliar) es un Nodo hijo
                 * derecho, entonces el hijo derecho del Nodo padre ahora será
                 * el que fue el hijo izquierdo del Nodo auxiliar, entonces
                 * el Nodo auxiliar es eliminado
                 */
                padre.derecha = auxiliar.izquierda;
            
        } else if (auxiliar.izquierda == null) {
             /*
              * En caso de que el Nodo con el dato a eliminar no tenga un hijo a
              * la izquierda, entonces se evaluan otras condiciones
              */
             
            if (auxiliar == raiz)
                /*
                 * Si el Nodo con el dato a eliminar apunta al Nodo raíz,
                 * entonces el Nodo raíz ahora será el hijo derecho.
                 */
                raiz = auxiliar.derecha;
            else if (esIzq)
                /*
                 * Si el Nodo con el dato a eliminar es un Nodo hijo izquierdo,
                 * entonces el hijo izquierdo del Nodo padre ahora es el hijo
                 * derecho del Nodo a eliminar (auxiliar).
                 * Dicho de otra forma El Nodo auxiliar es el hijo izquierdo de
                 * su Nodo padre, y el hijo izquierdo del Nodo padre ahora es el
                 * hijo derecho del Nodo auxiliar, entonces el Nodo auxiliar
                 * es eliminado.
                 */
                padre.izquierda = auxiliar.derecha;
            else
                /*
                 * Si el Nodo con el dato a eliminar (auxiliar) es un Nodo hijo
                 * derecho, entonces el hijo derecho del Nodo padre ahora será
                 * el que fue el hijo derecho del Nodo auxiliar, entonces
                 * el Nodo auxiliar es eliminado
                 */
                padre.derecha = auxiliar.derecha;
            
        } else {
            /*
             * En caso de que el Nodo a eliminar (auxiliar) tenga tando hijo a
             * la izquierda y a la derecham, entonces se crea un Nodo de
             * reemplazo el cuál es igual a... (continuar en la explicación del
             * método getNodoReemplazo() para terminar de comprender cuál será
             * el Nodo de reemplazo.
             */
            
            Nodo reemplazo = getNodoReemplazo(auxiliar);
            
            if (auxiliar == raiz)
                raiz = reemplazo;
            else if (esIzq)
                /*
                 * Si el nodo auxiliar es un hijo izquierdo de su Nodo Padre,
                 * entonces el hijo izquierdo del Nodo padre, ahora será el
                 * Nodo de reemplazo.
                 */
                padre.izquierda = reemplazo;
            else
                /*
                 * Si no, el nodo auxiliar es un hijo derecho de su Nodo Padre,
                 * entonces el hijo derecho del Nodo padre, ahora será el
                 * Nodo de reemplazo.
                 */
                padre.derecha = reemplazo;
            
            /*
             * Y al final el hijo izquierdo del Nodo de reemplazo será el
             * hijo izquierdo del Nodo a eliminar (auxiliar).
             */
            reemplazo.izquierda = auxiliar.izquierda;
            
        }
        
        return true;
        
    }
    
    // Método encargado de devolvernos el nodo reemplazo
    public Nodo getNodoReemplazo(Nodo nodoAReemp) {
        
        Nodo reemplazarPadre = nodoAReemp;
        Nodo reemplazo = nodoAReemp;
        Nodo aux = nodoAReemp.derecha;
        
        /*
         * El nodo aux apunta al hijo del Nodo auxiliar debido a que se busca
         * obtener el Nodo con el valor superior (o en su defecto, igual) más
         * cercano al Nodo auxiliar, esto con la finalidad de que este Nodo, sea
         * el reemplazo del Nodo a eliminar (auxiliar).
         *
         * Se recibe al nodo a eliminar (auxiliar) y se crean tres Punteros
         * que apuntaran a sus respectivos Nodos a reemplazar
         * reemplzar Padre y reemplazo apuntan al Nodo auxiliar y el Nodo
         * auxiliar de esta clase (aux) se apunta al hijo derecho del Nodo a
         * eliminar (auxiliar).
         */
        
        while (aux != null) {
            
            reemplazarPadre = reemplazo;
            
            reemplazo = aux;
            
            aux = aux.izquierda;
            
            /*
             * Mientras que el Nodo aux sea distinto de nulo, el Nodo
             * reemplazarPadre apuntará al Nodo reemplazo y posteriormente
             * el Nodo reemplazo apuntará a aux, posteriormente el nodo aux
             * ahora apuntará a su hijo izquierdo.
             * Apunta al hijo izquierdo, debido a que de ese lado se situa un
             * Nodo con un valor menor al del Nodo padre, esto intenta asegurar
             * encontrar el valor más cercano al Nodo a eliminar (auxiliar).
             */
            
        }
        
        /*
         * Una vez que el Nodo auxiliar es nulo, se sale del ciclo y esto
         * asegura tener el Nodo de reemplazo, el cuál fue el Nodo anterior
         * al Nodo aux actual (el cuál ahora apunta a nulo).
         */
        
        if (reemplazo != nodoAReemp.derecha) {
            
            reemplazarPadre.izquierda = reemplazo.derecha;
            
            reemplazo.derecha = nodoAReemp.derecha;
            
            /*
             * Si el reemplazo es diferente el hijo derecho del Nodo a eliminar
             * (auxiliar), entonces el hijo izquierdo del Nodo Padre del 
             * Nodo reemplazo va a ser el hijo derecho del Nodo reemplazo, y
             * el hijo derecho del Nodo reemplazo va a ser igual al hijo derecho
             * del Nodo auxiliar.
             */
            
        }
        
        System.out.println("El Nodo Reemplazo es " + reemplazo);
        
        return reemplazo;
        
    }

    // Método para recorrer un árbol binario en InOrden
    public void inOrden(Nodo r) {

        if (r != null) {

            inOrden(r.izquierda);

            System.out.print(r.dato + ". ");

            inOrden(r.derecha);

        }

    }

    // Método para recorrer un árbol binario en PreOrden
    public void preOrden(Nodo r) {

        if (r != null) {

            System.out.print(r.dato + ". ");

            preOrden(r.izquierda);

            preOrden(r.derecha);

        }

    }

    // Método para recorrer un árbol binario en PostOrden
    public void postOrden(Nodo r) {

        if (r != null) {

            postOrden(r.izquierda);

            postOrden(r.derecha);

            System.out.print(r.dato + ". ");

        }

    }
    
    // Método para buscar un Nodo específico
    public Nodo busqueda(int dato) {
        
        Nodo aux = raiz;
        
        while (aux.dato != dato) {            
            
            if (dato < aux.dato)
                aux = aux.izquierda;
            else
                aux = aux.derecha;
            
            if (aux == null)
                return null;
            
        }
        
        return aux;
        
    }

    // Método para recorrer un árbol binario en InOrden de forma iterativa
    public void inOrdenIterativo(Nodo r) {
        
        Stack<Nodo> stack = new Stack<>();
        
        Nodo current = r;

        while (current != null || !stack.isEmpty()) {
            
            while (current != null) {
                
                stack.push(current);
                
                current = current.izquierda;
                
            }

            current = stack.pop();
            
            System.out.print(current.dato + ". ");
            
            current = current.derecha;
            
        }
        
    }

    // Método para recorrer un árbol binario en PreOrden de forma iterativa
    public void preOrdenIterativo(Nodo r) {
        
        if (estaVacio()) return;

        Stack<Nodo> stack = new Stack<>();
        
        stack.push(r);

        while (!stack.isEmpty()) {
            
            Nodo current = stack.pop();
            
            System.out.print(current.dato + ". ");

            if (current.derecha != null)
                stack.push(current.derecha);
            
            if (current.izquierda != null)
                stack.push(current.izquierda);
            
        }
        
    }

    // Método para recorrer un árbol binario en PostOrden de forma iterativa
    public void postOrdenIterativo(Nodo r) {
        
        if (estaVacio()) return;

        Stack<Nodo> stack1 = new Stack<>();
        
        Stack<Nodo> stack2 = new Stack<>();

        stack1.push(r);

        while (!stack1.isEmpty()) {
            
            Nodo current = stack1.pop();
            
            stack2.push(current);

            if (current.izquierda != null)
                stack1.push(current.izquierda);
                
            if (current.derecha != null)
                stack1.push(current.derecha);
                
        }

        while (!stack2.isEmpty())
            System.out.print(stack2.pop().dato + ". ");
        
    }

    // Método para obtener el Nodo raíz
    public Nodo raiz() {
        return raiz;
    }

    // Método para retornar el valor de la raíz
    public int getRaiz() {
        return raiz.dato;
    }

}
