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
            
            
        if (segon < tercer) {
            System.out.println(primer + ", " + segon + " i " + tercer);
            
        
       }     
    }
  }
}