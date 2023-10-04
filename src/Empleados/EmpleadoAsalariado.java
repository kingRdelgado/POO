
package Empleados;

public class EmpleadoAsalariado extends Empleado {
 private double deducciones; 

    public EmpleadoAsalariado(String nombre, int par, int salarioBase) {
        super(nombre, salarioBase);
        this.deducciones = deducciones;
    }
 
    @Override
    public double calcularsalario() {
        return getSalarioBase()-deducciones;
    }
 
          }
