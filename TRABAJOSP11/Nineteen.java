package TRABAJOSP11; 
import java.util.Scanner;

public class Nineteen {
    public static void main(String[] args) {
        Scanner SP = new Scanner(System.in);


        
        int N = 2; 
        System.out.println(N);

        for (int K = 1; K <= 4; K++) {
            N = N + 2;
            System.out.println(N);
        }

        SP.close();
    }
}
