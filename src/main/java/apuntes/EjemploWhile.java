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
public class EjemploWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce número: ");
        
        int num = teclado.nextInt();//inicializacion de variable de control
        while(num<100 || num>200){
            System.out.println("Te has equivocado, por favor, introduce de nuevo");
            num = teclado.nextInt();
        }
        
        //volver a pedir al usuario el numero si no esta entre 100 y 200
        
        
        
        
        
        
        //inicializacion de la variable de control
        int numero= 0;
        
        //condición del bucle
        //mientras la condicion del bucle sea true se repite el codigo entre {}
        //imprimir del 0 al 10
        while(numero<=10){
            System.out.println(numero);
            //SIEMPRE, DENTRO DEL BUCLE, hay que actualizar la variable de control
            numero++;
        }
        System.out.println("El bucle ha terminado");
        System.out.println("------------------------");
        
        //del 20 al 0
        //inicialización
        numero= 20;
        while (numero>=0){
            System.out.println(numero);
            numero--;//actualizacion variable de control    
        }
        System.out.println("------------------------");
        
        //del 50 al 70 de tres en tres
        numero=50;
        while (numero<=70){
            System.out.println(numero);
            numero+=3;
        }
        System.out.println("------------------------");
        

        
        
        
        
    }
    
}
