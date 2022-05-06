/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1;

/**
 *
 * @author Carlos Morocho - PC
 */
public class Ejecutable {
    public static void main(String[] args) {
        Colegio co = new Colegio("Pedro",7.75,10,8.25);
        Colegio co2 = new Colegio("Jose",9.15,4.23,6.23);
        
        co.calcularPromedio();
        System.out.printf("%s", co);
        System.out.println("-------------------");
        co2.calcularPromedio();
        System.out.printf("%s", co2);
    }
}
