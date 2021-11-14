/*
* El programa demana enters positius i en el moment que rep un de negatiu, 
* mostra el valor maxim positiu intriduït i finalitza.
*/

public class TrobaMaxim {
    public static void main(String[] args) {
    
          int maxim = 0;
          int valor = 0;
          
    //mentres el numero sigui >= 0 seguira preguntant al usuari el numero
          while (maxim >= 0) {
          System.out.println("introdueix un valor");
          maxim = Integer.parseInt(Entrada.readLine());
          
   //quan aquest numero sigui negatiu, anira suman en 1 el numero total de  parells 
          if (maxim%2 == 0 && maxim >= 0) {
                  valor = valor + 1;
          
            }
          }
 //quan el numero sigui negatiu, sortira del bucle i mostrara el maxim valor positiu       
          System.out.println("El màxim és " + maxim);
    }
}
