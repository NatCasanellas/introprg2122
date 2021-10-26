/*
 * Programa que ordena dos nombres
 */
public class MesosAnys {
    public static void main(String[] args) {
        System.out.println("Mes?");
        int mes = Integer.parseInt(Entrada.readLine());
                
        System.out.println("Any?");
        int any = Integer.parseInt(Entrada.readLine());
        
        
        if (mes) {
            System.out.println(mes + " i " + any);
                
        } else {
            System.out.println("Anterior " + mes + "/" + any + " i posterior " + mes + "/" + any);
            
        
            
    }
  }
}
