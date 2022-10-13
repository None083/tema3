/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructurasdeseleccion;

import java.util.Scanner;

/**
 *
 * @author FX506
 */
public class Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner teclado = new Scanner(System.in);
        
        //a.
        int numero = teclado.nextInt();
        String mayorIgual = (numero >= 135) ? "mayor" : "menor";
        
        //b.
        String menorIgual = (numero <= 0) ? "Menor que cero" :
                "Mayor que cero";
        
        System.out.println(mayorIgual);
        System.out.println(menorIgual);
        
        int c;
        //c.
        if (numero < 0){
            c = numero * -1;
        } else {
            c = numero;
        }
        
        System.out.println("El valor absoluto del número es: " + c);




        
        
        
        
    }
    
}
