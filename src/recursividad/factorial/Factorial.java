package Recursividad.Factorial;

public class Factorial {
    
    /* 
     * Los primeros dos algoritmos son equivalente en terminos de rendimiento
     * El tercer algoritmo es más eficiente, ya que evita llamadas innecesarias
     */
    
//    public int factorial(int n){
//        
//        if (n < 0)
//            return 0;
//        else if (n == 0)
//            return 1;
//        else
//            return n * factorial(n-1);
//        
//    }
//    
//    public int factorial(int n){
//        
//        if (n < 0) {
//            return 0;
//        } else {
//            if (n == 0)
//                return 1;
//            else
//                return n * factorial(n-1);
//        }
//        
//    }
    
    public int factorial(int n){
        
        if(n > 0)
            return n * factorial(n-1);
        else if (n == 0)
            return 1;
        else
            return 0;
        
    }
    
    public int factorialCiclo(int n){
        
        int factor = 1;
        
        if (n > 0) {
            while(n != 0){
                factor *= n;
                n--;
            }
        } else {
            return 0;
        }
        
        return factor;
        
    }
    
}
