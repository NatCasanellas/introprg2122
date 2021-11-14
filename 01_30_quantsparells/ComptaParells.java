/*
* Aquest programa demana enters positius i que, en el moment que rebi un 
* de negatiu, mostra el nombre de valors parells introduïts i finalitza 
* l'execució.
*/

public class ComptaParells {
    public static void main(String[] args) {
    
          int suma = 0;
          int valor = 0;
          
          while ((valor >= 0 && valor <= 0)) {
               System.out.println("Introdueix un valor");
               valor = Integer.parseInt(Entrada.readLine());
               if (valor <= 0) {
               System.out.println("Introdueix un valor");
                    //suma = suma + valor;
              
               }
            }
            System.out.println("Valors parells introduïts: " + suma);
 
        }
 }
