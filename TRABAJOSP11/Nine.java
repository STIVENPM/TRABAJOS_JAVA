package TRABAJOSP11;
import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner SP = new Scanner(System.in);

        System.out.println("ingresa el año de nacimiento:");
        int an = SP.nextInt();
    
        int aa = 2025;

        int e = aa - an;

        if (e > 17) {
            System.out.println("debe solicitar su cedula");
        } else {
            System.out.println("no debe solicitar su cedula aun");
        }
    
        SP .close();
    }
    
}
