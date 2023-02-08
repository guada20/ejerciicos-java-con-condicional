/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuadrado;

/**
 *
 * @author Laboratorio
 */
public class Cuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cuadrado;
        int Suma=0;
        for(int numero=1; numero<=10; numero++){
            
            cuadrado=numero*numero;
            System.out.println("Los numeros del 1 al 10 al cuadrado son: " + cuadrado);
            Suma=cuadrado+Suma;
            
        }
           System.out.println("La suma del cuadrado de los numeros del 1 al 10 es " +Suma);

    }
    
}
