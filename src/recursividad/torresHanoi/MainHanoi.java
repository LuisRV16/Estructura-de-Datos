package Recursividad.Torres_Hanoi;

public class MainHanoi {
    
    public static void main(String[] args) {
        
        TorresDeHanoi torres = new TorresDeHanoi();
        
        torres.torresHanoi(3, 'A', 'B', 'C');
        
        System.out.println("Juego Completado");
        
    }
    
}
