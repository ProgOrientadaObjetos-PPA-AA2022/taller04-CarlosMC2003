/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema4;

/**
 *
 * @author Carlos Morocho - PC
 */
public class EntidadFinanciera {
    private String nombre;
    private String nombreBanco;
    private double valorCheque;
    private double comisionBanco;
    
    public EntidadFinanciera(String nom, String nomBan, double valCheque) {
        nombre = nom;
        nombreBanco = nomBan;
        valorCheque = valCheque;
    }
    
    public void establecerNombreCliente(String n) {
        nombre = n;
    }
    
    public void establecerNombreBanco(String n) {
        nombreBanco = n;
    }
    
    public void establecerValorCheque(double n) {
        valorCheque = n;
    }
    
    public void calcularValorComisionBanco() {
        comisionBanco = valorCheque * 0.00003;
    }
    
    public String obtenerNombreCliente() {
        return nombre;
    }
    
    public String obtenerNombreBanco() {
        return nombreBanco;
    }
    
    public double obtenerValorCheque() {
        return valorCheque;
    }
    
    public double obtenerValorComisionBanco() {
        return comisionBanco;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Nombre del Cliente: %s\n" 
                + "Nombre del Banco: %s\n"
                + "Valor del Cheque: %.2f\n" 
                + "Comision del Banco: %.2f\n"
                ,nombre,nombreBanco
                ,valorCheque, comisionBanco);
        return cadena;
    }
}
