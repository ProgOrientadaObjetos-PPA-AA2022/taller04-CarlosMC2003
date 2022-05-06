/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1;

/**
 *
 * @author Carlos Morocho - PC
 */
public class Colegio {
    private String nombre;
    private double calMat1;
    private double calMat2;
    private double calMat3;
    private double promedio;
    
    public Colegio(String nom, double cal1, double cal2, double cal3) {
        nombre = nom;
        calMat1 = cal1;
        calMat2 = cal2;
        calMat3 = cal3;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerNotaMateria1(double n){
        calMat1 = n;
    }
    
    public void establecerNotaMateria2(double n){
        calMat2 = n;
    }
    
    public void establecerNotaMateria3(double n){
        calMat3 = n;
    }
    
    public void calcularPromedio() {
        promedio = (calMat1 + calMat2 + calMat3) / 3;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public double obtenerNotaMateria1(){
        return calMat1;
    }
    
    public double obtenerNotaMateria2(){
        return calMat2;
    }
    
    public double obtenerNotaMateria3(){
        return calMat3;
    }
    
    public double obtenerPromedio(){
        return promedio;
    }
    
    public String toString() {
        String cadena = String.format("Listado De Estudiantes\n"
                + "Nombre Del Estudiante: %s\n"
                + "Promedio: %.2f\n" 
                ,nombre,
                promedio);
        return cadena;
    }
}
