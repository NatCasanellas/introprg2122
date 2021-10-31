/*
 * Aquest programa 
 * 
 */
public class Ascensor {
    public static void main(String[] args) {
        System.out.println("pis?");
            int pis = Integer.parseInt(Entrada.readLine());
        System.out.println("botó?");
            int boto = Integer.parseInt(Entrada.readLine());
        System.out.println("Operand2?");
            int pis = Integer.parseInt(Entrada.readLine());
        
    
      /* Planta baixa
      */
        if (operador == '+') {
            double resultat = operand1 + operand2;
            System.out.println(operand1 + " + " + operand2 + " = " + resultat);
            
        } else if (operador == '-') {
            double resultat = operand1 - operand2;
            System.out.println(operand1 + " - " + operand2 + " = " + resultat);
            
        } else if (operador == '*') {
            double resultat = operand1 * operand2;
            System.out.println(operand1 + " * " + operand2 + " = " + resultat);
            
        } else if (operador == '/' && !(operand2 == 0)) {
            double resultat = operand1 / operand2;
            System.out.println(operand1 + " / " + operand2 + " = " + resultat);
            
        } else if (operador == '^')  {
            System.out.println("L'operador ^ no està disponible");
            
        } else if (operador == '/' && operand2 == 0) {
            double resultat = operand1 / operand2;
            System.out.println("No es pot dividir entre 0");   
        }    
     }
}
