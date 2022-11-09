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
public class Morra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //declaro las constantes para los dedos
        final int MINIMO = 1;
        final int MAXIMO = 5;
        final int MAXIMOTOTAL = 10;
        
        //declaro las variables que usaré para los contadores
        int numeroRondas = 0;
        int rondasGanadasJugador = 0;
        int rondasGanadasMaquina = 0;
        
        boolean repetir = true;
        
        //este string es el menú para comenzar el juego, que he creado en 
        //un método
        String codigoOpcion = pedirOpcion();
        
        //creo un if para cuando elija jugar en el menú, y todo el programa irá dentro
        if (codigoOpcion.equalsIgnoreCase("Jugar")) {
            //este while seguirá en bucle hasta que uno de los dos jugadores
            //tenga tres puntos, ya que mi juego es al mejor de 5
            while (rondasGanadasJugador < 3 && rondasGanadasMaquina < 3) {
                repetir = true;
                //creo un do while, el do se seguirá ejecutando mientras 
                //que el buleano repetir sea true, será falso cuando 
                //alguno de los jugadores gane
                do {
                    //métodos utilizados
                    int numeroDedos = pedirNumeroDedos();
                    int numeroMaquina = pedirAleatorioMaquina(MINIMO, MAXIMO);
                    int numeroTotalPersona = pedirNumeroTotal();
                    int numeroTotalMaquina = pedirAleatorioMaquina(numeroMaquina + 1, MAXIMOTOTAL);
                    int sumaTotal = numeroDedos + numeroMaquina;
                    int comprobarResultados = comprobarResultados(sumaTotal, 
                            numeroTotalPersona, numeroTotalMaquina);
                    //he creado este if con su else, y else if para ir sumando 
                    //las puntuaciones en base al metodo comprobarResultados
                    //si acierta el jugador el metodo devuelve 1, 
                    //y se suma a las rondas totales y a la del jugador
                    //lo mismo si acierta la maquina, que devuelve 2
                    //si hay empate o ninguno acierta devuelve 0
                    String mensaje;
                    if (comprobarResultados == 1) {
                        mensaje = "Un punto para tí";
                        rondasGanadasJugador++;
                        numeroRondas++;
                        repetir = false;
                    } else if (comprobarResultados == 2) {
                        mensaje = "Un punto para la máquina";
                        rondasGanadasMaquina++;
                        numeroRondas++;
                        repetir = false;
                    } else {
                        mensaje = "No hay punto para nadie, la ronda se repite";
                    }
                    //panel de recuento de puntuaciones por ronda
                    JOptionPane.showMessageDialog(null, """
                                                    RESULTADOS
                                           --------------------------------
                                            Ronda número %s
                                            Has sacado: %s
                                            La máquina ha sacado: %s
                                            Tu apuesta ha sido: %s
                                            La apuesta de la máquina: %s
                                            Resultado: %s
                                            %s
                                                """.formatted(numeroRondas, 
                                                        numeroDedos, numeroMaquina,
                            numeroTotalPersona, numeroTotalMaquina,
                            sumaTotal, mensaje));
                    
                } while (repetir == true);
            }
            //cuando uno de los dos jugadores llega a 3 puntos en su contador
            //sale del while y compara las puntuaciones de los dos
            String mensaje;
            if (rondasGanadasJugador > rondasGanadasMaquina) {
                mensaje = "!!Has ganado, ole!!";
            } else {
                mensaje = " Ha ganado la máquina D:";
            }
            //panel de ganador
            JOptionPane.showMessageDialog(null, """
                                                        RESULTADO
                                     -----------------------------------------------------
                                      Numero de rondas ganadas por el jugador: %s
                                      Numero de rondas ganadas por las máquina: %s
                                      %s
                                                """.formatted(rondasGanadasJugador,
                                                        rondasGanadasMaquina, mensaje));
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
    
    private static int pedirNumeroDedos() {
        int numeroDedosInt = 0;
        boolean repetir = true;
        do {
            try {
                String numeroDedos = JOptionPane.showInputDialog(
                        "¿Cuántos dedos vas a mostrar?");
                numeroDedosInt = Integer.parseInt(numeroDedos);
                if (numeroDedosInt >= 1 && numeroDedosInt <= 5) {
                    repetir = false;
                }
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, 
                        "Eso no es un número");
            }
        } while (repetir == true);
        return numeroDedosInt;
    }
    
    private static int pedirAleatorioMaquina(int min, int max) {
        Random maquina = new Random();
        return maquina.nextInt(max - min + 1) + min;
    }
    
    private static int pedirNumeroTotal() {
        int numeroTotalInt = 0;
        boolean repetir = true;
        do {
            try {
                String numeroTotal = JOptionPane.showInputDialog(
                        "¿Cuántos dedos crees que hay en total?");
                numeroTotalInt = Integer.parseInt(numeroTotal);
                if (numeroTotalInt >= 1 && numeroTotalInt <= 10) {
                    repetir = false;
                }
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, 
                        "Eso no es un número");
            }
        } while (repetir == true);
        return numeroTotalInt;
    }
    
    private static int comprobarResultados(int sumaTotal, int totalPersona, int totalMaquina) {
        if (sumaTotal == totalPersona && sumaTotal == totalMaquina) {
            return 0;
        }
        if (sumaTotal == totalPersona) {
            return 1;
        } else if (sumaTotal == totalMaquina) {
            return 2;
        } else {
            return 0;
        }
    }
    
}
