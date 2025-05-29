import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int one, two, respuesta;
        int opcion;

        do {
            System.out.println("Calculadora");
             System.out.println("1.Suma");
            System.out.println("2.Resta");
             System.out.println("3.multiplicacion");
            System.out.println("4.division");
             System.out.println("5.Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("ingrese numero uno ");
                    one = sc.nextInt();
                    System.out.print("ingrese numero dos ");
                    two = sc.nextInt();
                    respuesta = one + two;
                    System.out.println("respuesta " + respuesta);
                    break;

                case 2:
                    System.out.print("ingrese numero uno ");
                    one = sc.nextInt();
                    System.out.print("ingrese numero dos ");
                    two = sc.nextInt();
                    respuesta = one - two;
                    System.out.println("respuesta " + respuesta);
                    break;

                case 3:
                    System.out.print("ingrese numero uno ");
                    one = sc.nextInt();
                    System.out.print("ingrese numero dos ");
                    two = sc.nextInt();
                    respuesta = one * two;
                    System.out.println("respuesta " + respuesta);
                    break;

                case 4:
                    System.out.print("ingrese numero uno ");
                    one = sc.nextInt();
                    System.out.print("ingrese numero dos ");
                    two = sc.nextInt();
                    if (two != 0) {
                        respuesta = one / two;
                        System.out.println("la divisin es: " + respuesta);
                    } else {
                        System.out.println("no se puede dividir el cero");
                    }
                    break;
                case 5:
                    System.out.println("salir");
                    break;
               
            }

        } while (opcion != 5);

        sc.close();
    }
}
