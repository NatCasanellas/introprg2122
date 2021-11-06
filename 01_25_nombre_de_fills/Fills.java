/*
* Aquest programa demana quants fills te el usuari i respon segons el nombre
* de fills.
*/

public class Fills {
     public static void main(String[] args) {
     
            System.out.println("Quants fills tens?");
            int numero = Integer.parseInt(Entrada.readLine());
     
            if (numero < 0) {
                 System.out.println("No pots tenir menys de 0 fills");
           
            } else if (numero <= 0) {
                System.out.println("Tot el que t'has estalviat en bolquers!");  
            
            } else if (numero == 1) {
                System.out.println("Compte de no mimar-lo massa!");
        
        }
    
      }
  } 
