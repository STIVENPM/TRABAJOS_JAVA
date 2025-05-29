package TRABAJOSP11;
import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int RC, RI, RB;
        int PRC, PRI, PF;

        System.out.println("Numero de respuestas correctas: ");
            RC = scanner.nextInt();

        System.out.println("Numero de respuestas incorrectas: ");
            RI = scanner.nextInt();

        System.out.println("Numero de respuestas en blanco: ");
            RB = scanner.nextInt();

        PRC = RC * 4;
        PRI = RI * -1;
        PF = PRC + PRI;

        if(PF<0){
            System.out.println("Puntaje final menor a 0 " );
        }
        System.out.println("Puntaje final: " + PF);

        scanner.close();
    }
}