package TRABAJOSP11;
import java.util.Scanner;
public class twentytwo {
    public static void main(String[] args) {
        Scanner SP = new Scanner(System.in);

        int PN, SN, P = 0;

        System.out.print("ingrese el primer numero ");
        PN = SP.nextInt();

        System.out.print("ingrese el segundo numero ");
        SN = SP.nextInt();

        for (int k = 1; k <= SN; k++) {
            P = P + PN;
        }

        System.out.println("el producto es: " + P);

    
SP.close();
    }
    
}
