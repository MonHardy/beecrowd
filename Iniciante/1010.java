import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner my_scan = new Scanner(System.in);
      int cpeca1, npeca1, cpeca2, npeca2; 
      double valorupeca1, valorupeca2, valor;

      cpeca1 = my_scan.nextInt(); npeca1 = my_scan.nextInt(); valorupeca1 = my_scan.nextDouble();
      cpeca2 = my_scan.nextInt(); npeca2 = my_scan.nextInt(); valorupeca2 = my_scan.nextDouble();
    

      valor = (npeca1 * valorupeca1) + (npeca2 * valorupeca2);

    System.out.printf("VALOR A PAGAR: R$ %.2f\n", valor);
    }
}
