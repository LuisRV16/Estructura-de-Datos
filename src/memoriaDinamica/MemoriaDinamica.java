package Memoria_Dinamica;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MemoriaDinamica {

    public static void main(String[] args) {
        
        ArrayList<String> cadenas; //Se declara el objeto de tipo ArrayList
        cadenas = new ArrayList<>(); //Se crea una nueva instancia de tipo ArrayList
        
        String frase;
        String respuesta;
        
        do {
            
            frase = JOptionPane.showInputDialog(null, "Ingresa la frase: ");
            
            //Agregando la frase a la lista cadenas
            cadenas.add(frase);
            
           respuesta = JOptionPane.showInputDialog(null, "¿Deseas ingresar otra frase? (SI/NO)");
           
           respuesta = respuesta.toUpperCase(); //Se convierte la cadena completa a mayusculas
            
        } while (!respuesta.equals("NO"));
        
        System.out.println("Frases Originales");
        
        for (int i = 0; i < cadenas.size(); i++) {
            System.out.println(cadenas.get(i));
        }
        
        //Utilizando el método set
        
        cadenas.set(1, "La que modifiqué");
        
        //Mostrando el contenido de cadenas modificado
        
        System.out.println("Frases modificadas");
        
        for (int i = 0; i < cadenas.size(); i++) {
            System.out.println(cadenas.get(i));
        }
        
        cadenas.remove(0);
        
        System.out.println("Frases restantes");
        
        for (int i = 0; i < cadenas.size(); i++) {
            System.out.println(cadenas.get(i));
        }
        
    }
    
}
