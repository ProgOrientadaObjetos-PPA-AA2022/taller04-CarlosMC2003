/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema2;

/**
 *
 * @author Carlos Morocho - PC
 */
public class InstiDoc {
    private String nombre;
    private String apellido;
    private double sueldoBa;
    private double sueldoTo;
    private String cedula;
    
    public InstiDoc (String nom, String ape, double baSueldo, String id){
        nombre = nom;
        apellido = ape;
        sueldoBa = baSueldo;
        cedula = id;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerApellido(String n){
        apellido = n;
    }
    
    public void establecerSueldoBasico(double n){
        sueldoBa = n;
    }
    
    public void calcularSueldoTotal() {
        sueldoTo = sueldoBa + (sueldoBa * 0.20);
    }
    
    public void establecerCedula(String n){
        cedula = n;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public String obtenerApellido() {
        return apellido;
    }
    
    public double obtenerSueldoBasico(){
        return sueldoBa;
    }
    
    public double valorSueldoTotal() {
        return sueldoTo;
    }
    
    public String cedula() {
        return cedula;
    }
    
    public String toString() {
        String cadena = String.format("Listado De Docentes\n"
                + "Nombre y Apellido Del Docente: %s %s\n" 
                + "Cedula Del Docente: %s\n"
                + "Sueldo Basico : %.2f\n" 
                + "Sueldo Total: %.2f\n"
                ,nombre,apellido
                ,cedula, sueldoBa
                ,sueldoTo);
        return cadena;
    }
}
