/*
* El programa demana un nombre enter positiu i dibuixa tants triangles com se
* li indiqui.
*/

public class Triangle {
    public static void main(String[] args) {
    
       //demana l'entrada   
        int numTriangles = 1;
       //dibuixa numTriangles
        for (int t=1; t<=numTriangles; t++) {
            //dibuixa el triangle
            for (int lin=0; lin<=9; lin++) {
            //dibuixa punts inicials            
            for (int col = 1; col <=(9-lin); col++) {
                System.out.println(".");
            }
            //dibuixa num incr
            for (int col =(9 - lin); col <= 9; col++) {
                System.out.print(col);
            //dibuixa 9
            System.out.println("9");
            }
        System.out.println();
        } 
    }
  }
}