/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apuntes;

import javax.swing.JOptionPane;

/**
 *
 * @author noeliap
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double resultado = 0;
        double operando1 = Double.parseDouble(JOptionPane.showInputDialog(
                "Introduce operando 1: "));
        double operando2 = Double.parseDouble(JOptionPane.showInputDialog(
                "Introduce operando 2: "));

        String menu = """
                      --------------------
                          CALCULADORA
                      --------------------
                      1.SUMAR
                      2.RESTAR
                      3.MULTIPLICAR
                      4.DIVIDIR
                      """;

        String opcion = JOptionPane.showInputDialog(menu);

//        //logica de la explicacion
//        //si es opcion 1 - sumar
//        if (opcion.equals("1")){
//            resultado = operando1 + operando2;
//            System.out.println("El resultado es %.2f, resultado");
//        }
//        //si es opcion 2 - restar
//        if (opcion.equals("2")){
//            resultado = operando1 - operando2;
//            System.out.println("El resultado es %.2f, resultado");
//        }
//        //si es opcion 3 - multiplicar
//        if (opcion.equals("3")){
//            resultado = operando1 * operando2;
//            System.out.println("El resultado es %.2f, resultado");
//        }
//        //si es opcion 4 - dividir
//        if (opcion.equals("4")){
//            resultado = operando1 / operando2;
//            System.out.println("El resultado es %.2f, resultado");
//        }    
        //logica de la explicacion
        //si es opcion 1 - sumar
        if (opcion.equals("1")) {
            resultado = operando1 + operando2;
            System.out.println("El resultado es %.2f, resultado");
        } else {
            //si es opcion 2 - restar
            if (opcion.equals("2")) {
                resultado = operando1 - operando2;
                System.out.println("El resultado es %.2f, resultado");
            } else {
                //si es opcion 3 - multiplicar
                if (opcion.equals("3")) {
                    resultado = operando1 * operando2;
                    System.out.println("El resultado es %.2f, resultado");
                } else {
                    //si es opcion 4 - dividir
                    if (opcion.equals("4")) {
                        resultado = operando1 / operando2;
                        System.out.println("El resultado es %.2f, resultado");
                    } else {
                        JOptionPane.showMessageDialog(null, 
                                "Opcion incorrecta");
                    }
                }
            }
        }

        if (opcion.equals("1")) {
            resultado = operando1 + operando2;
            System.out.println("El resultado es %.2f, resultado");
        } else if (opcion.equals("2")) {
            //si es opcion 2 - restar
            resultado = operando1 - operando2;
            System.out.println("El resultado es %.2f, resultado");
        } else if (opcion.equals("3")) {
            //si es opcion 3 - multiplicar
            resultado = operando1 * operando2;
            System.out.println("El resultado es %.2f, resultado");
        } else if (opcion.equals("4")) {
            //si es opcion 4 - dividir
            resultado = operando1 / operando2;
            System.out.println("El resultado es %.2f, resultado");
        } else {
            JOptionPane.showMessageDialog(null, 
                    "Opcion incorrecta");
        }

    }

}
