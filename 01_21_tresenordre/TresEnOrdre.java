/*
 * Programa que ordena dos nombres
 */
public class TresEnOrdre {
    public static void main(String[] args) {
        System.out.println("Primer?");
        int primer = Integer.parseInt(Entrada.readLine());
        
        System.out.println("Segon?");
        int segon = Integer.parseInt(Entrada.readLine());
        
        System.out.println("Tercer?");
        int tercer = Integer.parseInt(Entrada.readLine());
        
        
        if (primer < segon) {
            System.out.println(primer + ", " + segon + " i " + tercer);
         
         } else if (tercer > segon) {
             System.out.println(segon + ", " + primer + " i " + tercer);
             
         } else if (primer < tercer) {
            System.out.println(segon + " i " + tercer + " i " + primer);    
            
            /*
             } else {
            System.out.println(primer + ", " + segon + " i " + tercer);
            
             if (primer < segon) {
            System.out.println(primer + " i " + segon);
                
        } else {
            System.out.println(segon + " i " + primer);
           
     */
            
        
           
    }
  }
}
