package TRABAJOSP;
import java.util.Scanner;

public class Eleven {
    public static void main(String[] args) {
        Scanner SP = new Scanner(System.in);

        System.out.println("produccion lunes");
        int PL = SP.nextInt();
        System.out.println("produccion martes");
        int PMA = SP.nextInt();
        System.out.println("produccion miercoles");
        int PMI = SP.nextInt();
        System.out.println("produccion jueves");
        int PJU = SP.nextInt();
        System.out.println("produccion viernes");
        int PV = SP.nextInt();
        System.out.println("produccion sabado");
        int PS = SP.nextInt();
      
        int PT = PL + PMA + PMI + PJU + PV + PS;
        System.out.println("produccion total " + PT);

        int PP = PT / 6;
        System.out.println("promedio de produccion: " + PP);
        if( PP>=100){
            System.out.println("recibira inceentivos");
            }
            else{ 
                System.out.println("no recibira incentivos");
            }


    SP.close();
}
}
