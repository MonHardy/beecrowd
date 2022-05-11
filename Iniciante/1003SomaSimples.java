import java.io.IOException;
import java.util.Scanner;
import java.io.*;

class Main {
  public static void main(String[] args) {
    int A, B, SOMA;
    Scanner input = new Scanner(System.in);
    
    A=input.nextInt();B=input.nextInt();

    SOMA = A + B;
    System.out.print("SOMA = " + SOMA);
  }
}
