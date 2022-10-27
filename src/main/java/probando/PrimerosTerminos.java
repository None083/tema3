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
        
        final int F0 = 0;
        final int F1 = 1;
        int numeroSerie = 0;
        
        for (int i = numeroSerie; i >= 35; i++) {
            numeroSerie = F0 + F1;
            
            System.out.println(numeroSerie);
        }
        
        
        
    }
    
}
