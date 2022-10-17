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
public class CalculadoraSwitch {

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
                      ---------------------
                           CALCULADORA
                      ---------------------
                      1.SUMAR
                      2.RESTAR
                      3.MULTIPLICAR
                      4.DIVIDIR
                      """;

        String opcion = JOptionPane.showInputDialog(menu);

        switch (opcion) {
            case "1", "9"://se puede poner varios case en el mismo, se ejecutará el mismo código
                resultado = operando1 + operando2;
                System.out.println("El resultado es %.2f, resultado");
                break;
            case "2":
                //si es opcion 2 - restar
                resultado = operando1 - operando2;
                System.out.println("El resultado es %.2f, resultado");
                break;
            case "3":
                //si es opcion 3 - multiplicar
                resultado = operando1 * operando2;
                System.out.println("El resultado es %.2f, resultado");
                break;
            case "4":
                //si es opcion 4 - dividir
                resultado = operando1 / operando2;
                System.out.println("El resultado es %.2f, resultado");
                break;
            default:
                JOptionPane.showMessageDialog(null,
                        "Opcion incorrecta");
                break;
        }

    }

}
