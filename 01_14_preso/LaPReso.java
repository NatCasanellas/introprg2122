/*
 * Programa que recorda que els majors d'edat són responsables davant la
 * llei
 */
public class LaPReso {
    public static void main(String[] args) {
        System.out.println("Com us dieu?");
        String nom = Entrada.readLine();
        System.out.println("Quants anys teniu?");
        int edat = Integer.parseInt(Entrada.readLine());
        if (edat >= 18) {
            System.out.println("Vos ja podeu anar a la preso!");
        }
        if (! (edat>= 18)) {
        System.out.println("Aneu amb compte ");
    }

}

}
