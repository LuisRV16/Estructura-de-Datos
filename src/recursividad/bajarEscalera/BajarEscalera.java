package Recursividad.Bajar_Escalera;

public class BajarEscalera {
    
    public static void main(String[] args) {
        bajarEscalera(1000);
    }
    
    private static void bajarEscalera(int escalones){
        
        if (escalones > 0) {
            // Dominio, división del problema original (problema-1)
            System.out.println("Bajando Escalon " + escalones);
            // Haciendo uso de la recursividad
            bajarEscalera(escalones-1);
        } else if (escalones == 0) {
            // Caso Base | Respuesta Explicita
            System.out.println("Has terminado de Bajar la Escalera");
        } else {
            System.out.println("No se pueden bajar escalones negativos");
        }
            
    }
    
}
