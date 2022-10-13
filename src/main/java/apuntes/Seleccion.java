/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apuntes;

import java.util.Scanner;

/**
 *
 * @author noeliap
 */
public class Seleccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner teclado = new Scanner(System.in);
        System.out.println("Cual es tu nombre? ");
        String nombre = teclado.nextLine();

        System.out.println("Introduce la letra a buscar: ");
        String letraBuscar = teclado.nextLine();

        //sila letra esta contenida en el nombre
        //mostrar el numero de caracteres que tiene el nombre y la posicion
        //de la letra 
        //en otro caso mostrar si el numero de letras del nombre es par o impar
//        boolean letraContenida = nombre.contains(letraBuscar);
//        if (letraContenida==true){//no hace falta poner el true
//            //parte del true            
//        }
        //v1
        if (nombre.contains(letraBuscar)) { //esto es equivalente a lo de arriba
            //tamaño de la cadena
            System.out.println("El número de caracteres es: " + nombre.length());
            //posicion donde esta la letra
            int posicion = nombre.indexOf(letraBuscar);
            System.out.println("La posicion es: " + posicion);
        } else {
            if (nombre.length() % 2 == 0) { //si el numero de letras del string es par
                System.out.println("El numero de caracteres es par");
            } else {
                System.out.println("El numero de caracteres es impar");
            }
        }

        //v2
        if (nombre.contains(letraBuscar)) { //esto es equivalente a lo de arriba
            //tamaño de la cadena
            System.out.println("El número de caracteres es: " + nombre.length());
            //posicion donde esta la letra
            int posicion = nombre.indexOf(letraBuscar);
            System.out.println("La posicion es: " + posicion);
        } else if (nombre.length() % 2 == 0) { //si el numero de letras del string es par
            System.out.println("El numero de caracteres es par");
        } else {
            System.out.println("El numero de caracteres es impar");
        }
        
        //v3
        if (nombre.contains(letraBuscar)) { //esto es equivalente a lo de arriba
            //tamaño de la cadena
            System.out.println("El número de caracteres es: " + nombre.length());
            //posicion donde esta la letra
            int posicion = nombre.indexOf(letraBuscar);
            System.out.println("La posicion es: " + posicion);
//        } else if (nombre.length() % 2 == 0) { //si el numero de letras del string es par
//                System.out.println("El numero de caracteres es par");
//            } else {
//                System.out.println("El numero de caracteres es impar");

            //String textoResultado = (nombre.length() % 2 == 0)?
                    
            }

             



    }

}
