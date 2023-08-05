package Pilas.aplicaciones;

import Pilas.clases.PilaDinamica;
import javax.swing.JOptionPane;

public class MainPilaDinamica {

    public static void main(String[] args) {

        int option = 0;
        int element;
        String s;

        try {

            PilaDinamica stack = new PilaDinamica();

            do {

                option = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                      1. Empujar un elemento en la Pila.
                                                                      2. Sacar un elemento de la Pila.
                                                                      3. ¿La Pila está vacía?
                                                                      4. ¿Qué elemento está en el tope?
                                                                      5. Tamaño de la Pila.
                                                                      6. Vaciar Pila.
                                                                      7. Salir.
                                                                      """));

                switch (option) {

                    case 1 -> {

                        element = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Introduzca el elemento: ", "Empujando elemento..."));

                        stack.push(element);

                    }

                    case 2 -> {

                        if (!stack.isEmpty())
                            s = "Se saco de la pila el elemento: " + stack.pop();
                        else
                            s = "La Pila está vacía.\nNo hay elemento que sacar.";

                        JOptionPane.showMessageDialog(null, s);

                    }

                    case 3 -> {

                        if (stack.isEmpty())
                            s = "La Pila está vacía";
                        else
                            s = "La Pila no está vacía";

                        JOptionPane.showMessageDialog(null, s);

                    }

                    case 4 -> {

                        if (!stack.isEmpty())
                            s = "El elemento en el tope de la Pila es " + stack.getTop();
                        else
                            s = "La Pila está vacía.\nNo hay ningún elemento en el tope.";

                        JOptionPane.showMessageDialog(null, s);

                    }
                    
                    case 5 -> JOptionPane.showMessageDialog(null, "Tamaño de la pila: " + stack.size());

                    case 6 -> {
                        
                        if (!stack.isEmpty()) {
                            
                            stack.clear();
                            
                            s = "La Pila ha sido vaciada";
                            
                        } else {                            
                            s = "La Pila está vacía.\nNo hay nada que vaciar.";              
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
