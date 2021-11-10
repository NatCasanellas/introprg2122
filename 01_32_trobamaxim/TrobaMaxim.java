/*
* El programa demana enters positius i en el moment que rep un de negatiu, 
* mostra el valor maxim positiu intriduït i finalitza.
*/

public class TrobaMaxim {
    public static void main(String[] args) {
    
           int maxim = 1;
           
           System.out.println("Introdueix un valor");
           int valor = Integer.parseInt(Entrada.readLine());
         // int valor = 0;
          
          while (valor >= 0) {
               System.out.println("Introdueix un valor");
               valor = Integer.parseInt(Entrada.readLine());
               //if (valor >= 0) {
               //System.out.println("Introdueix un valor");
                   maxim = maxim + valor;
               //}
            }
            System.out.println("El màxim és " + maxim);
    
    }

}
