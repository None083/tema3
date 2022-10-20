/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructurasdeseleccion;

/**
 *
 * @author noelia
 */
public class Ej08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        char departamento = 'B';

        switch (departamento) {
            case 'A':
                System.out.println("Desarrollo");
                break;
            case 'B':
                System.out.println("Recursos Humanos");
            break;
            case 'C':
                System.out.println("Finanzas");
                break;
            case 'D':
                System.out.println("Mercadeo");
            default:
                System.out.println("Departamento no válido");
      }
      System.out.println("Código para el departamento es " + departamento);

        //al haber declrado la variable departamento igual a B, 
        //se imprimirá en pantalla el caso B, recursos humanos
        //luego imprimirá en pantalla el codigo del departamento declarado
        //ya que está fuera del switch
        
    }
    
}
