package TRABAJOSP11;
import java.util.Scanner;

public class twentysix {
    public static void main(String[] args) {
        Scanner SP = new Scanner(System.in);

        int A = 0,B = 1, C = A + B;

        System.out.print(A + ", " + B);

        while (C < 100000) {
            System.out.print(", " + C);
            A = B;
            B = C;
            C = A + B;







        SP.close();
}
}
}
