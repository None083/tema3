/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package morra;

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
        
        String codigoOpcion = pedirOpcion();
        
        if (codigoOpcion.equalsIgnoreCase("Jugar")){
            String paresNones = pedirParesNones();
            int numeroDedos = pedirNumeroDedos();
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
        return (jugarSalir.equalsIgnoreCase("Jugar")||
                jugarSalir.equalsIgnoreCase("Salir"));
    }
    
    private static String pedirOpcion(){
        String codigoOpcion = "";
        do {
            codigoOpcion = jugar();
        } while (!esJugarSalirValido(codigoOpcion));
        return codigoOpcion;
    }
    
    private static String menuParesNones(){
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
    
    private static boolean esParesNonesValido(String paresNones){
        return (paresNones.equalsIgnoreCase("Pares")||
                paresNones.equalsIgnoreCase("Nones")||
                paresNones.equalsIgnoreCase("Salir"));
    }
    
    private static String pedirParesNones(){
        String codigoParesNones = "";
        do {
            if (!codigoParesNones.equalsIgnoreCase("salir")) {
                codigoParesNones = menuParesNones();
                
            }else {
                    codigoParesNones = "salir";
                }
        } while (!esParesNonesValido(codigoParesNones));
        return codigoParesNones;
    }
    
    private static int pedirNumeroDedos (){
        String numeroDedos = JOptionPane.showInputDialog("¿Cuántos dedos vas a mostrar?");
        int numeroDedosInt = Integer.parseInt(numeroDedos);
        return numeroDedosInt;
    }
    

    
}
