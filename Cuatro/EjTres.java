/*
 * Crea una aplicación que a través de una función nos convierta 
una cantidad de euros introducida por teclado a otra moneda, estas
pueden ser a dólares, yenes o libras. La función tendrá como 
parámetros, la cantidad de euros y la moneda a convertir que será 
una cadena, este no devolverá ningún valor y mostrará un mensaje 
indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
package Guia.Cuatro;

import java.util.Scanner;
/**
 *
 * @author Dario
 */
public class EjTres {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros");
        double euros = leer.nextDouble();
        leer.nextLine();
        System.out.println("Ingrese a que moneda desea convertir. (dolares/yenes/libras)");
        String moneda = leer.nextLine();
        conversor(euros,moneda);
   }  
  public static void conversor(double euros, String moneda) {
      if (moneda.equals("dolares")) {
          System.out.println(euros + " euros es equivalente a " + (euros * 1.28611) + " dolares.");
      } else if (moneda.equals("libras")) {
          System.out.println(euros + " euros es equivalente a " + (euros * 0.86) + " libras.");
      } else if (moneda.equals("yenes")) {
          System.out.println(euros + " euros es equivalente a " + (euros *  129.852) + " yeles.");
      } else {
          System.out.println("No existe la moneda ingresada.");
      }
 }    
}
