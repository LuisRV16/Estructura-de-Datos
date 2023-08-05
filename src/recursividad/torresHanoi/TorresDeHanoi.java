package Recursividad.Torres_Hanoi;


public class TorresDeHanoi {
    
    int cont = 1;
    
    public void torresHanoi(int discos, char torreA, char torreB, char torreC){
        
        String s = cont + ".- Mover Disco de Torre " + torreA + " a Torre " + torreC;
        
        if (discos > 1) { // Caso General
            
            torresHanoi(discos - 1, torreA, torreC, torreB);
            
            System.out.println(s);
            
            cont++;
            
            torresHanoi(discos - 1, torreB, torreA, torreC);
            
        } else if (discos == 1){ // Caso Base
            
            System.out.println(s);
            
            cont++;
            
        } else if (discos < 0) { // Excepción
            
            System.out.println("No se permiten valores negativos");
            
        }
        
    }
    
}
