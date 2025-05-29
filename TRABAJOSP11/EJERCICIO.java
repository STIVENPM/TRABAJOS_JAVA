package TRABAJOSP11;
import java.util.Scanner;

public class EJERCICIO {
    public static void main(String[] args) {
        int i = 0, opcion = 0;
        Scanner SP = new Scanner(System.in);

       
        System.out.println("ingrese unnumero ");
        i = SP.nextInt();

        while (i > 500) {
            System.out.println("numero fuera de rango");
            i = SP.nextInt();
        }

        
        System.out.println("Seleccione una opcion:");
        System.out.println("1. mostrar numeros pares");
        System.out.println("2. mostrar numeros impares");
        System.out.println("3. mostrar numeros primos");
        opcion = SP.nextInt();
        

        switch (opcion) {
            case 1:
                System.out.println("numeros pares " + i);
                for (int j = 1; j <= i; j++) {
                    if (j % 2 == 0) {
                        System.out.println(j);
                    }
                }
                break;

            case 2:
                System.out.println("numeros impares hasta " + i);
                for (int j = 1; j <= i; j+=2) {
                  
                        System.out.println(j);
                   
                }
                break;

           case 3:
    System.out.println("numeros primo");
    for (int j = 2; j <= i; j++) {
        int divisores = 0;
        for (int k = 1; k <= j; k++) {
            if (j % k == 0) {
                divisores++;
            }
        }
        if (divisores == 2) {
            System.out.println(j);
        }
    }
    break;


default:
                System.out.println("Opcion invalida");
        }

        SP.close();
    
 
        
       
    }
}

