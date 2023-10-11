package Empleados;
import java.util.ArrayList;
public class Main {

   
    public static void main(String[] args) {
        
        EmpleadoAsalariado empleado1 = new EmpleadoAsalariado("Ricardo", 1400, 150);
        EmpleadoAsalariado empleado2 = new EmpleadoAsalariado("Stiven", 4500, 420);
        EmpleadoAsalariado empleado3 = new EmpleadoAsalariado("Jairo", 4700, 350);
        EmpleadoAsalariado empleado4 = new EmpleadoAsalariado("Edinson", 3700, 400);
        EmpleadoAsalariado empleado5 = new EmpleadoAsalariado("Bolivar", 7000, 870);
        EmpleadoPorHoras empleado6 = new EmpleadoPorHoras("Santiago", 13, 27);
        EmpleadoPorHoras empleado7 = new EmpleadoPorHoras("Andres", 17, 24);
        EmpleadoPorHoras empleado8 = new EmpleadoPorHoras("nicol", 19, 29);
        EmpleadoPorHoras empleado9 = new EmpleadoPorHoras("Leydi", 21, 28);
        EmpleadoPorHoras empleado10 = new EmpleadoPorHoras("Yesica", 10, 27);

    ArrayList<EmpleadoAsalariado> listaEmpleadosSalario = new ArrayList<>();
    listaEmpleadosSalario.add(empleado1);
    listaEmpleadosSalario.add(empleado2);
    listaEmpleadosSalario.add(empleado3);
    listaEmpleadosSalario.add(empleado4);
    listaEmpleadosSalario.add(empleado5);
  
    
    System.out.println("/-/-/-/-/Empleados Asalariados/-/-/-/-/");
    for (Empleado empleadoSalariado : listaEmpleadosSalario) {
      System.out.println(empleadoSalariado.getNombre() + " tiene un salario de: " + empleadoSalariado.calcularSalario() + " pesosColombianos.");
    }
    
     ArrayList<EmpleadoPorHoras> listaEmpleadosHoras = new  ArrayList<>();
    listaEmpleadosHoras.add(empleado6);
    listaEmpleadosHoras.add(empleado7);
    listaEmpleadosHoras.add(empleado8);
    listaEmpleadosHoras.add(empleado9);
    listaEmpleadosHoras.add(empleado10);
    
    System.out.println("\n\n/-/-/-/-/Empleados por horas/-/-/-/-/");
    for (Empleado empleadoHoras : listaEmpleadosHoras) {
      System.out.println(empleadoHoras.getNombre() + " tiene un salario de: " + empleadoHoras.calcularSalario() + " pesosColombianos.");
    }
    empleado8.setHorasTrabajadas(7);
  
        System.out.println("\n\n/-/-/-/Verificacion empleados por hora/-/-/-/");
for (Empleado empleadoHoras : listaEmpleadosHoras) {
      System.out.println(empleadoHoras.getNombre() + " tiene un salario de: " + empleadoHoras.calcularSalario() + " pesosColombianos.");
    }
        System.out.println("\n\n/-/-/-/empleado especifico/-/-/-/");
System.out.println(empleado7.getNombre() + " tiene un salario de: " + empleado7.calcularSalario() + " pesosColombianos.");
  }  
    
}
