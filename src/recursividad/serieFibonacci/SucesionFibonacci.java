
package Recursividad.SerieFibonacci;

public class SucesionFibonacci {
    
    public String sucesionFibonacci(int n, int ant, int act){
        
        if (n > 1) {
            
            return act + ", " + sucesionFibonacci(n-1, act, ant+act);
            
        }else if (n == 1){
            return String.valueOf(act);
        } else {
            return "No se permite 0 o valores negativos";
        }
        
    }
    
}
