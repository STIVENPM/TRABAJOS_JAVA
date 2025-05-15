package TRABAJOSP;
import java.util.Scanner;

public class twentyfive {
    public static void main(String[] args) {
        Scanner SP = new Scanner(System.in);

         String semaf = "V";
        char letra;

        while (semaf.equals("V")) {
            System.out.print("Ingrese una letra: ");
            letra = SP.next().charAt(0);

            switch (Character.toLowerCase(letra)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    semaf = "R";
                    break;
                default:
                    semaf = "V";
            }
        }

        System.out.println("Ingresaste una vocal. Fin del programa.");








    
    
SP.close();
    }
}
    

