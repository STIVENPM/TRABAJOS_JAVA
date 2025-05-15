package TRABAJOSP;
import java.util.Scanner;

public class twelve {
    public static void main(String[]args){
        Scanner SP = new Scanner(System.in);

        System.out.println("primer numero entero");
        int N1= SP.nextInt();
        System.out.println("segundo numero entero");
        int N2= SP.nextInt();
        System.out.println("tercer numero entero");
        int N3= SP.nextInt();

        if(N1>N2 && N1>N3){
            System.out.println("el primer numero es el mayor");
            int NM= N1;
            System.out.println("numero: " + NM);
            }
            else if(N2>N3){
                System.out.println("el segundo numero es el mayor");
                int NM= N2;
                System.out.println("numero: " + NM);
            }
            else{
                System.out.println("el tercer numero es el mayor");
                int NM= N3;
                System.out.println("numero: " + NM);    
            }

        SP.close();
    }

    
}
