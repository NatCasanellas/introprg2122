/*
* El programa amplia la versio del progrmama SumaPositius, perque en comptes de
* demanar  tres valors sempre, ara només en demani fins el primer cop que 
* s'introdueixi un valor negatiu. Encara cal sumar només els positius.
*/

public class SumaPositius {
    public static void main(String[] args) {
    

        // creem la variable on guardarem el resultat de sumar
        int suma = 0;   // inicialment no hem sumat res i per tant és 0


        // declarem la variable que contindrà els valors llegits
        int valor;

        // processem el primer valor
        System.out.println("Introdueix el primer valor");
        valor = Integer.parseInt(Entrada.readLine());
        if (valor >= 0) {
            suma = suma + valor;
        }

           // processem el segon valor
           System.out.println("Introdueix el segon valor");
           valor = Integer.parseInt(Entrada.readLine());
           if (valor >= 0) {
               suma = suma + valor;
        }       
       
       // processem el tercer valor
           System.out.println("Introdueix el tercer valor");
           valor = Integer.parseInt(Entrada.readLine());
           if (valor <= 0) {
               suma = suma + valor;
            
         
        // mostrem el resultat
        
        } else {
        System.out.println("La suma és " + suma);
    }
  }
}
