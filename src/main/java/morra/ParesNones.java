/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package morra;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author noelia
 */
public class ParesNones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //se repite hasta que digamos
        //dos jugadores, uno la maquina
        //1. quieres jugar?
        //2. pares o nones? (usuario) la maquina se queda con lo contrario
        //3. elegir nº de dedos, maquina random, usuario dentro de un rango
        //4. ganador? mostrar, se suman los resultados y se dice
        final int MINIMO = 0;
        final int MAXIMO = 10;

        String codigoOpcion = pedirOpcion();

        if (codigoOpcion.equalsIgnoreCase("Jugar")) {
            String paresNones = pedirParesNones();
            int numeroDedos = pedirNumeroDedos();
            int aleatorioMaquina = aleatorioMaquina(MINIMO, MAXIMO);
            String resultado = resultado(numeroDedos, aleatorioMaquina);
            JOptionPane.showMessageDialog(null,
                    "La maquina ha mostrado el numero: " + aleatorioMaquina);
            boolean ganador = ganador(resultado, paresNones);
            String mensaje;
            if (ganador) {
                mensaje = "Has ganado :D";
            } else {
                mensaje = "Has perdido :(";
            }
            JOptionPane.showMessageDialog(null, """
                                                RESULTADO
                                --------------------------------------------
                                Has elegido: %s
                                Has sacado: %s
                                La máquina ha sacado: %s
                                El resultado es: %s
                                %s
                                                """.formatted(paresNones, numeroDedos, 
                                                        aleatorioMaquina, resultado, mensaje));
        }

    }

    private static String jugar() {
        String jugarSalir = JOptionPane.showInputDialog("""
                               Elija una opción
                         ---------------------------
                              - Jugar
                              - Salir
                                                    """);
        return jugarSalir;
    }

    private static boolean esJugarSalirValido(String jugarSalir) {
        return (jugarSalir.equalsIgnoreCase("Jugar")
                || jugarSalir.equalsIgnoreCase("Salir"));
    }

    private static String pedirOpcion() {
        String codigoOpcion = "";
        do {
            codigoOpcion = jugar();
        } while (!esJugarSalirValido(codigoOpcion));
        return codigoOpcion;
    }

    private static String menuParesNones() {
        String paresNones = JOptionPane.showInputDialog("""
                                   Elija una opción
                            ------------------------------
                                  - Pares
                                  - Nones
                            ------------------------------
                                  - Salir
                            """);
        return paresNones;
    }

    private static boolean esParesNonesValido(String paresNones) {
        return (paresNones.equalsIgnoreCase("Pares")
                || paresNones.equalsIgnoreCase("Nones")
                || paresNones.equalsIgnoreCase("Salir"));
    }

    private static String pedirParesNones() {
        String codigoParesNones = "";
        do {
            if (!codigoParesNones.equalsIgnoreCase("salir")) {
                codigoParesNones = menuParesNones();

            } else {
                codigoParesNones = "salir";
            }
        } while (!esParesNonesValido(codigoParesNones));
        return codigoParesNones;
    }

    private static int pedirNumeroDedos() {
        int numeroDedosInt = 0;
        boolean repetir = true;
        do {
            try {
                String numeroDedos = JOptionPane.showInputDialog("¿Cuántos dedos vas a mostrar?");
                numeroDedosInt = Integer.parseInt(numeroDedos);
                if (numeroDedosInt >= 0 && numeroDedosInt <= 10) {
                    repetir = false;
                }
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Eso no es un número");
            }
        } while (repetir);

        return numeroDedosInt;
    }

    private static int aleatorioMaquina(int min, int max) {

        Random aleatorio = new Random();

        return aleatorio.nextInt(max - min + 1) + min;
    }

    private static String resultado(int numeroDedos, int aleatorioMaquina) {
        if ((numeroDedos + aleatorioMaquina) % 2 == 0) {
            return "Pares";
        } else {
            return "Nones";
        }
    }

    private static boolean ganador(String resultado, String paresNones) {

        if (paresNones.equalsIgnoreCase(resultado)) {
            return true;
        } else {
            return false;
        }
    }

}
