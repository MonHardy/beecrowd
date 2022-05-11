import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
      Double A, B, C, peso;
      int pesoA = 2, pesoB = 3, pesoC = 5;
      Scanner input = new Scanner(System.in);
      
      A = input.nextDouble();B = input.nextDouble();C = input.nextDouble();
      peso = ((pesoA * A) + (pesoB * B) + (pesoC * C)) / 10;

      System.out.printf("MEDIA = %.1f\n", peso);
    }
}
