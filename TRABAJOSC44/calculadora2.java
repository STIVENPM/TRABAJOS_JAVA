import java.util.Scanner;

public class calculadora2 {

    public static double a, b,respuesta,bandera=0;
    String leerdato;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        
        int opcion;

       
       do{
        System.out.println("elige");
        System.out.println("1. suma");
        System.out.println("2. Resta");
        System.out.println("3. multiplicacion");
        System.out.println("4. divisiin");
        System.out.println("5.salida");
        
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
            Scanner();
                suma();
                break;
            case 2:
            Scanner();
                resta();
                break;
            case 3:
            Scanner();
                multiplicacion();
                break;
            case 4:
            Scanner();
                division();
                break;
                case 5:
                bandera=1;
                System.out.println("adios");
                break;
            default:
            break;
                
        }
    }while (opcion<5);
        
        

        sc.close();
    }

    public static void suma() {
        respuesta = a + b;
        System.out.println("  respuesta : " + respuesta);
    }

    public static void resta() {
        respuesta = a - b;
        System.out.println("respuesta :  " + respuesta);
    }

    public static void multiplicacion() {
        respuesta = a * b;
        System.out.println("respuesta :  " + respuesta);
    }

    public static void division() {
        if (b != 0) {
            respuesta = a / b;
            System.out.println("respuesta " + respuesta);
        } else {
            System.out.println("No se puede dividir entre 0");
        }
}
public static void Scanner(){
   System.out.println("numero one ");
        a = sc.nextDouble();
        System.out.println("numero two ");
        b = sc.nextDouble();}
   
    }
       
