package TRABAJOSP;
import java.util.Scanner;

public class Twentyeight {
    public static void main(String[] args) {
        Scanner SP = new Scanner(System.in);


        int NV = 0; 
        int NC = 0; 
        char letra;

        for (int K = 1; K <= 10; K++) {
            System.out.print("Ingrese una letra: ");
            letra = SP.next().charAt(0);

           
            letra = Character.toLowerCase(letra);

            switch (letra) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    NV++;
                    break;
                default:
                    if (Character.isLetter(letra)) {
                        NC++;
                    } else {
                        System.out.println("No es una letra válida.");
                    }
            }
        }

        System.out.println("Número de vocales: " + NV);
        System.out.println("Número de consonantes: " + NC);


SP.close();
    }
    
}
