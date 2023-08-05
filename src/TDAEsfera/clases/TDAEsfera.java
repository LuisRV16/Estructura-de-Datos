package TDA_Esfera.clases;

//@author LuisR

public class TDAEsfera {
    
    private final double radio;
    
   //Constructor
    
    public TDAEsfera(double radio){
        
        if (radio>0)
            this.radio = radio;
         else 
            this.radio = 0;
        
    }
    
    //Métodos u operaciones del TDA Esfera

    public double getRadio() {
        return radio;
    }
    
    public double getDiametro(){
        return 2*radio;
    }
    
    public double getCircunferencia(){
        return Math.PI * getDiametro();
    }
    
    public double getArea(){
        return 4 * Math.PI * Math.pow(radio, 2);
    }
    
    public double getVolumen(){
        return 4 * Math.PI * Math.pow(radio, 3) / 3;
    }
    
}
