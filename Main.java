/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onready;

import java.util.Arrays;

/**
 *
 * @author Federico
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         
        
        
        Vehiculo[] arrayVehiculo = new Vehiculo [4];
        arrayVehiculo[0] = new Vehiculo ("Peugeot", "206", 4 , " ", 200000.00);
        arrayVehiculo[1] = new Vehiculo ("Honda", "Titan", 0 , " 125cc ", 60000.00);
        arrayVehiculo[2] = new Vehiculo ("Peugeot", "208", 5 , " ", 250000.00);
        arrayVehiculo[3] = new Vehiculo ("Yamaha", "YBR", 0 , " 160cc ", 80500.50);
        
        
        Vehiculo.imprimeArrayAuto(arrayVehiculo);
        
        
        System.out.println("============================");
        
        
        double max, min;
        min = max = arrayVehiculo[0].precio;
        
        for (int i=0; i<arrayVehiculo.length; i++){
            if (arrayVehiculo[i].precio>max){
                max=arrayVehiculo[i].precio;
                System.out.println(arrayVehiculo[i].marca + " " + arrayVehiculo[i].modelo);
                
            }
        }
        
        for (int i=0; i<arrayVehiculo.length; i++){
            if (arrayVehiculo[i].precio<min){
                min=arrayVehiculo[i].precio;
                System.out.println(arrayVehiculo[i].marca + " " + arrayVehiculo[i].modelo);
            }
        }  
        
       
        for (int i=0 ; i<arrayVehiculo.length; i++){
            
        if (arrayVehiculo[i].modelo.contains("Y")){
            
            System.out.println("Vehiculo que contiene en el modelo la letra 'Y': "+ arrayVehiculo[i].marca + " " + arrayVehiculo[i].modelo + " $: "+ arrayVehiculo[i].precio);
        }
            
        }
        
        System.out.println("============================");
        
        
        System.out.println("Vehiculos ordenados por precio de mayor a menor: ");
        Arrays.sort(arrayVehiculo);
        Vehiculo.imprimeArrayMasAMenos(arrayVehiculo);
    }
    
}
