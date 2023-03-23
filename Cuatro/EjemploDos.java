/*
 *Crea un procedimiento EsMultiplo que reciba los dos 
números pasados por el usuario, validando que el primer 
número múltiplo del segundo e imprima si el primer número 
es múltiplo del segundo, sino informe que no lo son.
 */
package Guia.Cuatro;

import java.util.Scanner;
/**
 *
 * @author Dario
 */
public class EjemploDos {
     public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");   
        int a = leer.nextInt(), b = leer.nextInt();
        esMultiplo(a,b);
   }    
 public static void esMultiplo (int num1, int num2) {
     if (num1 % num2 == 0){
         
     }
 }   
}
