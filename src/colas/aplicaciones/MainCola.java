
package Colas.aplicaciones;

import Colas.clases.Cola;
import javax.swing.JOptionPane;

public class MainCola {
    
    public static void main(String[] args) {

        int option = 0;
        int element;
        String s;

        try {

            Cola queue = new Cola();

            do {

                option = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                      1. Insertar un elemento en la Cola.
                                                                      2. Sacar un elemento de la Cola.
                                                                      3. ¿La Cola está vacía?
                                                                      4. ¿Qué elemento está en el inico de la Cola?
                                                                      5. Tamaño de la Cola.
                                                                      6. Vaciar Cola.
                                                                      7. Salir.
                                                                      """));

                switch (option) {

                    case 1 -> {

                        element = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Introduzca el elemento: ", "Insertando elemento..."));
                        
                        queue.add(element);

                    }

                    case 2 -> {

                        if (!queue.isEmpty())
                            s = "Se saco de la Cola el elemento: " + queue.remove();
                        else
                            s = "La Cola está vacía.\nNo hay elemento que sacar.";

                        JOptionPane.showMessageDialog(null, s);

                    }

                    case 3 -> {

                        if (queue.isEmpty())
                            s = "La Cola está vacía";
                        else
                            s = "La Cola no está vacía";

                        JOptionPane.showMessageDialog(null, s);

                    }

                    case 4 -> {

                        if (!queue.isEmpty())
                            s = "El elemento en el inicio de la Cola es " + queue.peek();
                        else
                            s = "La Cola está vacía.\nNo hay ningún elemento en el tope.";

                        JOptionPane.showMessageDialog(null, s);

                    }
                    
                    case 5 -> JOptionPane.showMessageDialog(null, "Tamaño de la Cola: " + queue.size());

                    case 6 -> {
                        
                        if (!queue.isEmpty()) {
                            
                            queue.clear();
                            
                            s = "La Cola ha sido vaciada";
                            
                        } else {                            
                            s = "La Cola está vacía.\nNo hay nada que vaciar.";              
                        }

                        JOptionPane.showMessageDialog(null, s);
                        
                    }

                    case 7 -> JOptionPane.showMessageDialog(null, "Pulse OK para Salir.");

                    default -> JOptionPane.showMessageDialog(null,
                                "Opción no valida.\nIngrese una opción valida.");

                }

            } while (option != 7);

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null,
                    "Ingrese sólo valores numéricos");

            System.out.println("Error: " + e.getMessage());

        }

    }

}
