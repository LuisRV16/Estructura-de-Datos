
package Listas.aplicaciones;

import Listas.clases.Lista;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class MainLista {

    public static void main(String[] args) {

        Lista lista = new Lista();

        int opcion = 0, dato;
        String s;

        do {

            try {

                opcion = Integer.parseInt(
                        JOptionPane.showInputDialog(null,
                                """
                                1. Verificar si la lista está vacía.
                                2. Agregar un elemento al inicio de la Lista.
                                3. Agregar un elemento al final de la Lista.
                                4. Eliminar un elemento al inicio de la Lista.
                                5. Eliminar un elemento al final de la Lista.
                                6. Eliminar un elemento en específico.
                                7. Buscar elemento en específico.
                                8. Mostrar Los Datos de la Lista.
                                9. Vaciar Lista.
                                10. Salir"""));
                
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

                        lista.agregarInicio(dato);
                        
                    }
                    
                    case 3 -> {
                        
                        dato = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                "Ingresa el elemento: ","Insertando al final"));
                        
                        lista.agregarFinal(dato);
                        
                    }
                    
                    case 4 -> {
                        
                        if (lista.eliminarInicio())
                            s = "Elemento eliminado.";
                        else
                            s = "Lista vacía. No hay nada que eliminar.";
                        
                        JOptionPane.showMessageDialog(null, s);
                    
                    }
                    
                    case 5 -> {
                        
                        if (lista.eliminarFinal())
                            s = "Elemento eliminado.";
                        else
                            s = "Lista vacía. No hay nada que eliminar.";
                        
                        JOptionPane.showMessageDialog(null, s);
                    
                    }
                    
                    case 6 -> {
                        
                        dato = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el elemento a eliminar: "));
                        
                        if (lista.eliminarEspecifico(dato))
                            s = "Elemento eliminado.";
                        else
                            s = "Elemento no encontrado.";
                        
                        JOptionPane.showMessageDialog(null, s);
                        
                    }
                    
                    case 7 -> {
                        
                        dato = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingrese el que desea buscar: "));
                        
                        if (lista.buscarElemento(dato))
                            s = "El elemento se encuentra en la Lista";
                        else
                            s = "Elemento no encontrado";
                        
                        JOptionPane.showMessageDialog(null, s);
                        
                    }
                        
                    case 8 -> JOptionPane.showMessageDialog(null, lista.mostrarLista());
                    
                    case 9 -> {
                        
                        lista.vaciarLista();
                        
                        JOptionPane.showMessageDialog(null, "La Lista se encuentra vacía.");
                        
                    }
                    
                    case 10 -> JOptionPane.showMessageDialog(null, "La aplicación ha finalizado.\nPulse OK para salir.");
                    
                    default -> JOptionPane.showMessageDialog(null, """
                                                                   Opci\u00f3n no valida.
                                                                   Por favor, eliga una opci\u00f3n valida""");
                    
                }

            } catch (HeadlessException | NumberFormatException e) {
                
                JOptionPane.showMessageDialog(null, "Ingrese sólo valores númericos");
                
                System.out.println("Error: " + e.getMessage());
                
            }

        } while (opcion != 10);

    }

}
