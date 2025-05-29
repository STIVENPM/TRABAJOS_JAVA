package TRABAJOSP11;
import java.util.Scanner;

public class twenty {
    public static void main(String [] args) {
        Scanner sp = new Scanner(System.in);

        int NE; 
        double SE; 
        double SS = 0; 
        double SP; 

        System.out.print("ingrese el numero de empleados:  ");
        NE = sp.nextInt();

        for (int K = 1; K <= NE; K++) {
            System.out.print("ingrese el sueldo del empleado  " +  K + " : ");
            SE = sp.nextDouble();
            SS = SS + SE;
        }
        SP = SS / NE;
        System.out.println("el sueldo promedio es:  " + SP);

sp.close();
    }
}
