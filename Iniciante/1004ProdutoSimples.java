import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
      int valor1, valor2, PROD;
      Scanner input = new Scanner(System.in);
      
      valor1 = input.nextInt(); valor2 = input.nextInt();
      
      PROD = valor1 * valor2;
      System.out.println("PROD = " + PROD);
    }
 
}
