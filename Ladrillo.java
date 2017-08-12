/**
 * Write a description of class Ladrillos here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ladrillo
{
    private double largoLadrillo = 0;
    private double altoLadrillo = 0;
    private double anchoLadrillo = 0;
    private double rendimientoLadrillo = 0;
    private double altoMuro;
    private double largoMuro;
    private double precioLadrillo;
    
    public Ladrillo (double largoLadrillo, double altoLadrillo, double anchoLadrillo){
       this.largoLadrillo = largoLadrillo;
       this.altoLadrillo = altoLadrillo;
       this.anchoLadrillo = anchoLadrillo;       
    }
    
    public double getLargoLadrillo(){
        return this.largoLadrillo;
    }
    
    public double getAnchoLadrillo(){
    return this.anchoLadrillo;
    }
    
    public double getAltoLadrillo(){
    return this.altoLadrillo;
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
    
    public void setPrecioLadrillo (double precioLadrillo){
        this.precioLadrillo = precioLadrillo;               
    }
    
    public double getPrecioLadrillo(){
        return this.precioLadrillo;        
    }
    
    public void setRendimientoLadrillo (double rendimientoLadrillo){
        this.rendimientoLadrillo = rendimientoLadrillo;
    }
    
    public double getNumLadrillosXarea(){
        double mArea = this.altoMuro * this.largoMuro;
        double mLadrillos = mArea * rendimientoLadrillo;
        return mLadrillos;        
    }
    
    public double getPrecioLadrilloXarea(){
        double precioTotalLadrillo = getNumLadrillosXarea() * this.precioLadrillo;
        return precioTotalLadrillo;        
    }
    
    
}