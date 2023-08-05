package arboles.aplicaciones;

import arboles.clases.ArbolBinario;
import arboles.clases.Nodo;

import javax.swing.JOptionPane;

public class MainArbolBinario {

    public static void main(String[] args) {

        int opcion = 0;
        int elemento;

        ArbolBinario arbol = new ArbolBinario();

        do {

            try {

                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        """
                        1. Verifica si el árbol está vacío.
                        2. Agregar un Nodo.
                        3. Eliminar un Nodo.
                        4. Recorrer en InOrden.
                        5. Recorrer en PreOrden.
                        6. Recorrer en PostOrden.
                        7. Buscar un elemento específico.
                        8. Obtener el valor en la raíz.
                        9. Salir.
                        
                        Elige una opción:
                        """,
                        "Árboles Binarios",
                        JOptionPane.QUESTION_MESSAGE));

                String s;

                switch (opcion) {

                    case 1 -> {

                        if (arbol.estaVacio())
                            s = "El árbol está vacío.";
                        else
                            s = "El árbol no está vacío.";

                        JOptionPane.showMessageDialog(null, s);

                    }

                    case 2 -> {

                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el valor del Nodo: ", "Agregando Nodo...", JOptionPane.QUESTION_MESSAGE));
                        
                        if (arbol.estaVacio()) {
                            arbol.agregar(elemento);
                        } else {
                            
                            Nodo nodo = arbol.busqueda(elemento);
                            
                            if (nodo == null)
                                arbol.agregar(elemento);
                            else
                                JOptionPane.showMessageDialog(null,
                                        "El elemento ya está existe en el árbol.\nNo se permiten elementos repetidos.");
                            
                        }
                        
                    }
                    
                    case 3 -> {
                        
                        if (!arbol.estaVacio()) {
                            
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el valor del Nodo: ", "Eliminando Nodo...", JOptionPane.QUESTION_MESSAGE));
                            
                            boolean band = arbol.eliminar(elemento);
                            
                            if (band)
                                s = "El Nodo ha sido eliminado.";
                            else
                                s = "El Nodo no ha sido encontrado.";
                            
                        } else {
                            s = "El árbol está vacío.\nNo hay nada que eliminar.";
                        }
                        
                        JOptionPane.showMessageDialog(null, s);
                        
                    }

                    case 4 -> {

                        if (!arbol.estaVacio()) {

                            arbol.inOrden(arbol.raiz());

                            System.out.println("");

                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "El árbol está vacío.\nNo hay elementos que mostrar");
                        }

                    }

                    case 5 -> {

                        if (!arbol.estaVacio()) {

                            arbol.preOrden(arbol.raiz());

                            System.out.println("");

                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "El árbol está vacío.\nNo hay elementos que mostrar");
                        }

                    }

                    case 6 -> {

                        if (!arbol.estaVacio()) {

                            arbol.postOrden(arbol.raiz());

                            System.out.println("");

                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "El árbol está vacío.\nNo hay elementos que mostrar");
                        }

                    }

                    case 7 -> {

                        if (!arbol.estaVacio()) {

                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingresa el elemento a buscar: ", "Buscando...", JOptionPane.QUESTION_MESSAGE));

                            Nodo nodo = arbol.busqueda(elemento);

                            if (nodo != null)
                                s = "¡Nodo encontrado!\n" + nodo.toString();
                            else
                                s = "El elemento no se encuentra en el árbol.";

                        } else {
                            s = "El árbol está vacío.\nNo hay nada que buscar.";
                        }

                        JOptionPane.showMessageDialog(null, s);

                    }

                    case 8 -> {

                        if (!arbol.estaVacio())
                            s = "El elemento que se encuentra en la raíz es " + arbol.getRaiz();
                        else
                            s = "El árbol está vacío.\nNo hay ningún elemento en la raíz.";

                        JOptionPane.showMessageDialog(null, s);

                    }

                    case 9 ->
                        JOptionPane.showMessageDialog(null, "Árbol Finalizado.\nPulse OK para salir.");

                    default ->
                        JOptionPane.showMessageDialog(null, "Opción no valida.\nIntroduzca otra opción...");

                }

            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (opcion != 9);

    }

}
