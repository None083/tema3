/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apuntes;

import java.util.Scanner;

/**
 *
 * @author noelia
 */
public class EjemploDoWhile {

    //EL BUCLE DO WHILE SIEMPRE HACE LA PRIMERA ITERACION
    //BUCLE DO WHILE EJECUTA ENTRE 1 Y N
    
    public static void main(String[] args) {
        // TODO code application logic here
        

        //imprimir del 0 al 10
        
        int numero = 0;
        
        do {
            System.out.println(numero);
            numero++;
        } while (numero<=10);
        
        System.out.println("Sale del bucle");
        
        numero= 10;
        
        do{
            System.out.println(numero);
            numero--;
        } while (numero>=0);
        
        
        
        
        int valor;
        do{
            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduce número (100 - 200): ");
            valor =teclado.nextInt();
        } while (valor<100 || valor>200);
        
        
        
    }
    
}
