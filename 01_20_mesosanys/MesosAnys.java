/*
 * Programa que ordena dos nombres
 */
public class MesosAnys {
    public static void main(String[] args) {
        System.out.println("Mes?");
        int numero = Integer.parseInt(Entrada.readLine());
                
        System.out.println("Any?");
        int any = Integer.parseInt(Entrada.readLine());
        
        
        if (numero == 1 ) {
              System.out.println("Anterior 12/" + (any -1) + " i posterior 2/" +(any));                
        } else if (numero == 12) {
            System.out.println("Anterior 11/" + (any) + " i posterior 1/" + (any + 1));
            
        } else {
            System.out.println("Anterior " + (numero -1) + "/" + any +" "+ " i posterior " +(numero +1)+"/"+any);
    }
  }
}
