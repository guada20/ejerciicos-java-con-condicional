/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contadorjava;

import java.util.Scanner;

/**
 *
 * @author Laboratorio
 */
import java.util.Scanner;
public class Contadorjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //crear un ciclo que al ingresar el nombre, la edad y el sexo(F-M) de 5 persona muestre cuantas son 
        //mujeres u cuntas son hombres
       Scanner Lea = new Scanner(System.in);
    
    int cantfemenino = 0;
    int cantmasculino = 0;
    String Nombre,Sexo;
    int Edad;
    
       for(int c=1;c<=5;c++){
           
           System.out.println("Ingrese su nombre porfavor ");
           Nombre=Lea.next();
           System.out.println("Ingrese su sexo por favor (f o m) ");
           Sexo=Lea.next();
           System.out.println("Ingrese su  edad");
           Edad=Lea.nextInt();
           
           if( "f".equals(Sexo)){
               cantfemenino=cantfemenino+1;    
           }else if ("m".equals(Sexo)){
               cantmasculino=cantmasculino+1;
           }
       }
      System.out.println("La cantidad de mujeres es " +cantfemenino);
      System.out.println("La cantidad de hombres es " +cantmasculino);
      
    }
    
}
