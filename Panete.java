
/**
 * Write a description of class Panete here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Panete
{
    private double area = 2.5; //Dice la norma que 1 bulto de cemento alcanza para pañetar, en promedio, 2.5 mts2 de area con pañete de 2cm de grosor   
    private int bultoXarea = 1;
    private double altoMuro;
    private double largoMuro;
    private double precioBulto = 0;
    
    public Panete (){
       
    }
    
    public void setAltoMuro (double altoMuro){
        this.altoMuro = altoMuro;               
    }
    
    public double getAltoMuro (){
        return this.altoMuro;        
    }
    
    public void setLargoMuro (double largoMuro){
        this.largoMuro = largoMuro;               
    }
    
    public double getLargoMuro (){
        return this.largoMuro;        
    }
    
    public void setPrecioBulto (double precioBulto){
        this.precioBulto = precioBulto;               
    }
    
    public double getPrecioBulto(){
        return this.precioBulto;        
    }
    
    public double getNumBultosXarea(){
        double mArea = this.altoMuro * this.largoMuro;
        double mBultos = mArea / area;
        return mBultos;        
    }
    
    public double getPrecioBultosXarea(){
        double precioTotalbultos = getNumBultosXarea() * this.precioBulto;
        return precioTotalbultos;        
    }
}
