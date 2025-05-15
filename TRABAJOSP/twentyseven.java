package TRABAJOSP;
import java.util.Scanner;

public class twentyseven {
    public static void main(String[] args) {
        Scanner SP = new Scanner(System.in);

        int N1, N2;
        double R = 0;
        String OP;

        System.out.print("Ingrese el primer numero: ");
        N1 = SP.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        N2 = SP.nextInt();

        System.out.print("Ingrese el operador (+, -, *, ^): ");
        OP = SP.next();

        switch (OP) {
            case "+":
                R = N1 + N2;
                break;
            case "-":
                R = N1 - N2;
                break;
            case "*":
                R = N1 * N2;
                break;
            case "^":
                R = Math.pow(N1, N2); 
            default:
                R = 0;
                System.out.println("Operador no válido. Resultado por defecto: 0");
        }

        System.out.println("Resultado: " + R);









SP.close();
    }
    
}
