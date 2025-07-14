package psena;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion;
        boolean salir = false;

        do{
            System.out.println("opciones ");
            System.out.println("1. elige el numero de la region y el centro y sede");
            System.out.println("2. asignacion de hambientes a sede");
            System.out.println("3. asignacion de aprendices a el ambiente y el centro y sede");
            System.out.println("4. instructor asisgnado a un ambiente");
            System.out.println("5. Salir");
            opcion = sc.nextLine();

            switch (opcion) {
                    case "1":
                    Salida.nombre();
                    break;

                    case "2":
                    Salida.ambientes();
                    break;

                    case "3":
                    Salida.asignacionA();
                    break;

                    case "4":
                    Salida.instructorA();
                    break;

                    case "5":
                    break;

                    case "6":
                    break;

                    case "7":
                    break;

                    case "8":
                    break;

                    case "9":
                    break;

                    case "10":
                    break;
            
                    default:
                    System.out.println("Opcion no valida");
            }
        

        }while (!salir);
        sc.close();



    }
}
