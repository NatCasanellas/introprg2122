/*
* Aquest programa demana enters positius i que, en el moment que rebi un 
* de negatiu, mostra el nombre de valors parells introduïts i finalitza 
* l'execució.
*/

public class ComptaParells {
    public static void main(String[] args) {
    
          int valor = 0;
          int suma = 0;
          
     // mentres el numero sigui >= 0 seguira preguntant al usuari el numero
          while (valor >= 0) {
               System.out.println("Introdueix un valor");
               valor = Integer.parseInt(Entrada.readLine());
               
    //quan aquest numero sigui parell, anira suman en 1 el numero total de  parells           
               if (valor%2 == 0 && valor >= 0) {
                  suma = suma + 1;
               
               }
            }
    // quan el numero sigui negatiu, llavors sortira del bucle, i et dira el total de numeros parells
            System.out.println("Valors parells introduïts: " + suma);
             
        }
 }
