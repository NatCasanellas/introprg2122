/*
 * Programa que indica si el número proporcionat es dia de la setmana.
 * Si s'especifica un numero que no es de la setmana, el resultat és error.
 */
public class DiaSetmana {
    public static void main(String[] args) {
        int numero = Integer.parseInt(args[0]);


            if (numero == 1) {
                     System.out.println("Dilluns");
                     
          }  else if (numero == 2) { 
              
                     System.out.println("Dimarts"); 
          }  else  if (numero == 3) {           
                       
                     System.out.println("Dimecres");    
          }  else  if (numero == 4) {
              
                     System.out.println("Dijous");
                     
          }  else if (numero == 5) { 
               
                     System.out.println("Divendres"); 
          }  else if (numero == 6) {           
                       
                     System.out.println("Dissabte");    
          }  else if (numero == 7) {
                
                     System.out.println("Diumenge");          
                     
            
          } else {
                    System.out.println("Error");
      }

  } 

}



