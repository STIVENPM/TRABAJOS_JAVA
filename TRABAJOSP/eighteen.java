package TRABAJOSP;
import java.util.Scanner;

public class eighteen {
    public static void main(String[] args) {    
        Scanner SP = new Scanner(System.in);


        System.out.println("ingrese numero entero");
        int NE = SP.nextInt();

        int Q = NE / 2;        
        int R = NE - (Q * 2); 
        String MSG = "";      

        if (R == 0) {
            MSG = "es par";
        } else {
            MSG = "es impar";
        }

        System.out.println(MSG);










SP.close();
    }
    
}
