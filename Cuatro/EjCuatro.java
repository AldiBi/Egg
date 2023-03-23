/*
 * Crea una aplicación que nos pida un número por teclado y con una 
función se lo pasamos por parámetro para que nos indique si es o no
un número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo,
17 si es primo.

 */
package Guia.Cuatro;

import java.util.Scanner;
/**
 *
 * @author Dario
 */
public class EjCuatro {
    public static void main(String[] args) {
        Scanner Leer=new Scanner(System.in);
        System.out.println("Ingrese un numero a verificar:");
       // System.out.println("En caso de ser primo se devolvera true,caso contrario false");
        int num=Leer.nextInt();
        int D=0,c=0;
        // boolean compr=true;
        comprobacion(num,D,c);
}
    public static void comprobacion(int num,int D,int c){
        for(D=1;D<num+1;D++){
            if(num%D==0){
                c++;
            }
        }
        if(c>2){
          //  compr=false;
            System.out.println("el numero no es primo");
        }else{
         //   compr=true;
            System.out.println("el numero es primo");
        }
        // return null;
  }
    }