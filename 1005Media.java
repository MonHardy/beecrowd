import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
      Double A, B, pesoA = 3.5, pesoB = 7.5, peso;
      Scanner input = new Scanner(System.in);
      
      A = input.nextDouble();B = input.nextDouble();
      peso = ((pesoA * A) + (pesoB * B)) / 11;

      System.out.printf("MEDIA = %.5f\n", peso);
    }
}
