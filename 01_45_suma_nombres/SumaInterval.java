/*
* El programa demanarà dos valors enters i sumarà tots els nombres que hi 
* hagin entre el més petit i el més gran d'ells. 
*/ 

public class SumaInterval {
    public static void main(String[] args) {
    
        System.out.println("inici?");
        int inici = Integer.parseInt(Entrada.readLine());
        
        System.out.println("final?");
        int fi = Integer.parseInt(Entrada.readLine());
        
            for (inici = inici;
                 inici <= fi;) 
                 inici--) {
                 System.out.println(inici);
        
             
         // for (inici = inici; //el inici per on comença
        //       inici <= fi;   //condicio per entrar al bucle
        //       inici += salt) { //el increment o decrement, en aquest cas increment
                                // += esta incrementant, -= esta decrementant
                //System.out.println(inici); 
              }
    
    }

}
