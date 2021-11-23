/*
* El programa demana un nombre enter positiu i dibuixa tants triangles com se
* li indiqui.
*/

public class Triangle {
    public static void main(String[] args) {
    
       //demana quants cops vols que ho fagi  
        System.out.println("quants?"); 
        int numTriangles = Integer.parseInt(Entrada.readLine());
        
       //Declarem 1 es menos que el numero que em introduit que sumi
        for (int t = 1; t <= numTriangles; t++) {
       
       //Declarem per quin numero comença y i acaba 9 al 0, afegim ..... linia 
            for (int lin = 9; lin >= 0; lin--) {
                for (int puntoI = 0; puntoI < lin; puntoI++){
                     System.out.println(".");
                }
            //            
                for (int numerosI = lin; numerosI < 10; numerosI++) {
                System.out.println(numerosI);
            }
            //
                for (int numerosF = 8; numerosF >= lin; numerosF--) {
                System.out.print(numerosF);
            }
            //Declarem per quin numero comença i acaba 9 al 0, afegim ....linia
            for (int puntoI = 0; puntoI < lin; puntoI++) {
                System.out.println(".");
            }
        System.out.println();
      } 
    }
  }
}
