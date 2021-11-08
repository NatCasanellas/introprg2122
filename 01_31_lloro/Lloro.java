/*
* El programa que demana linies de text per entrada estandard i les va 
* repetint mentre les entrades siguin text no buit ni composat, nomes de blancs.
*/

public class Lloro {
    public static void main(String[] args) {
        System.out.println("El lloro espera paraula:");
            String paraula = Entrada.readline();
            
            while(! (paraula.isEmpty()); {
            System.out.println("El lloro espera paraula:");
            String paraula = Entrada.readline();
            if (! (paraula.isEmpty() || paraula.isBlank())){
            System.out.println ("El lloro repeteix: " + paraula);  
            
            System.out.println("Adéu");
    }


}
