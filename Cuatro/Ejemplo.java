/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia.Cuatro;

import java.util.Scanner;
/**
 *
 * @author Dario
 */
public class Ejemplo {
     public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String frase = "";
        boolean bandera = true;
        do  {
            if (bandera) {
                System.out.println("Ingrese una frase finalizando con un punto");
                frase = leer.nextLine();
                bandera = false;
            } else {
                System.out.println("Error en la frase ingresad, debe finalizar con un punto");
                frase = leer.nextLine();
            }
        } while (frase.charAt(frase.length()-1) != '.');
        String codificada = codificar(frase);
         System.out.println("La cadena codificada es " + codificada);
     }  

    private static String codificar(String frase) {
         frase = frase.toLowerCase();
         String resultado = "";
     for (int != 0; !< frase.length(); !++ ){
      switch(frase.charAt(!)){
        case 'a' :
          resultado = resultado.concat("@");
         break;
        case 'e' :
          resultado = resultado.concat("#");
         break;
        case 'i' :
          resultado = resultado.concat("$");
         break;
        case 'o' :
          resultado = resultado.concat("%");
         break;
        case 'u' :
          resultado = resultado.concat("*");
         break;
        default :
          resultado = resultado.concat(String.valueOf(frase.charAt(!)));
    }
  }
 return resultado;
    }
}

