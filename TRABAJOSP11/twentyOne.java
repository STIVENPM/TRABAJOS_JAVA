package TRABAJOSP11;
import java.util.Scanner;

public class twentyOne {
    public static void main(String[] args) {
        Scanner SP = new Scanner(System.in);
        
        int MAY = 0;
        int MEN = 0;
        int EP;

        for (int k = 1; k <= 10; k++) {
            System.out.print("ingresa tu edad " + k + ": ");
            EP = SP.nextInt();

            if (EP < 18) {
                MEN= MEN + 1;
            } else {
                MAY++;
            }
        }

        System.out.println("MENORES de 18: " + MEN);
        System.out.println("MAYORES de 18: " + MAY);
SP.close();
    }
    
}
