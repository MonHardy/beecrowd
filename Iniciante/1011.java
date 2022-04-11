/*
 * calcule e motre o valor de uma esfera sendo oferecido o valor de seu raio (R)
 * fórumla calculo volume: (4/3) * pi * R3 ///// pi = 3.14159 //// (4/3.0) ou (4.0/3)
 */
package mypackage.d1011;
import java.util.Scanner;
import java.io.*;
import java.util.Locale;

/**
 * @author monnhardy
 */

public class Main {

    public static void main(String args[]) {
    Scanner ler = new Scanner(System.in);
    double R = ler.nextDouble();
    double V = (4.0/3.0) * 3.14159 * Math.pow(R, 3);
    System.out.printf(Locale.ROOT, "VOLUME = %.3f\n" ,V);
    }
}
