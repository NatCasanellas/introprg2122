/*
* El programa demana tres nombres enters, i escriu els valors entre el primer
* i el segon saltant d'un al següent amb el tercer.
*/

public class EntersIniciFi {
    public static void main(String[] args) {
        
        System.out.println("Valor inicial?");
        int inici = Integer.parseInt(Entrada.readLine());
            
        System.out.println("Valor final?");
        int fi = Integer.parseInt(Entrada.readLine());
    
        System.out.println("Salt?");
        int salt = Integer.parseInt(Entrada.readLine());
        
              //if(inici < fi) {
                for (inici = inici; inici <= fi; inici++) {
                    System.out.println(inici);
                }
            //  } else if (inici > fi) {
                   for(int i = inici; i >= fi; i--) {
                     System.out.println(i);  
             
         }
    }

}
