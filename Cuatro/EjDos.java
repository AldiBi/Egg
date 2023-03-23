/*
 * Diseñe una función que pida el nombre y la edad de N personas 
e imprima los datos de las personas ingresadas por teclado e indique
si son mayores o menores de edad. Después de cada persona, el
programa debe preguntarle al usuario si quiere seguir mostrando
personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package Guia.Cuatro;

import java.util.Scanner;
/**
 *
 * @author Dario
 */
public class EjDos {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String nom = "";
        int edad = 0;
        String op = "";
         do { 
             System.out.println("Ingresar nombre");
             nom = leer.nextLine();
             System.out.println("Ingrsar edad");
             edad = leer.nextInt();
             leer.nextLine();
             datos(nom,edad);
             System.out.println("Desea cargar otra persona? Ingrese no para finalizar ");
             op = leer.nextLine().toLowerCase();
         } while (!"no".equals(op));
   }  
  public static void datos(String a, int b) {
      String verificacion = "";
      if (b > 17) {
          verificacion = "mayor de edad";
      } else
          verificacion = "menor de edad";
      System.out.println("El nombre es " + a + " ,la edad es " + b + " , el usuario es " + verificacion);
 }    
}
