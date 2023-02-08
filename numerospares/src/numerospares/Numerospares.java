/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerospares;

/**
 *
 * @author Laboratorio
 */
import java.util.Scanner;
public class Numerospares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //introduce  5 numeros que sume los numeros pares, mostrando un mensaje que diga
        //la suma de los nuemros pares es:
        Scanner Lea = new Scanner(System.in);
     int pares=0;
     int numero;
     
     for (int n=1; n<=5;n++){
         System.out.print("Ingrese un numero");
          numero=Lea.nextInt();
         
        if(numero%2==0)
        {
            pares=pares+numero;
        }
     
    }
    System.out.println("La suma de los numeros pares es: " +pares);
}
}
