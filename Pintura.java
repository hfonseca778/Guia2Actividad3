
/**
 * Write a description of class Panete here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pintura
{
    private double area = 30; //Dice la norma que, en promedio, un cuñete de pintura alcanza para pintar 30 mts2 de area
    private int cuneteXarea = 1;
    private double altoMuro;
    private double largoMuro;
    private double precioCunete;
    
    public Pintura (){
       
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
    
    public void setPrecioCunete (double precioCunete){
        this.precioCunete = precioCunete;               
    }
    
    public double getPrecioCunete(){
        return this.precioCunete;        
    }
    
    public double getNumCunetesXarea(){
        double mArea = this.altoMuro * this.largoMuro;
        double mCunetes = mArea / area;
        return mCunetes;        
    }
    
    public double getPrecioCunetesXarea(){
        double precioTotalCunetes = getNumCunetesXarea() * this.precioCunete;
        return precioTotalCunetes;        
    }
}
