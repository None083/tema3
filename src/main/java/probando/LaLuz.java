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
public class LaLuz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejercicio para calcular la luz,
        //Se debe crear un menu que cuando se introduzca 0 se cierra el programa, 
        //si introduces otra cosa el programa continua.
        //Después te pide que introduzca cuantos kW/hora consume un aparato .
        //Tambien pide cuanto vale el kW en hora punta, en hora llana y hora valle, 
        //los precios tienen que estar compredidos entre 0.1y 0.45 y el precio 
        //de hora llana tiene que ser inferior a la hora punta y el precio de 
        //la hora valle tiene que ser inferior a la hora llana
        //Despues introduces cuantas horas ha estado enchufado en la hora punta, 
        //llana y valle (esto sin restricciones)
        //Por ultimo te debe mostrar cuantos € a consumido en cada seccion y la suma total

        final double PRECIOMINIMO = 0.1;
        final double PRECIOMAXIMO = 0.45;

        Scanner teclado = new Scanner(System.in);

        String menuInicial = "";

        while (!menuInicial.equalsIgnoreCase("0")) {

            System.out.println("""
                           ELIJA UNA OPCION
                  ----------------------------------------------------------
                         - Para salir pulse 0
                         - Para continuar pulse cualquier otro caracter
                  ----------------------------------------------------------
                           """);

            menuInicial = teclado.nextLine();
            if (!menuInicial.equalsIgnoreCase("0")) {
                System.out.println("¿Cuántos kw/h consume tu aparato?");
                double consume = teclado.nextDouble();
                teclado.nextLine();
                double horaPunta = 0;
                double horaLlana = 0;
                double horaValle = 0;
            
//            System.out.println("¿Cuánto vale el kw en hora valle?");
//            double horaValle = teclado.nextDouble();

                while (horaPunta < PRECIOMINIMO || horaPunta > PRECIOMAXIMO) {
                    System.out.println("¿Cuánto vale el kw en hora punta?");
                    horaPunta = teclado.nextDouble();
                    teclado.nextLine();
                }
                while (horaLlana < PRECIOMINIMO || horaLlana > PRECIOMAXIMO || horaLlana > horaPunta) {
                    System.out.println("¿Cuánto vale el kw en hora llana?");
                    horaLlana = teclado.nextDouble();
                    teclado.nextLine();
                }
                while (horaValle < PRECIOMINIMO || horaValle > PRECIOMAXIMO || horaValle > horaLlana) {
                    System.out.println("¿Cuánto vale el kw en hora valle?");
                    horaValle = teclado.nextDouble();
                    teclado.nextLine();
                }
                
                System.out.println("Introduce las horas que ha estado en funcionamiento en hora punta:");
                double tiempoHoraPunta = teclado.nextDouble();
                System.out.println("Introduce las horas que ha estado en funcionamiento en hora llana:");
                double tiempoHoraLlana = teclado.nextDouble();
                System.out.println("Introduce las horas que ha estado en funcionamiento en hora valle:");
                double tiempoHoraValle = teclado.nextDouble();
                
                double costeHoraPunta = consume * horaPunta * tiempoHoraPunta;
                double costeHoraLlana = consume * horaLlana * tiempoHoraLlana;
                double costeHoraValle = consume * horaValle * tiempoHoraValle;
                double costeTotal = costeHoraPunta + costeHoraLlana + costeHoraValle;
                
                
            }
            
        }

    }

}
