/*
 * Programa que ordena dos nombres
 */
public class DosEnOrdre {
    public static void main(String[] args) {
        System.out.println("Primer?");
        int primer = Integer.parseInt(Entrada.readLine());
        System.out.println(primer);
        
        System.out.println("Segon?");
        int segon = Integer.parseInt(Entrada.readLine());
        System.out.println(segon);
        
        if (primer < segon) {
            System.out.println(primer + "i" + segon);
                
        } if (segon > primer) {
            System.out.println (segon + " i " + primer);
    }
  }
}

