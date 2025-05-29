package TRABAJOSP11;
import java.util.Scanner;

public class thirteen {
    public static void main(String[] args) {
        Scanner SP = new Scanner(System.in);

        System.out.println("primer lado");
        int L1= SP.nextInt();
        System.out.println("segundo lado");
        int L2= SP.nextInt();
        System.out.println("tercer lado");
        int L3= SP.nextInt();
        if (L1 != L2 && L2 != L3 && L3 != L1) {
            System.out.println("escaleno");
        } else {
            if (L1 == L2 && L2 == L3) {
                System.out.println("equilatero");
            } else {
                System.out.println("isoceles");
            }
        }
SP.close();
    }
    
}
