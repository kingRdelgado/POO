
package pkg060923;
import Exercise.Persona;



public class Main {

   
    public static void main(String[] args) {
        
        Persona[] arrayPerson = new Persona[3]; 
        arrayPerson[0] = new Persona( " Ricardo", " Delgado", "1059356469");
        arrayPerson[1]= new Persona( " samuel", " Solarte  ", "1059371464"); 
        arrayPerson[2]= new Persona( " santiago", " Cordoba ", "105935454"); 
        
    
         
   for(int i=0;i<3;i++){
   
        System.out.println("--------------------") ;
        System.out.println(arrayPerson[i].getDocument());
        System.out.println(arrayPerson[i].getFirstName());
        System.out.println(arrayPerson[i].getLastName());
         System.out.println("--------------------") ;
   
   }
     
         
        
    
    }
    
}
