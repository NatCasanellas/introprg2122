/*
* El programa demana enters positius i en el moment que rep un de negatiu, 
* mostra el valor maxim positiu intriduït i finalitza.
*/

public class TrobaMaxim {
    public static void main(String[] args) {
    
          int maxim = 0;
          int valor = 0;
          while (valor >= 0) {
             System.out.println("Introdueix un valor");
             valor = Integer.parseInt(Entrada.readLine());
             
             if (maxim <= 0 && maxim >= 0) {
                  valor = valor - 1;
             
             
             //if (valor >= 0) {
               //  maxim = maxim - valor;
            }
        }
        System.out.println("El màxim és " + maxim);
    }
}



