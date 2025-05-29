package TRABAJOSP11;
import java.util.Scanner;

public class Four {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

                int PG, PE, PP;  
                int PPG, PPE, PT; 
        
                System.out.print("Ingrese la cantidad de partidos ganados: ");
                PG = sc.nextInt();
        
                System.out.print("Ingrese la cantidad de partidos empatados: ");
                PE = sc.nextInt();
        
                System.out.print("Ingrese la cantidad de partidos perdidos: ");
                PP = sc.nextInt();
        
                PPG = PG * 3;
                PPE = PE * 1;
                PT = PPG + PPE;
        
                System.out.println("El puntaje total es: " + PT);
        
                sc.close();
            }
        }
        

