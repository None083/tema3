/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apuntes;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author FX506
 */
public class EjemploRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //creo un objeto de tipo random llamado generador
        //con el constructor de la clase       
        Random generador = new Random();
        Scanner teclado = new Scanner(System.in);
        int numAleatorio;
        
         System.out.println("Introduce una letra (A, B, C, D, E");
        String letraString = teclado.nextLine();      
        
        
        //si el usuario introduce A, B o C se debe guardar
        //un aleatorio entre 1 y 10
        
        switch (letraString) {
            case "A", "B", "C":
                //entre 1 y 10
                numAleatorio = generador.nextInt(10)+1;
                break;
            case "D":
                //entre 11 y 25
                numAleatorio = generador.nextInt(25-11+1)+11;
                break;
            case "E":
                //entre 26 y 33
                numAleatorio = generador.nextInt(33-26+1)+26;
                break;
            default:
                //entre 34 y 100
                numAleatorio = generador.nextInt(100-34+1)+34;                
        }
        
        //convertir a switch
        numAleatorio = switch (letraString) {
            case "A", "B", "C" -> generador.nextInt(10)+1;
            case "D" -> generador.nextInt(25-11+1)+11;
            case "E" -> generador.nextInt(33-26+1)+26;
            default -> generador.nextInt(100-34+1)+34;
        }; 



        //entre 1 y 10
        //entre 11 y 25
        //entre 26 y 33
        //entre 34 y 100
        //si introduce D, guardar aleatorio entre 11 y 25
        //si introduce E, aleatorio entre 26 y 33
        //en otro caso, aleatorio enytre 34 y 100
//        //genera un numero aleatorio dentro del rango de los enteros
//        numAleatorio = generador.nextInt();        
//        //genera un numero aleatorio entre 1 y 19
//        //el 10 nunca sale
//        numAleatorio = generador.nextInt(19)+1;
//        System.out.println("El numero es: " + numAleatorio);        
//        //genera un rango dado 12-18
//        //nextInt(

        
        
        



    }

}
