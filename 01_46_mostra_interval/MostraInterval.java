/*
* El programa demana dos valors enters i mostra tots els enters que hi ha
* entre el primer i el segon, en l'ordre marcat per l'entrada.
*/

public class MostraInterval {
    public static void main(String[] args) {
    
            System.out.println("ini?");
            int inici = Integer.parseInt(Entrada.readLine());
            
            System.out.println("final?");
            int fi = Integer.parseInt(Entrada.readLine());
    
            if(inici < fi) {
                for (inici = inici; inici <= fi; inici++) {
                    System.out.println(inici);
                }
            } else if (inici > fi) {
                for(int i = inici; i >= fi; i--) {
                    System.out.println(i);  
             
            }
     }
   }
}
