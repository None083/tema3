/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package probando;

/**
 *
 * @author noelia
 */
public class PrimerosTerminos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Realiza un programa que imprima por consola los 35
        // primeros términos de la siguiente serie:
        //FO=0 / F1=1 / Fn=Fn-1+Fn-2 / F2=F2-1+F2-2=0+1=1
        
        int f0 = 0;
        int f1 = 1;
        int numeroSerie;
        System.out.println(f0 + "\n" + f1);
        for (int i = 0; i < 35; i++) {
            numeroSerie = f0 + f1;
            f0 = f1;
            f1 = numeroSerie;
            System.out.println(numeroSerie);
        }
        
        
        
    }
    
}
