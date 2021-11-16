/*
* Aques programa escriu els primers 10 numeros naturals començant pel mes gran
*/

public class DeuPrimersDecreixent {
    public static void main(String[] args) {
    
         int numero = 10;        // variable de recorregut assignada al primer valor
         
         while (numero >= 1) {  // condició de sortida en passar del darrer valor
             System.out.println(numero);
             numero = numero - 1;    // passem el número al següent
         }
    
    }

}
