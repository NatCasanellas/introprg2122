/*
* Aques programa t'informa de la nota mitja de les notes introduïdes.
*/

public class NotaMitja {
    public static void main(String[] args) {
    
        int suma = 0; //guarda la suma
        //int comptador = 0; //guarda quants en portes
        
        
        //demana el primer valor
        System.out.println("Introdueix una nota");
        int comptador = Integer.parseInt(Entrada.readLine()); //guarda quants en portes
        
        //ves sumant mentre el valor sigui positiu
        while (comptador >= 0) {
       
        //Si la nota es negativa
          System.out.println("Cap nota vàlida introduïda");
        }
        //Mostra la mitja
          System.out.println("La mitja de les notes vàlides és " + suma);
    }


}
