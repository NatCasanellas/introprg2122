/*
 * Aquest programa es un ascensor d'un edifici amb planta baixa i dos pisos 
 * (primer pis i segon pis)
 */
public class Ascensor {
    public static void main(String[] args) {
    
        System.out.println("pis?");
            String plantaActual = Entrada.readLine();
        System.out.println("botó?");
            String plantaNova = Entrada.readLine();
        
        
      
      
        if (plantaActual.equals("planta baixa") && plantaNova.equals("pujar un")) {
                System.out.println("primer pis");
                
         } else if (plantaActual.equals("primer pis") && plantaNova.equals("pujar un")) {
                System.out.println("segon pis");
         
         } else if (plantaActual.equals("planta baixa") && plantaNova.equals("pujar dos")) {
                System.out.println("segon pis");
         
         
      
      
        } else if (plantaActual.equals("primer pis") && plantaNova.equals("pujar un")) {
                System.out.println("segon pis");
                
         } else if (plantaActual.equals("segon pis") && plantaNova.equals("baixar un")) {
                System.out.println("primer pis");
         
         } else if (plantaActual.equals("primer pis") && plantaNova.equals("baixar un")) {
                System.out.println("planta baixa");
         
         } else if (plantaActual.equals("segon pis") && plantaNova.equals("baixar dos")) {
                System.out.println("planta baixa");
         
      
        //if (plantaActual.equals("planta baixa") && plantaNova.equals ("pujar un")) {
            // System.out.println("primer pis");
            
       //} else if (plantaActual.equals("planta baixa") && plantaNova.equals ("pujar dos")) {
            //System.out.println("segon pis");
       
       // Primer pis
            
       // } else if (plantaActual.equals("primer pis") && plantaNova.equals ("pujar un")) {
           // System.out.println("segon pis");
            
      //  } else if (plantaActual.equals("primer pis") && plantaNova.equals ("baixar un")) {
           // System.out.println("planta baixa");
          
       // Segon pis   
            
       // } else if (plantaActual.equals("segon pis") && plantaNova.equals ("baixar un")) {
           // System.out.println("primer pis");
            
       // } else if (plantaActual.equals("segon pis") && plantaNova.equals ("baixar un")) {
           // System.out.println("planta baixa");   
        
     //   } else { 
     //   System.out.println("error");
        
            }   
     }
}
