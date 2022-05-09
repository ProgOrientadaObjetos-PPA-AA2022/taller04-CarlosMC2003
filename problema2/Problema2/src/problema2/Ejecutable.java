/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema2;

/**
 *
 * @author Carlos Morocho - PC
 */
public class Ejecutable {
    public static void main (String[] args) {
        InstiDoc dc = new InstiDoc("Jorge", "Lopez", 1235.00,"120415124");
        InstiDoc dc2 = new InstiDoc("Sofia", "Rojas", 950.75,"112325121");
        
        System.out.println("Listado De Docentes\n");
        dc.calcularSueldoTotal();
        System.out.printf("%s", dc);
        System.out.println("-------------------");
        dc2.calcularSueldoTotal();
        System.out.printf("%s", dc2);
    }
}
