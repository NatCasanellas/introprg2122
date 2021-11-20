/*
* El programa demana tres nmbres enters, i escriu els valors entre el primer i 
* el segon saltant d'un al següent amb el tercer
*/

public class EntersIniciFi {
    public static void main(String[] args ){
    
        System.out.println("inici?");
        int inici = Integer.parseInt(Entrada.readLine());
            
        System.out.println("final?");
        int fi = Integer.parseInt(Entrada.readLine());
        
        System.out.println("Salt?");
        int salt = Integer.parseInt(Entrada.readLine());
        
        
        while (inici >= fi) {
            System.out.println(salt);
            salt= inici + 3;
            } 
         }    
}
