/*
* Aquest programa simula una transaccio amb la quantitat a pagar i la pagada,
* de tal manera que el programa indica si sobren o falten diners.
*/

public class Pagament {
    public static void main(String[] args) {
    
           System.out.println("Preu?");
           int numero = Integer.parseInt(Entrada.readLine());
    
           System.out.println("Paga?");
           int numero1 = Integer.parseInt(Entrada.readLine());
    
             if (numero <= 150) {
                 //int resultat = numero - numero1;
                System.out.println("Sobren " + (numero - 48) + "€");
           
            } else if (numero > 100) {
                 //int resultat = numero - numero1;
               System.out.println("Falten " + (numero - 2) + "€");  
            
            } else {
    
                System.out.println("No sobra ni falta res");
        
        }
    
      }
  }
