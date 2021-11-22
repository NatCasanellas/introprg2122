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
        
              
          for (inici = inici; //el inici per on comença
               inici <= fi;   //condicio per entrar al bucle
               inici += salt) { //el increment o decrement, en aquest cas increment
                                // += esta incrementant, -= esta decrementant
                System.out.println(inici); 
              }
    }
}
