package Empleados;
import java.util.ArrayList;
import java.util.List;

abstract class Empleado {
   private String nombre;
   private double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    
    
   
   public abstract double calcularsalario();
   public String getNombre(){
   return nombre;
           }
public double getSalarioBase(){
return salarioBase;}
       
        
   
    
}
