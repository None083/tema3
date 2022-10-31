/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package probando;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author noelia
 */
public class Utilidades {

    //metodo leer entero sin errores
    //metodo leer entero en un rango
    //metodo compararEnteroRango
    //metodo generar aleatorio rango
    public static int leerEntero() {

        int numero = 0;
        boolean repetir = true;
        
        do {
            Scanner teclado = new Scanner(System.in);
            try {
                numero = teclado.nextInt();
                repetir = false;
            } catch (InputMismatchException ime) {
                System.out.println("Has introducido un número erroneo");
                teclado.nextLine();
            }
        } while (repetir);
        return numero;
    }
    
    
    public static int enteroRango() {

        int numero = 0;
        boolean repetir = true;
        
        do {
            Scanner teclado = new Scanner(System.in);
            try {
                System.out.println("Introduce un numero del 1-10");
                numero = teclado.nextInt();
                if (numero >= 1 && numero <= 10) {
                repetir = false;                    
                }

            } catch (InputMismatchException ime) {
                System.out.println("Has introducido un número erroneo");
                teclado.nextLine();
            }
        } while (repetir);
        return numero;
    }
    
    
    public static int aleatorioRango (int min, int max) {
        
        Random aleatorio = new Random ();
        
        int numero = aleatorio.nextInt(max - min + 1) + min;
        
        return numero;
        
        
    }
    
    
    

   
}
