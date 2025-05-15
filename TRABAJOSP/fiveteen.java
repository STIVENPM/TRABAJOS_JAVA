package TRABAJOSP;
import java.util.Scanner;

public class fiveteen {
    public static void main(String[] args) {
        Scanner SP = new Scanner(System.in);

        System.out.println("ingrese el monto de venta mensual:");
        double MV = SP.nextDouble(); 
        double TB =0;

        if (MV >= 0 && MV < 1000) {
            TB = (0 * MV) / 100;
        } else if (MV >= 1000 && MV < 5000) {
            TB = (3 * MV) / 100;
        } else if (MV >= 5000 && MV < 20000) {
            TB = (5 * MV) / 100;
        } else if (MV >= 20000) {
            TB = (8 * MV) / 100;
        }
        
       
        System.out.println("bonificacion total: " + TB);
        SP.close();
    
SP.close();
    }
    
}
