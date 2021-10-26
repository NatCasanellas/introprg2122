/*
 * Programa que indica si el número proporcionat com a primer argument
 * és parell o senar.
 * Si no s'especifica cap número, el resultat és indeterminat.
 */
public class ParellSenar {
    public static void main(String[] args) {
        int numero = Integer.parseInt(args[0]);
        
        if ((numero % 2) == 1) {
        System.out.println("El numero " + numero + " es senar ");
        
        } else if ((numero % 1) == 0) {
        System.out.println("El numero " + numero + " es parell ");
        
       
    }
}

}
