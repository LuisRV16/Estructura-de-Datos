
package Pilas.aplicaciones;

import Pilas.clases.Pila;
import javax.swing.JOptionPane;

public class MainPila {

    public static void main(String[] args) {
        
        int opcion = 0;
        int elemento;
        int tamanio;
        String s;
        
        try {
            
            tamanio = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Introduzca el tamaño de la Pila: ",
                    "Solicitando el tamaño", JOptionPane.INFORMATION_MESSAGE));
            
            Pila pila = new Pila(tamanio);
            
            do {
                
                opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                      1. Empujar un elemento en la Pila.
                                                                      2. Sacar un elemento de la Pila.
                                                                      3. ¿La Pila está vacía?
                                                                      4. ¿La Pila está llena?
                                                                      5. ¿Qué elemento está en la cima?
                                                                      6. Vaciar Pila.
                                                                      7. Tamaño de la Pila.
                                                                      8. Salir.
                                                                      """));
                
                switch(opcion){
                    
                    case 1 -> {
                        
                        if (!pila.isLlena()) {
                            
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Introduzca el elemento: ", "Empujando elemento..."));

                            pila.empujar(elemento);
                            
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "La Pila ha sido llenada.\nNo se pueden introducir más elementos.");
                        }
                                               
                    }
                    
                    case 2 -> {
                        
                        if (!pila.isVacia())
                            s = "Se saco de la pila el elemento: " + pila.sacar();
                        else
                            s = "La Pila está vacía.\nNo hay elemento que sacar.";
                        
                        JOptionPane.showMessageDialog(null, s);
                        
                    }
                    
                    case 3 -> {
                        
                        if (pila.isVacia())
                            s = "La Pila está vacía";
                        else
                            s = "La Pila no está vacía";
                        
                        JOptionPane.showMessageDialog(null, s);
                        
                    }
                    
                    case 4 -> {
                        
                        if (pila.isLlena())
                            s = "La Pila está llena";
                        else
                            s = "La Pila no está llena";
                        
                        JOptionPane.showMessageDialog(null, s);
                        
                    }
                    
                    case 5 -> {
                        
                        if (!pila.isVacia())
                            s = "El elemento en el tope de la Pila es " + pila.topePila();
                        else
                            s = "La Pila está vacía.\nNo hay ningún elemento en el tope.";
                        
                        JOptionPane.showMessageDialog(null, s);
                        
                    }
                    
                    case 6 -> {
                        
                        if (!pila.isVacia()){
                            
                            pila.vaciar();
                            
                            s = "La Pila ha sido vaciada";
                            
                        } else {
                            s = "La Pila está vacía.\nNo hay nada que vaciar.";
                        }
                        
                        JOptionPane.showMessageDialog(null, s);
                        
                    }
                    
                    case 7 -> JOptionPane.showMessageDialog(null, "Tamaño de la pila: " + pila.length());
                    
                    case 8 -> JOptionPane.showMessageDialog(null, "Pulse OK para Salir.");

                    default -> JOptionPane.showMessageDialog(null,
                            "Opción no valida.\nIngrese una opción valida.");
                    
                }
                
            } while (opcion != 8);
            
        } catch (NumberFormatException e) {
            
            JOptionPane.showMessageDialog(null,
                    "Ingrese sólo valores numéricos");
            
            System.out.println("Error: " + e.getMessage());
            
        }
        
    }
    
}
