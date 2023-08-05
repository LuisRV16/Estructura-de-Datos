
package Listas.aplicaciones;

import Listas.clases.ListaDoble;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class MainListaDoble {

    public static void main(String[] args) {

        ListaDoble lista = new ListaDoble();

        int opcion = 0;
        Object dato;
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
                                8. Mostrar los Datos de la Lista de Inicio a Fin.
                                9. Mostrar los Datos de la Lista de Fin a Inicio.
                                10. Vaciar Lista.
                                11. Salir"""));
                
                switch(opcion){
                    
                    case 1 -> {
                        
                        if (!lista.estaVacia())
                            s = "La lista no está vacía";
                        else
                            s = "La lista está vacía";
                        
                        JOptionPane.showMessageDialog(null, s);
                    }
                    
                    case 2 -> {
                        
                        dato = JOptionPane.showInputDialog(null,
                                "Ingresa el elemento: ", "Insertando al inicio");

                        lista.agregarInicio(dato);
                        
                    }
                    
                    case 3 -> {
                        
                        dato = JOptionPane.showInputDialog(null, 
                                "Ingresa el elemento: ","Insertando al final");
                        
                        lista.agregarFinal(dato);
                        
                    }
                    
                    case 4 -> {
                        
                        dato = lista.eliminarInicio();
                        
                        if (dato != null)
                            s = "El elemento" + dato + "ha sido eliminado.";
                        else
                            s = "La Lista está vacía.\nNo hay nada que eliminar";
                        
                        JOptionPane.showMessageDialog(null, s);
                    
                    }
                    
                    case 5 -> {
                        
                        dato = lista.eliminarFinal();
                        
                        if (dato != null)
                            s = "El elemento" + dato + "ha sido eliminado.";
                        else
                            s = "La Lista está vacía.\nNo hay nada que eliminar";
                        
                        JOptionPane.showMessageDialog(null, s);
                    
                    }
                    
                    case 6 -> {
                        
                        dato = JOptionPane.showInputDialog(null,
                                "Ingresa el elemento a eliminar: ");
                        
                        dato = lista.eliminarEspecifico(dato);
                        
                        if (dato != null)
                            s = "El elemento" + dato + "ha sido eliminado.";
                        else
                            s = "La Lista está vacía.\nNo hay nada que eliminar";
                        
                        JOptionPane.showMessageDialog(null, lista.eliminarEspecifico(dato));
                        
                    }
                    
                    case 7 -> {
                        
                        dato = JOptionPane.showInputDialog(null,
                                "Ingrese el dato que desea buscar: ");
                        
                        if (lista.buscarElemento(dato))
                            s = "El elemento se encuentra en la Lista";
                        else
                            s = "Elemento no encontrado";
                        
                        JOptionPane.showMessageDialog(null, s);
                        
                    }
                        
                    case 8 -> JOptionPane.showMessageDialog(null, lista.mostrarInicioAFin());
                    
                    case 9 -> JOptionPane.showMessageDialog(null, lista.mostrarFinAInicio());
                    
                    case 10 -> {
                        
                        lista.vaciarLista();
                        
                        JOptionPane.showMessageDialog(null, "La Lista se encuentra vacía.");
                        
                    }
                    
                    case 11 -> JOptionPane.showMessageDialog(null, "La aplicación ha finalizado.\nPulse OK para salir.");
                    
                    default -> JOptionPane.showMessageDialog(null, """
                                                                   Opci\u00f3n no valida.
                                                                   Por favor, eliga una opci\u00f3n valida""");
                    
                }

            } catch (HeadlessException | NumberFormatException e) {
                
                JOptionPane.showMessageDialog(null, "Ingrese sólo valores númericos");
                
                System.out.println("Error: " + e.getMessage());
                
            }

        } while (opcion != 11);

    }

}
