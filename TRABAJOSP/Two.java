package TRABAJOSP;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ingresa la primera nota: ");
        int notaOne = sc.nextInt();

        System.out.print("ingresa la segunda nota: ");
        int notaTwo = sc.nextInt();

        System.out.print("ingresa la tercera nota: ");
        int notaThree = sc.nextInt();

        int finalN = (notaOne + notaTwo + notaThree) / 3;
        System.out.println("el promedio final es: " + finalN);

        sc.close();
    }
}
