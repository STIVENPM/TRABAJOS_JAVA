package TRABAJOSP11;
import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese GB: ");
        double GB = sc.nextDouble();
        double MB = GB * 1024;
        int CD = (int)((MB / 700)+1);


        System.out.println("CD necesarios: " + CD);

        sc.close();
    }
}
