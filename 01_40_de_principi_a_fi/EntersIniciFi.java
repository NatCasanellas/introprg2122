/*
* El programa demana tres nmbres enters, i escriu els valors entre el primer i 
* el segon saltant d'un al següent amb el tercer
*/

public class EntersIniciFi {
    public static void main(String[] args ){
    
        int inici = Integer.parseInt(Entrada.readLine());
        int fi = Integer.parseInt(Entrada.readLine());
        int salt = Integer.parseInt(Entrada.readLine());
        
        System.out.println("Valor inicial?");
        while (inici <= fi) {
    
    
        System.out.println("Valor final?");
        fi = inici + 3;
        
        System.out.println("Salt?");
        }
    }
}
