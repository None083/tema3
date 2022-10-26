/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package probando;

import java.util.Scanner;

/**
 *
 * @author FX506
 */
public class bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //un programa que pida que introduzca un numero por teclado
        //mientras que el numero sea diferente de 0
        
        Scanner teclado = new Scanner(System.in);
        int numero = 1;
        
        while (numero != 0) {
            System.out.println("Introduzca un numero");
            numero = teclado.nextInt();
            String numeroString = Integer.toString(numero);
            String alReves = "";
            if (numero%2 == 0) {
                for (int i = numeroString.length() - 1; i >= 0; i--) {
                    alReves = alReves + numeroString.charAt(i);
                }
                System.out.println(alReves);
                
                //quiero que si introduzco un n8umero impar como 
                //por ejemeplo 247 me devuelva 358
                //se le suma 1 a cada caracter
            }else {
                for (int i = 0; i < numeroString.length(); i++) {
                    System.out.print(Character.getNumericValue(numeroString.charAt(i)) + 1 );
                }
                System.out.println("");
            }
        }
        
        
    }
    
}
