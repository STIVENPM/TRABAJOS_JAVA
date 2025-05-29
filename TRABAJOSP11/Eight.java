package TRABAJOSP11;
import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ingrese one ");
        double AA = sc.nextDouble();
      
       
        System.out.print("ingrese two ");
        double AB = sc.nextDouble();

        System.out.print("ingrese three ");
        double OA = sc.nextDouble();

        System.out.println("ingrese four ");
        double OB = sc.nextDouble();

        double D =   Math.sqrt(Math.pow((AB - AA),2) + Math.pow((OB - OA), 2));
        System.out.println("la distancia entre los puntos es: "+D);
        sc .close();
    }
    
}
