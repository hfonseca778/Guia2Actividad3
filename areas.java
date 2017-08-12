/**
 * Programa que calcula el costo de hacer un muro
 * 
 * @author hfonseca778
 * @version 11-08-2017
 */
import  java.lang.Math;
import java.util.Scanner;
public class areas
    {
   public static void main(String args[]){
       Scanner lector=new Scanner(System.in);
       int numeroMuros = 0;
       int i = 1;
       double alto = 0;
       double largo = 0;
       int OpcionLadrillo = 0;
       int salir = 1;
       
       double precioBulto;
       double precioCunete;
       double precioLadrillo;
       double valorLadrillo1 = 0;
       double valorLadrillo2 = 0;
       double valorLadrillo3 = 0;
       double precioTotalLadrillo1 = 0;
       double precioTotalLadrillo2 = 0;
       double precioTotalLadrillo3 = 0;
       double precioTotalBultos = 0;
       double precioTotalCunetes = 0;
      
       
       double precioTotalLadrillos = 0;
       
       
       double precioTotalPanetes = 0;
       double precioTotalPinturas = 0;
       double totalPanetes = 0;
       double totalPinturas = 0;
       double totalLadrillo1 = 0;
       double totalLadrillo2 = 0;
       double totalLadrillo3 = 0;
       
       System.out.print("\f");
       
       System.out.println("Número de muros a calcular: "); 
       numeroMuros = lector.nextInt();
       
       
       System.out.println("\nPrecio del bulto de cemento hoy: "); 
       precioBulto = Double.parseDouble(lector.next());
       
       System.out.println("\nPrecio del cuñete de pintura hoy: "); 
       precioCunete = Double.parseDouble(lector.next());
       
       System.out.println("\n--------------------------------------------" );
       
       do{
        
       System.out.println("\nIntroduce la altura del muro " + i + " :" ); 
       alto = Double.parseDouble(lector.next());
       
       System.out.println("\nIntroduce el largo del muro " + i + " :");
       largo = Double.parseDouble(lector.next());
       
       Panete mPanete = new Panete();
       mPanete.setLargoMuro(largo);
       mPanete.setAltoMuro(alto);
       
       
       Pintura mPintura = new Pintura();
       mPintura.setLargoMuro(largo);
       mPintura.setAltoMuro(alto);
       
       
       do {
           System.out.println("\nQue ladrillo quiere utilizar?:");
           System.out.println("1. Ladrillo Gran Formato");
           System.out.println("2. Bloque #4 estandar");
           System.out.println("3. Bloque #5 estandar");
           System.out.println("Seleccione su opción: ");
           OpcionLadrillo = lector.nextInt();
           if (OpcionLadrillo == 1)
               {
               System.out.println("Seleccionaste la opción Ladrillo Gran Formato");
               System.out.println("Sus medidas son: 39cm de largo, 11,5cm de ancho y 5cm de alto.\n");
               
               Ladrillo mLadrillo = new Ladrillo(0.39,0.115,0.05);
               
               mLadrillo.setLargoMuro(largo);
               mLadrillo.setAltoMuro(alto);
               mLadrillo.setRendimientoLadrillo(41.7);
               
               System.out.println("Precio del Ladrillo Gran Formato: "); 
               precioLadrillo = Double.parseDouble(lector.next());
               mLadrillo.setPrecioLadrillo(precioLadrillo);
               
               double LadrillosTotales = mLadrillo.getNumLadrillosXarea();
               System.out.println("\nLadrillos Totales para el muro " + i + " : "  + LadrillosTotales + " Ladrillos");
               
               totalLadrillo1 = totalLadrillo1 + LadrillosTotales; // Acá sumamos todos los ladrillos del tipo 1 que se usan en todos los muros 
               
               valorLadrillo1 = mLadrillo.getPrecioLadrilloXarea();
               System.out.println("\nValor total de los ladrillos del muro " + i + " : $" + valorLadrillo1 + " pesos");
               
               precioTotalLadrillo1 = precioTotalLadrillo1 + valorLadrillo1; // Acá sumamos el precio de todos los ladrillos del tipo 1 que se usan en todos los muros 
               
               
               
               break;
               }
            else if(OpcionLadrillo == 2)
               {
               System.out.println("Seleccionaste la opción Bloque #4 Estandar");
               System.out.println("Sus medidas son: 30cm de largo, 20cm de ancho y 10cm de alto.\n");
               
               Ladrillo mLadrillo = new Ladrillo(0.3,0.2,0.1);
               mLadrillo.setLargoMuro(largo);
               mLadrillo.setAltoMuro(alto);
               mLadrillo.setRendimientoLadrillo(16.7);
               System.out.println("Precio del Bloque #4 Estandar: "); 
               precioLadrillo = Double.parseDouble(lector.next());
               mLadrillo.setPrecioLadrillo(precioLadrillo);
               
               double LadrillosTotales = mLadrillo.getNumLadrillosXarea();
               System.out.println("\nLadrillos Totales para el muro " + i + " : "  + LadrillosTotales + " Ladrillos");
               
               totalLadrillo2 = totalLadrillo2 + LadrillosTotales; // Acá sumamos todos los ladrillos del tipo 1 que se usan en todos los muros 
               
               valorLadrillo2 = mLadrillo.getPrecioLadrilloXarea();
               System.out.println("\nValor total de los ladrillos del muro " + i + " : $" + valorLadrillo2 + " pesos");
               
               precioTotalLadrillo2 = precioTotalLadrillo2 + valorLadrillo2; // Acá sumamos el precio de todos los ladrillos del tipo 1 que se usan en todos los muros 
               
               
               break;
                
               }
           else if(OpcionLadrillo == 3)
               {
               System.out.println("Seleccionaste la opción Bloque #5 Estandar");
               System.out.println("Sus medidas son: 30cm de largo, 20cm de ancho y 12cm de alto.\n");
               
               Ladrillo mLadrillo = new Ladrillo(0.3,0.2,0.12);
               mLadrillo.setLargoMuro(largo);
               mLadrillo.setAltoMuro(alto);
               mLadrillo.setRendimientoLadrillo(15.5);
               System.out.println("\nPrecio del Bloque #5 Estandar: "); 
               precioLadrillo = Double.parseDouble(lector.next());
               mLadrillo.setPrecioLadrillo(precioLadrillo);
               
               double LadrillosTotales = mLadrillo.getNumLadrillosXarea();
               System.out.println("\nLadrillos Totales para el muro " + i + " : "  + LadrillosTotales + " Ladrillos");
               
               totalLadrillo3 = totalLadrillo3 + LadrillosTotales; // Acá sumamos todos los ladrillos del tipo 1 que se usan en todos los muros 
               
               valorLadrillo3 = mLadrillo.getPrecioLadrilloXarea();
               System.out.println("\nValor total de los ladrillos del muro " + i + " : $" + valorLadrillo1 + " pesos");
               
               precioTotalLadrillo3 = precioTotalLadrillo3 + valorLadrillo3; // Acá sumamos el precio de todos los ladrillos del tipo 1 que se usan en todos los muros 
               
               
               break;
                   
               }
           else
               {
                System.out.println("Opción no valida\n");
                
               }           
           }
           
       while (salir == 1);
       
           double BultosTotales = mPanete.getNumBultosXarea();
           System.out.println("\nBultos Totales:  " + BultosTotales + " bultos");
           mPanete.setPrecioBulto(precioBulto);
           
           totalPanetes = totalPanetes + BultosTotales; // Acá sumamos todos los bultos que se usan en todo el pañete
           
           precioTotalBultos = mPanete.getPrecioBultosXarea();
           System.out.println("\nEl cemento del pañete vale: $" + precioTotalBultos + " pesos");
           
           precioTotalPanetes = precioTotalPanetes + precioTotalBultos; 
       
           double CunetesTotales = mPintura.getNumCunetesXarea();
           System.out.println("\nCuñetes Totales:  " + CunetesTotales + " Cuñetes");
           mPintura.setPrecioCunete(precioCunete);
           
           totalPinturas = totalPinturas + CunetesTotales; // Acá sumamos todos los bultos que se usan en todo el pañete
           
           precioTotalCunetes = mPintura.getPrecioCunetesXarea();
           System.out.println("\nLa pintura total vale: $" + precioTotalCunetes + " pesos");
           
           precioTotalPinturas = precioTotalPinturas + precioTotalCunetes; 
           
           
           System.out.println("\n--------------------------------------------" );
           
           i++;
           
        }
        while (i != (numeroMuros + 1));
       
        System.out.println("\n--------------------------------------------" );
        
        System.out.println("\nTotal bultos de cemento requeridos para todo el proyecto: " + totalPanetes + " bultos" );
        System.out.println("\nTotal cuñetes de pintura requeridos para todo el proyecto: " + totalPinturas + " cuñetes" );
        System.out.println("\nTotal de Ladrillos Gran formato requeridos para todo el proyecto: " + totalLadrillo1 + " Ladrillos" );
        System.out.println("\nTotal de Bloques #4 requeridos para todo el proyecto: " + totalLadrillo2 + " Bloques #4" );
        System.out.println("\nTotal de Bloques #5 requeridos para todo el proyecto: " + totalLadrillo3 + " Bloques #5" );
        
        precioTotalLadrillos = precioTotalLadrillo1 + precioTotalLadrillo2 + precioTotalLadrillo3;
        
        double precioTotalmateriales = precioTotalLadrillos + precioTotalPanetes + precioTotalPinturas;
        System.out.println("\nValor materiales: $" + precioTotalmateriales + " pesos" );
        
        double manoDeObra = precioTotalmateriales / 2; //Dice la norma que la mano de obra es 1/3 del valor total de un proyecto, eso quiere decir que los materiales son 2/3 partes del costo
        System.out.println("\nValor Mano de Obra: $" + manoDeObra + " pesos");
        
        double totalDinero = manoDeObra + precioTotalmateriales;
        System.out.println("\nDinero total requerido para el proyecto: $" + totalDinero + " pesos");
       
       
   }
}
