/*
* Aques programa t'informa de la nota mitja de les notes introduïdes.
*/

public class NotaMitja {
    public static void main(String[] args) {
    
        //int suma = 0; //guarda la suma
        //int comptador = 0; //guarda quants en portes
        
        
        //demana el primer valor
        System.out.println("Introdueix una nota");
        int valor = Integer.parseInt(Entrada.readLine()); //guarda quants en portes
        
        //ves sumant mentre el valor sigui positiu
        while (valor >= 0) {
               System.out.println("Introdueix una nota");
               valor = Integer.parseInt(Entrada.readLine());
       
       
        //Si la nota es negativa
        
        if (valor<=0){
          System.out.println("Cap nota vàlida introduïda");
        }
        //Mostra la mitja
          System.out.println("La mitja de les notes vàlides és " + valor);
    }

}
}
