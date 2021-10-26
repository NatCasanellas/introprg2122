/*
 * Programa que indica si el número proporcionat es dia de la setmana.
 * Si s'especifica un numero que no es de la setmana, el resultat és error.
 */
public class DiaSetmana {
    public static void main(String[] args) {
    
        int numero = Integer.parseInt(args[0]);
        String diaSetmanaString;
        switch (numero) {

            case 1: diaSetmanaString = "Dilluns";
                    break;
                    
            case 2: diaSetmanaString = "Dimarts";
                    break;       
                    
            case 3: diaSetmanaString = "Dimecres";
                    break;      
                    
            case 4: diaSetmanaString = "Dijous";
                    break; 
                    
            case 5: diaSetmanaString = "Divendres";
                    break;         
                    
            case 6: diaSetmanaString = "Disabte";
                    break; 
                    
            default: diaSetmanaString = "Error";
                    break;                  
            
          
         }
         System.out.println(diaSetmanaString);
   } 

}



