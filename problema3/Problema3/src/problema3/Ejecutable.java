/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema3;

/**
 *
 * @author Carlos Morocho - PC
 */
public class Ejecutable {
    public static void main (String[] args){
        Automotor auto = new Automotor("1103141510", "Chevrolet", 2013, 12000.00);
        Automotor auto2 = new Automotor("1501321433", "Audi", 2007, 35075.20);
        
        System.out.println("LISTADO DE VEHICULOS");
        auto.calcularValorMatricula();
        System.out.printf("%s", auto);
        System.out.println("-------------------");
        auto2.calcularValorMatricula();
        System.out.printf("%s", auto2);
        
    }
}
