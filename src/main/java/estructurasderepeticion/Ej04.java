/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructurasderepeticion;

/**
 *
 * @author noelia
 */
public class Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero = 1;
         
          while (numero < 11)
          {
               System.out.println("Número: " + numero);
               numero++;
          }
          
          do {
               System.out.println("Número: " + --numero);
          } while(numero > 1);

        
        
        //en el primer bucle mostrará los números menores que 11
        //así que aparecerán del 1 al 10, pero cuando salga del bucle 
        //numero valdrá 11
        
        //en el segundo, al poner --numero, en vez de numero--
        //aparecerán los numeros del 10 al 1
        //si fuera la segunda opción aparecerían del 11 al 2
        
    }
    
}
