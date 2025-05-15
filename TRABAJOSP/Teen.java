package TRABAJOSP;
import java.util.Scanner;

public class Teen {
    public static void main(String[] args) {
        Scanner SP = new Scanner(System.in);
        System.out.println("ingrese primera edad");
        int E1 = SP.nextInt();

        System.out.println("ingrese segunda edad");
        int E2 = SP.nextInt();

        if(E1>E2){
            System.out.println("la primera edad es mayor");
            int DE = E1-E2;           
             System.out.println("por: " + DE  + "años" );
        }
        else if(E2>E1){
            System.out.println("la segunda edad es mayor");
            int DE = E2-E1;
            System.out.println("por: "+DE+"años");
            }
            else {
                System.out.println("ambas edades son iguales");
            }
            SP.close();
        }



}
