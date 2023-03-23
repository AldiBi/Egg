/*
 *Crea una aplicación que le pida dos números al usuario 
y este pueda elegir entre sumar, restar, multiplicar y dividir. 
La aplicación debe tener una función para cada operación 
matemática y deben devolver sus resultados para imprimirlos 
en el main.
 */
package Guia.Cuatro;

import java.util.Scanner;
/**
 *
 * @author Dario
 */
public class EjUno {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");   
        int a = leer.nextInt(), b = leer.nextInt();
        int opc = 0;
        do {
            System.out.println("1. SUMAR");
            System.out.println("2. RESTAR");
            System.out.println("3. MULTIPLICAR");
            System.out.println("4. DIVIDIR");
            System.out.println("5. SALIR");
            opc = leer.nextInt();
            
             switch (opc) {
                case 1 :
                    int resultadoSuma = fsum(a,b);
                    System.out.println("La suma es " + resultadoSuma);
                  break;
                case 2 :
                    int resultadoResta = frest(a,b);
                    System.out.println("La resta es " + resultadoResta);
                  break;  
                case 3 :
                    int resultadoMult = fmult(a,b);
                    System.out.println("La multiplicacion es " + resultadoMult);
                  break; 
                case 4 :
                    double resultadoDiv = fdiv(a,b);
                    System.out.println("La divicion es " + resultadoDiv);
                  break; 
                case 5 :
                    System.out.println("Hasta luego");
                  break;   
                default :
                    System.out.println("Operacion invalida, ingrese otra opcion.");
            }
        } while (opc != 5);
                    
   }   
 public static int fsum (int a, int b) {
    return a + b ;
 }     
  public static int frest (int a, int b) {
    return a - b ;
 }
   public static double fdiv (int a, int b) {
    return (double)a / b ;
 }
    public static int fmult (int a, int b) {
    return a * b ;
 }
}
