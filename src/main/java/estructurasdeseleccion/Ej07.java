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
public class Ej07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        int opcion;

        System.out.println("Menú de opciones");
        System.out.println("-------------------------");
        System.out.println("1. Calcular el área de un Cuadrado");
        System.out.println("2. Calcular el área de un Triángulo");
        System.out.println("3. Calcular el área de un Círculo");
        System.out.println("4. Finalizar");

        System.out.print("Elija una opción: ");
        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ha seleccionado calcular el área de un cuadrado...");
                System.out.println("Introduce el lado del cuadrado: ");
                double lado = entrada.nextDouble();
                double areaCuadrado = Math.pow(lado, 2);
                System.out.println("El area del cuadrado es: " + areaCuadrado);
                break;
            case 2:
                System.out.println("Ha seleccionado calcular el área de un triángulo...");
                System.out.println("Introduce la base del triangulo: ");
                double base = entrada.nextDouble();
                System.out.println("Introduce la altura del triangulo: ");
                double altura = entrada.nextDouble();
                double areaTriangulo = base * altura / 2;
                System.out.println("El area del triangulo es: " + areaTriangulo);
                break;
            case 3:
                System.out.println("Ha seleccionado calcular el área de un círculo...");
                System.out.println("Introduce el radio del circulo: ");
                double radio = entrada.nextDouble();
                double areaCirculo = Math.PI * Math.pow(radio, 2);
                System.out.println("El area del circulo es: " + areaCirculo);
                break;
            default:
                System.out.println("Ha seleccionado terminar");
                break;
        }
        
        
        
        
        
    }
    
}
