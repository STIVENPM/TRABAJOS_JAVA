package ambulancia;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Registrar {

    static Scanner sc = new Scanner(System.in);
    
    static ArrayList<String> Conductor = new ArrayList<>();
    static ArrayList<Integer> edades = new ArrayList<>();
    static ArrayList<String> vehiculos = new ArrayList<>();
    static ArrayList<String> placas = new ArrayList<>();
    static ArrayList<String> pacientes = new ArrayList<>();
    static ArrayList<String> asignaciones = new ArrayList<>();

    
    public static void Conductor() {
        System.out.print("¿Cuántos conductores desea registrar? (1-10): ");
        int cantidad = sc.nextInt();
        sc.nextLine();
        
        if(cantidad < 1 || cantidad > 10) {
            System.out.println("La cantidad de conductores debe ser entre 1 y 10");
            cantidad = 1;
        }
        
        for(int i = 0; i < cantidad; i++) {
            System.out.println("Registrar conductor #" + (i + 1));
            System.out.print("Nombre del conductor: ");
            String nombre = sc.nextLine();
            System.out.print("Edad del conductor: ");
            int edad = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Número de ambulancia (1-10): ");
            int numAmbulancia = sc.nextInt();
            sc.nextLine(); 
            
            if(numAmbulancia < 1 || numAmbulancia > 10) {
                System.out.println("El número de ambulancia debe ser entre 1 y 10");
                numAmbulancia = 1;
            }
            
            System.out.print("Placa del vehículo: ");
            String placa = sc.nextLine();
            System.out.print("Tipo de vehículo (ambulancia/funeraria): ");
            String tipo = sc.nextLine();
            
            Conductor.add(nombre);
            edades.add(edad);
            vehiculos.add(tipo);
            placas.add(placa);
            
            System.out.println("Conductor y vehículo registrados exitosamente!\n");
        }
    }
 public static void MostrarDatos() {
    System.out.println("\n==== CONDUCTORES REGISTRADOS ====");
    if (Conductor.isEmpty()) {
        System.out.println("No hay conductores registrados.");
    } else {
        for (int i = 0; i < Conductor.size(); i++) {
            System.out.println("Conductor #" + (i + 1));
            System.out.println("Nombre: " + Conductor.get(i));
            System.out.println("Edad: " + edades.get(i));
            System.out.println("Tipo de vehículo: " + vehiculos.get(i));
            System.out.println("Placa: " + placas.get(i));
            System.out.println("-----------------------------");
        }
    }

    System.out.println("\n==== PACIENTES REGISTRADOS ====");
    if (pacientes.isEmpty()) {
        System.out.println("No hay pacientes registrados.");
    } else {
        for (int i = 0; i < pacientes.size(); i++) {
            System.out.println("Paciente #" + (i + 1));
            System.out.println("Nombre: " + pacientes.get(i));
            System.out.println("Conductor asignado: " + asignaciones.get(i));
            System.out.println("-----------------------------");
        }
    }
}

      
    
        
    

    
    public static void Paciente() {
        if (Conductor.isEmpty()) {
            System.out.println("Primero debe registrar al menos un conductor.");
            return;
        }

        System.out.print("¿Cuántos pacientes desea registrar? (1-100): ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        Random rand = new Random();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nNombre del paciente " + (i + 1) + ":");
            String nombre = sc.nextLine();

            System.out.print("Edad del paciente: ");
            int edad = sc.nextInt();
         

           
            int indiceConductor = rand.nextInt(Conductor.size());
            String conductorAsignado = Conductor.get(indiceConductor);

            pacientes.add(nombre);
            asignaciones.add(conductorAsignado);

            System.out.println("Paciente registrado: " + nombre + ", Edad: " + edad);
            System.out.println("Conductor asignado: " + conductorAsignado);
        }
    }

    
    
}
