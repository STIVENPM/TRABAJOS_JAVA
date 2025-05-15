package TRABAJOSP;
import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ingrese one ");
        double a = sc.nextDouble();
      
       
        System.out.print("ingrese two ");
        double b = sc.nextDouble();

        System.out.print("ingrese three");
        double c = sc.nextDouble();
    
        
        double LS,AT;
        LS = (a + b + c) / 2;
        AT = Math.sqrt(LS * (LS - a) * (LS - b) * (LS - c));
        System.out.println("el area ddel triangulo es  " + AT);
        AT = sc.nextInt();
        
    
sc .close();
}
}

