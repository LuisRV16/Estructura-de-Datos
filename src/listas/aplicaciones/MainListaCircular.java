
package Listas.aplicaciones;

import Listas.clases.ListaCircular;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class MainListaCircular {

    public static void main(String[] args) {
        
        ListaCircular lista = new ListaCircular();
        
        int opcion = 0;
        int dato;
        String s;

        do {

            try {

                opcion = Integer.parseInt(
                        JOptionPane.showInputDialog(null,
                                """
                                1. Verificar si la lista está vacía.
                                2. Agregar un elemento a la Lista.
                                3. Eliminar un elemento de la Lista.
                                4. Mostrar los elementos de la Lista.
                                5. Salir"""));
                
                switch(opcion){
                    
                    case 1 -> {
                        
                        if (!lista.estaVacia())
                            s = "La lista no está vacía";
                        else
                            s = "La lista está vacía";
                        
                        JOptionPane.showMessageDialog(null, s);
                    }
                    
                    case 2 -> {
                        
                        dato = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el elemento: ", "Insertando al inicio"));

                        lista.agregar(dato);
                        
                    }
                    
                    case 3 -> {
                        
                        if(lista.estaVacia()) {
                            s = "La lista está vacía.\nNo hay nada que eliminar.";
                        } else {

                            dato = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingresa el elemento a eliminar: "));

                            if (lista.eliminar(dato))
                                s = "El elemento ha sido eliminado";
                            else
                                s = "El elemento no se encuentra en la Lista";
                            
                        }
                        
                        JOptionPane.showMessageDialog(null, s);
                        
                    }
                    
                    case 4 -> {
                    
                        if (!lista.estaVacia())
                            lista.mostarLista();
                        else
                            JOptionPane.showMessageDialog(null, 
                                    "La lista se encuentra vacía.\nNo hay nada que mostrar");
                    }
                    
                    case 5 -> JOptionPane.showMessageDialog(null, 
                            "La aplicación ha finalizado.\nPulse OK para salir.");
                    
                    default -> JOptionPane.showMessageDialog(null, """
                                                                   Opci\u00f3n no valida.
                                                                   Por favor, eliga una opci\u00f3n valida""");
                    
                }

            } catch (HeadlessException | NumberFormatException e) {
                
                JOptionPane.showMessageDialog(null, "Ingrese sólo valores númericos");
                
                System.out.println("Error: " + e.getMessage());
                
            }

        } while (opcion != 5);

    }

}

