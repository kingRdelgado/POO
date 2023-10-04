package Empleados;
// los valores de los sueldos los estamos tomando como dolares :)

public class Main {

   
    public static void main(String[] args) {
  
Empleado[] empleados= new Empleado[10];
empleados[0]=new EmpleadoAsalariado("Richar", 2700, 250);
empleados[1]=new EmpleadoAsalariado("Jordan", 2700, 250);
empleados[2]=new EmpleadoAsalariado("Nicol", 2700, 250);
empleados[3]=new EmpleadoAsalariado("Daniel ", 2700, 250);
empleados[4]=new EmpleadoAsalariado("felpe",2700 , 250);
empleados[5]=new EmpleadoAsalariado("Santiago", 2700, 250);
empleados[6]=new EmpleadoAsalariado("Kevin ", 2700, 250);
empleados[7]=new EmpleadoAsalariado("Leandro ", 2700, 250);
empleados[8]=new EmpleadoAsalariado("Luis", 2700, 250);
empleados[9]=new EmpleadoAsalariado("Alexandra", 2700, 250);

for(Empleado empleado: empleados){
    if(empleado instanceof EmpleadoAsalariado){
       System.out.println(empleado.getNombre()+":"+empleado.getSalarioBase());
    }
    }        
     


empleados[0].setNombre("Nombre modificado - Jordan");
empleados[0].setSalarioBase(2400);
System.out.println(empleados[0].getNombre());


for(Empleado empleado: empleados){
if(empleado instanceof EmpleadoPorHoras ){
System.out.println( empleado.getNombre()+"-"+empleado.calcularsalario());
}
}

for(Empleado empleado: empleados){
if(empleado.getNombre().equals("Empleado3"))
{System.out.println("EL empleado encontrado es: "+empleado.getNombre());
break;
}
}
        
    }
    
}
