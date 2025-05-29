package TRABAJOSP11;

import java.util.Scanner;

public class seventeen {
    public static void main(String[] args) {
        Scanner SP = new Scanner(System.in);

        System.out.print("ingressa numero de dos sifras de 2 cifras: ");
        int NE = SP.nextInt(); 

        int Q = NE / 10;       
        int R = NE - (Q * 10); 

        int D = Q;             
        int U = R;            

        System.out.println("Decenas: " + D);
        System.out.println("Unidades: " + U);


        SP.close();
    }
    
}
