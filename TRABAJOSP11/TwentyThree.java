package TRABAJOSP11;
import java .util.Scanner;

public class TwentyThree {
    public static void main(String[]args){
        Scanner SP = new Scanner(System.in);

  for (int k = 1; k <= 10; k++) {
            int Q = k / 2;        
            int R = k - (Q * 2);   

            if (R == 0) {
                continue; 
            } else {
                System.out.println(k); 
            }




        }
SP.close();
        }
    }