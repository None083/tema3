/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructurasdeseleccion;

/**
 *
 * @author FX506
 */
public class Ej03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //a
        //boolean unaCondicion = true;
        //resultado = unaCondicion ? valor1 : valor2;
        //va a devolver valor1
        
        //b
        int x = 10;
        int y = (x > 9) ? 100 : 200;
        //el valor de y es 100
        
        //c
        int publico = 19500;
        int vendidas = 19000;
        int aforo = 2000;
        String status = (publico < aforo) ? "Cabe mas gente": 
              (vendidas < aforo) ? "Aun no hemos vendido todo" :
              "Esta todo vendido";
        //el valor de status es "está todo vendido"

        
        

        
        
    }
    
}
