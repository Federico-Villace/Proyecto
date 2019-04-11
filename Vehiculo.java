/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onready;

/**
 *
 * @author Federico
 */
public class Vehiculo implements Comparable<Vehiculo>{
 
    String marca; 
    String modelo;
    int puertas; 
    String cilindrada; 
    double precio;
   
    

public Vehiculo (String marca, String modelo, int puertas, String cilindrada, double precio) {

    this.marca=marca; 
    this.modelo = modelo;
    this.puertas=puertas; 
    this.cilindrada=cilindrada; 
    this.precio = precio;
}



static void imprimeArrayAuto(Vehiculo[] array) {
        for (int i = 0; i < array.length; i++) {
        
            System.out.print ("Marca: " + array[i].marca + " // Modelo:  " + array[i].modelo); 
            if (array[i].puertas > 0){
                System.out.print (" // Puertas :  " + array[i].puertas);}
            else {
                    System.out.print(" // Cilindrada :  " + array[i].cilindrada);}// Cilindrada: " + array[i].cilindrada + " // Precio: "+ array[i].precio
            System.out.println(" // Precio: $"+ array[i].precio);         
        
        }       
   }

 @Override
        public int compareTo(Vehiculo o) {
            if (precio < o.precio) {
                return 1;
            }
            if (precio > o.precio) {
                return -1;
            }
            return 0;
}
        
   
        
   static void imprimeArrayMasAMenos(Vehiculo[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].marca + " " + array[i].modelo);
        }     
        
        
   }  
}
