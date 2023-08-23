
package poo;
// Ricardo Delgado Urbano
public class POO {
    public static void main(String[] args) { 

      int edad = 25;
      double temperatura = 98.6;
      char calificacion = 'A';
      boolean activo = true; 
      String nombre = " Ricardo Delgado Urbano ";
      
   System.out.println("hola " + nombre);
   
   POO instance= new POO();
 int result= instance.sum(1,2);
        System.out.println(result);
        
    }                                                                                                                                                                                                                                                            
    public int sum(int num1, int num2 ){
    // System.out.println("Result: "+ (num 1 + num2 ));
    return (num1+ num2);
    
    }
   
}
