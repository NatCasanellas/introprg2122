/*
 * Programa que ordena dos nombres
 */
public class TresEnOrdre {
    public static void main(String[] args) {
    
    int a, b, c;
    
        System.out.println("Primer?");
        a = Integer.parseInt(Entrada.readLine());
        
        System.out.println("Segon?");
        b = Integer.parseInt(Entrada.readLine());
        
        System.out.println("Tercer?");
        c = Integer.parseInt(Entrada.readLine());
        
        
       
        if(a<b) {
             if (b<c) {
              System.out.println( + a + ", " + b + " i " + c);
             }
             else if (a<c) {
                 System.out.println( + a + ", " + c + " i " + b);
            } else{
                System.out.println( + c + ", " + a + " i " + b);
            }  
       
        }else if (b<c) {
            if(a<c) {
                    System.out.println( + b + ", " + a + " i " + c);
             } else{
                 System.out.println( + b + ", " + c + " i " + a);
             }
          } else{
            System.out.println( + c + ", " + b + " i " + a );
        }
       
     }
 }    
