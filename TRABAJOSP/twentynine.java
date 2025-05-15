package TRABAJOSP;
import java.util.Scanner;

public class twentynine {
    public static void main(String[] args) {
        Scanner SP = new Scanner(System.in);

         int C1 = 0; 
        int C2 = 0; 
        int C3 = 0; 
        int CO = 0;
        int VE;     
        int G;      

        for (int k = 1; k <= 16; k++) {
            System.out.print("Elector #" + k + " - Ingrese su voto (1, 2, 3, otro=nulo): ");
            VE = SP.nextInt();

            switch (VE) {
                case 1:
                    C1++;
                    break;
                case 2:
                    C2++;
                    break;
                case 3:
                    C3++;
                    break;
                default:
                    CO++;
                    break;
            }
        }

        if ((C1 > C2) && (C1 > C3) && (C1 > CO)) {
            G = 1;
        } else if ((C2 > C1) && (C2 > C3) && (C2 > CO)) {
            G = 2;
        } else if ((C3 > C1) && (C3 > C2) && (C3 > CO)) {
            G = 3;
        } else {
            G = 0; 
        }

        // Mostrar resultados
        System.out.println("\nResultado final:");
        System.out.println("Candidato 1: " + C1 + " votos");
        System.out.println("Candidato 2: " + C2 + " votos");
        System.out.println("Candidato 3: " + C3 + " votos");
        System.out.println("Votos nulos o blancos: " + CO);

        if (G == 0) {
            System.out.println("No hay un ganador claro (empate o mayoría no alcanzada).");
        } else {
            System.out.println("El ganador es el Candidato " + G + ".");
        }




SP.close();
    }
    
}
