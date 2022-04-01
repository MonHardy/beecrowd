import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
      int Nf, Nhorast;
      double Salario, Vhora;
      Scanner input = new Scanner(System.in);

      Nf = input.nextInt(); Nhorast = input.nextInt(); Vhora = input.nextDouble();

      Salario = Nhorast * Vhora;
      System.out.printf("NUMBER = " + Nf + "\n" + "SALARY = U$ %.2f\n", Salario);
    }
}
