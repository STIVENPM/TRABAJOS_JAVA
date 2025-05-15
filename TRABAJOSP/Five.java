package TRABAJOSP;
import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double HL;
        double TH; 
        double P;  

        System.out.print("Ingrese las horas laboradas en el mes: ");
        HL = sc.nextInt();

        System.out.print("Ingrese la tarifa por hora: ");
        TH = sc.nextInt();

        P = HL * TH;

        System.out.println("El total a pagar es: " + P);

        sc .close();
    }
    
}

