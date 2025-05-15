package TRABAJOSP;
import java.util.Scanner;

public class sixteen {
    public static void main(String[] args) {
        Scanner SP = new Scanner(System.in);

        System.out.println("ingresa numero entero");
        int NE = SP.nextInt();
        String V = "";

        if (NE == 1) {
            V = "A";
        } else if (NE == 2) {
            V = "B";
        } else if (NE == 3) {
            V = "C";
        } else if (NE == 4) {
            V = "D";
        } else if (NE == 5) {
            V = "E";
        } else if (NE == 6) {
            V = "F";
        } else if (NE == 7) {
            V = "G";
        } else if (NE == 8) {
            V = "H";
        } else if (NE == 9) {
            V = "I";
        } else if (NE == 10) {
            V = "J";
        } else {
            V = "numero fuera de rango";
        }

        System.out.println("el numero ingrado es: " + NE + " y vale  " + V);


  




        SP.close();
    }
    
}
