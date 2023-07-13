package agencia;

import javax.swing.JOptionPane;

public class Agencia {

    public void menu(){
        byte opc=1;
        ventaVehiculo obj = new ventaVehiculo ();
        Vehiculo matCarros[][]= new Vehiculo [2][2];
        while (opc>=1 && opc<7){
            opc= Byte.parseByte(JOptionPane.showInputDialog("1. Realizar ventas\n2.Impresión\n3.imprimir extras\n4.Vehiculos que superan los 25millones\n5.Vehiculos verde\n6.Vehiculo más caro\n7.Salir\nDigite su opción"));
            switch(opc){
                case 1: obj.venta(matCarros);
                    break;
                case 2:obj.imprimeVenta(matCarros);
                    break;
                case 3:obj.imprimeExtras(matCarros);
                    break;
                case 4:obj.precioAlto(matCarros);
                    break;
                case 5: obj.vehiculosVerde(matCarros);
                    break;
                case 6: obj.autoMasCaro(matCarros);
                    break;
                default: System.out.println("Saliendo del sistema.");
            }//close switch
        }//close while
        
    }//close menu
    public static void main(String[] args) {
      Agencia objAgencia = new Agencia();
      objAgencia.menu();
    }
    
}
