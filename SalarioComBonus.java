import java.io.IOException; 
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
    String vendedor; Double Salariof, VendasT, comissao = 0.015, Total;
    Scanner input = new Scanner (System.in);

    vendedor = input.next();Salariof = input.nextDouble();VendasT = input.nextDouble();
      
    Total = (VendasT * 0.15) + Salariof;

      System.out.printf("TOTAL = R$ %.2f\n", Total);
    }
}
