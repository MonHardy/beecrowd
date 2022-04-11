/*
 * calcule e motre o valor de uma esfera sendo oferecido o valor de seu raio (R)
 * fórumla calculo volume: (4/3) * pi * R3 ///// pi = 3.14159 //// (4/3.0) ou (4.0/3)
 */
package mypackage.d1011;
import java.util.Scanner;
import java.io.*;

/**
 * @author monnhardy
 */

public class i1011 {

    public static void main(String args[]) {
        double raiodaesfera, pi = 3.14159, R3;
        Scanner ler = new Scanner(System.in);
        
        R3 = ler.nextDouble();
        
        raiodaesfera = (4/3.0) * pi * Math.pow(R3, 3);
        System.out.printf("VOLUME = %.3f" , raiodaesfera , "\n");
    }
}
