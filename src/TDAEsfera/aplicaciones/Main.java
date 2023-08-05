package TDA_Esfera.aplicaciones;

import TDA_Esfera.clases.TDAEsfera;


public class Main {
    
    public static void main(String[] args) {
        
        TDAEsfera esfera = new TDAEsfera(4);
        
        System.out.println("Radio: " + esfera.getRadio());
        System.out.println("Diámetro: " + esfera.getDiametro());
        System.out.println("Circunferencia: " + esfera.getCircunferencia());
        System.out.println("Área: " + esfera.getArea());
        System.out.println("Volumen: " + esfera.getVolumen());
        
    }
    
}
