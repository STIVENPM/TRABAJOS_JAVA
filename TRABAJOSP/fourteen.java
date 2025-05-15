package TRABAJOSP;

import java.util.Scanner;

public class fourteen {
    public static void main(String[] args) {
        Scanner SP = new Scanner(System.in);

        System.out.println("ingrese un numero del 1 al 10:");
        int NE = SP.nextInt();
        String ER = "";

        if (NE == 1) {
            ER = " I ";
        }
        if (NE == 2) {
            ER = " II";
        }
        if (NE == 3) {
            ER = " III";
        }
        if (NE == 4) {
            ER = " IV";
        }
        if (NE == 5) {
            ER = " V";
        }
        if (NE == 6) {
            ER = " VI";
        }
        if (NE == 7) {
            ER = " VII ";
        }
        if (NE == 8) {
            ER = " VIII ";
        }
        if (NE == 9) {
            ER = " IX ";
        }
        if (NE == 10) {
            ER = " X ";
        }

        System .out.println("el numero " + NE + " en romano es " + ER + "");

SP.close();
    }
    
}
