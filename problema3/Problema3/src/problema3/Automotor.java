/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema3;

/**
 *
 * @author Carlos Morocho - PC
 */
public class Automotor {
    private String cedula;
    private String marca;
    private int anioFa;
    private double valorVe;
    private double valorMa;
    
    public Automotor(String id, String marcaVe, int anioFabricacion, double valorVehiculo){
        cedula = id;
        marca = marcaVe;
        anioFa = anioFabricacion;
        valorVe = valorVehiculo;
    }
    
    public void establecerCedula(String n){
        cedula = n;
    }
    
    public void establecerMarcaVehiculo(String n) {
        marca = n;
    }
    
    public void establecerAnioFabricacion(int n) {
        anioFa = n;
    }
    
    public void establecerValorVehiculo(double n) {
        valorVe = n;
    }
    
    public void calcularValorMatricula() {
        valorMa = (0.00002 * valorVe)*(2022 - anioFa);
    }
    
    public String obtenerCedula() {
        return cedula;
    }
    
    public String obtenerMarcaVehiculo(){
        return marca;
    }
    
    public int obtenerAnioFabricacion(){
        return anioFa;
    }
    
    public double obtenerValorVehiculo() {
        return valorVe;
    }
    
    public double obtenerValorMatricula() {
        return valorMa;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Cedula del Propietario: %s\n" 
                + "Marca del Vehiculo: %s\n"
                + "Año de Fabricación: %d\n" 
                + "Valor del Vehiculo: %.2f\n"
                + "Valor de la Matricula: %.2f\n"
                ,cedula,marca
                ,anioFa, valorVe
                ,valorMa);
        return cadena;
    }
}
