/*
* El programa demana dos valors enters i mostra tots els enters que hi ha
* entre el primer i el segon, en l'ordre marcat per l'entrada.
*/

public class MostraInterval {
    public static void main(String[] args) {
    
            int valor = Integer.parseInt(Entrada.readLine());
            int fi = Integer.parseInt(Entrada.readLine());
    
    
        for (valor = Integer.parseInt(Entrada.readLine());   //inici;
             valor <= fi;
             valor = valor + 1) {
             System.out.println("inici?");
             
             }
    
    
        for (valor = Integer.parseInt(Entrada.readLine());    //inici;
             valor >= fi;
             valor = valor -1) {
             System.out.println(valor);
             
             }
    }

}
