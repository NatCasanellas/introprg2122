/*
* El programa demana un text i dos valors enters, que mostra tots els 
* caracters que hi ha entre el primer i el segon, en l'ordre marcat per 
* l'entrada
*/

public class MostraInterval {
    public static void main (String[] args) {
    
        System.out.println("text?");
        String text = Entrada.readLine();
        
        System.out.println("inici?");
        int start = Integer.parseInt(Entrada.readLine());
        
        System.out.println("final?");
        int end = Integer.parseInt(Entrada.readLine());
        
        boolean skip = false;
        
            if (start < 0 && end < 0 && start < end) {
                skip = true;
            } 
            if (start < 0 && end < 0 && end < start) {
                skip = true;
            }
            if (start < 0) {
                start = 0;
            }
            if (start > text.length () -1) {
                start = text.length() -1;
            }    
            if (start == 0 && end < 0 ) {
                end = 0;
            }
            if (end < 0) {
                end = 0;
            }
    
            if (start <= end && !skip) {
                    for (int s = start; s <= end; s++) {
                        if (s <= text.length() - 1) {
                        System.out.println(text.charAt(s));
                    }
                }
            } else if (end <= start && !skip) {
                    for (int s = start; s >= end; s--) {
                            System.out.println(text.charAt(s));
                    }
           } else if (skip == true) {
                    System.out.println();
    
       }
    }
}
