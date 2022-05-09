/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema4;

/**
 *
 * @author Carlos Morocho - PC
 */
public class Ejecutable {
    public static void main (String[] args) {
        EntidadFinanciera ef = new EntidadFinanciera("Ricardo Torres", "Banco Pichincha", 1300.75);
        EntidadFinanciera ef2 = new EntidadFinanciera("Jose Gutierrez", "Banco de Loja", 3975.00);
        
        ef.calcularValorComisionBnco();
        System.out.printf("%s", ef);
        System.out.println("-------------------");
        ef2.calcularValorComisionBnco();
        System.out.printf("%s", ef2);
        System.out.println("-------------------");
    }
}
