package agencia;

import javax.swing.JOptionPane;


public class ventaVehiculo{
    
    public void venta(Vehiculo matCarros[][]){
        for(int fila=0; fila<matCarros.length; fila++){
        for(int columna=0; columna<matCarros[fila].length; columna++){
            matCarros[fila][columna] = new Vehiculo ();
            matCarros[fila][columna].setPlaca(JOptionPane.showInputDialog("Digite la placa"));
            matCarros[fila][columna].setModelo(JOptionPane.showInputDialog("Digite el modelo"));
            matCarros[fila][columna].setColor(JOptionPane.showInputDialog("Digite el color"));
            matCarros[fila][columna].setPrecioVehiculo(Float.parseFloat(JOptionPane.showInputDialog("Digite el precio")));
            byte extra=Byte.parseByte(JOptionPane.showInputDialog("1. Extra\n2.Sin extra\nDigite su opción"));
            if (extra==1)
                matCarros[fila][columna].setExtras(true);
            else 
                matCarros[fila][columna].setExtras(false);
        }//close for columna    
        }//close for
        
    }//close venta

    public void imprimeVenta(Vehiculo matCarros[][]){
        System.out.println("AUTOS VENDIDOS ");
        for(int fila=0; fila<matCarros.length; fila++){
        for(int columna=0; columna<matCarros[fila].length; columna++){
            System.out.println("Placa: "+matCarros[fila][columna].getPlaca());
            System.out.println("Modelo: "+matCarros[fila][columna].getModelo());
            System.out.println("Precio: "+matCarros[fila][columna].getPrecioVehiculo());
            System.out.println("Color: "+matCarros[fila][columna].getColor());
            if (matCarros[fila][columna].isExtras()==true) //si no se pone ==true de igual manera se compara automaticamente con el true
                System.out.println("Tiene extras");
            else
                System.out.println("No tiene extras");
        }//close columna
        }//close fila
    }//close imprimeVenta
    
    public void imprimeExtras(Vehiculo matCarros[][]){
        System.out.println("VEHICULOS QUE TIENEN EXTRAS ");
        for(int fila=0; fila<matCarros.length; fila++){
        for(int columna=0; columna<matCarros[fila].length; columna++){
            if(matCarros[fila][columna].isExtras()){
             System.out.println("Placa: "+matCarros[fila][columna].getPlaca());
             System.out.println("Modelo: "+matCarros[fila][columna].getModelo());
             System.out.println("Precio: "+matCarros[fila][columna].getPrecioVehiculo());
             System.out.println("Color: "+matCarros[fila][columna].getColor());
            if (matCarros[fila][columna].isExtras()==true) //si no se pone ==true de igual manera se compara automaticamente con el true
                System.out.println("Tiene extras");
            else
                System.out.println("No tiene extras");}
        }//close columna  
        }//close fila
     }//close imprimeExtras
    
    public void precioAlto(Vehiculo matCarros[][]){
      System.out.println("VEHICULOS QUE SUPERAN LOS 25 MILLONES: ");
       for(int fila=0; fila<matCarros.length; fila++){
        for(int columna=0; columna<matCarros[fila].length; columna++){
        if(matCarros[fila][columna].getPrecioVehiculo()>25000000){
            System.out.println("Placa: "+matCarros[fila][columna].getPlaca());
            System.out.println("Modelo: "+matCarros[fila][columna].getModelo());
            System.out.println("Precio: "+matCarros[fila][columna].getPrecioVehiculo());
            System.out.println("Color: "+matCarros[fila][columna].getColor()); 
        if (matCarros[fila][columna].isExtras()==true) //si no se pone ==true de igual manera se compara automaticamente con el true
                System.out.println("Tiene extras");
            else
                System.out.println("No tiene extras");}//close if
       }//close columna
      }//close fila 
    }//close precioAlto       
    
    public void vehiculosVerde(Vehiculo matCarros[][]){
        System.out.println("VEHICULOS VERDES: "); 
        for(int fila=0; fila<matCarros.length; fila++){
        for(int columna=0; columna<matCarros[fila].length; columna++){
        if(matCarros[fila][columna].getColor().equals("verde")){
            System.out.println("Placa: "+matCarros[fila][columna].getPlaca());
            System.out.println("Modelo: "+matCarros[fila][columna].getModelo());
            System.out.println("Precio: "+matCarros[fila][columna].getPrecioVehiculo());
            System.out.println("Color: "+matCarros[fila][columna].getColor());if (matCarros[fila][columna].isExtras()==true) //si no se pone ==true de igual manera se compara automaticamente con el true
                System.out.println("Tiene extras");
            else
                System.out.println("No tiene extras"); }//close if
       }//close columna
      }//close fila 
        
    }//close vehiculosVerde
    
    public void autoMasCaro(Vehiculo matCarros[][]){
        float caro= matCarros[0][0].getPrecioVehiculo();
        int fil=0;
        int col=0;
        for(int fila=0; fila<matCarros.length; fila++){
        for(int columna=0; columna<matCarros[fila].length; columna++){
        if(matCarros[fila][columna].getPrecioVehiculo()>caro){
            fil=fila;
            col=columna;
              }//close if
                }//close columna
         }//close fila
       
            System.out.println("Placa: "+matCarros[fil][col].getPlaca());
            System.out.println("Modelo: "+matCarros[fil][col].getModelo());
            System.out.println("Precio: "+matCarros[fil][col].getPrecioVehiculo());
            System.out.println("Color: "+matCarros[fil][col].getColor());
        if (matCarros[fil][col].isExtras()==true) //si no se pone ==true de igual manera se compara automaticamente con el true
                System.out.println("Tiene extras");
            else
                System.out.println("No tiene extras");}//close if
            
    //autoMasCaro
}//close ventaVehiculo
