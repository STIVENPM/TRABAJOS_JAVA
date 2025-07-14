package psena;

import java.util.Scanner;
import java.util.Random;

public class Salida {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    static String[] regiones = {
        "Amazonía", 
        "Andina", 
        "Caribe", 
        "Insular", 
        "Orinoquía", 
        "Pacífica"
    };

    static String[] centrosSena = {
        "Centro de Diseño y Metrología - Bogotá",
        "Centro de Gestión de Mercados, Logística y Tecnologías de la Información - Bogotá",
        "Centro Nacional de Hotelería, Turismo y Alimentos - Bogotá",
        "Centro Agroindustrial - Armenia",
        "Centro de Comercio y Servicios - Pereira",
        "Centro de la Industria, la Empresa y los Servicios - Dosquebradas",
        "Centro Industrial del Diseño y la Manufactura - Bucaramanga",
        "Centro Industrial y de Aviación - Barranquilla",
        "Centro de Formación en Actividad Física y Cultura - Cartagena",
        "Centro Agropecuario La Granja - Tolima",
        "Centro Industrial y de Energías Alternativas - Valledupar",
        "Centro de Servicios y Gestión Empresarial - Medellín",
        "Centro de Tecnologías Agroindustriales - Buga",
        "Centro Náutico Pesquero - Buenaventura",
        "Centro Agroecológico y Empresarial - Cundinamarca"
    };

    public static void nombre() {
        System.out.println("Elige el numero de una sede de la region:");

        for (int i = 0; i < regiones.length; i++) {
            System.out.println((i + 1) + ". " + regiones[i]);
        }

        System.out.print("Ingresa tu opcion: ");
        int regionSeleccionada = sc.nextInt();

        
        if (regionSeleccionada < 1 || regionSeleccionada > regiones.length) {
            System.out.println("Region no valida.");
            return;
        }

        String regionElegida = regiones[regionSeleccionada -1];

        System.out.println("Ahora elige el numero del centro de formacion:");

        for (int i = 0; i < centrosSena.length; i++) {
            System.out.println((i + 1) + ". " + centrosSena[i]);
        }

        System.out.print("Ingresa tu opcion: ");
        int centroSeleccionado = sc.nextInt();

        if (centroSeleccionado < 1 || centroSeleccionado > centrosSena.length) {
            System.out.println("Centro no valido.");
            return;
        }

        String centroElegido = centrosSena[centroSeleccionado - 1];

        System.out.println("\n--- Resultado ---");
        System.out.println("Region elegida: " + regionElegida);
        System.out.println("Centro de formacion elegido: " + centroElegido);
        System.out.println();
    }
    
public static void ambientes(){
    System.out.println("1. ingresa el numero de un ambientes q decea crear");
    System.out.println("que no sea mayor a 10 ambientes");
    int numeroA = sc.nextInt();

    if (numeroA > 10) {
        System.out.println("No puedes crear mas de 10 ambientes ");
        return; 
    }

     System.out.println("--- Ambientes normales creados ---");
    for (int i = 0; i < numeroA; i++) {
        int indiceCentro = random.nextInt(centrosSena.length);
        String centroAsignado = centrosSena[indiceCentro];

        System.out.println("Ambiente " + (i + 1) + " asignado al centro: " + centroAsignado);
    }

    System.out.println("2. ingresa el numero de ambientes especiales q deseas crear");
    System.out.println("que no sea mayor a 10 ambientes especiales ");
    int numeroS = sc.nextInt();

    if (numeroS > 10) {
        System.out.println("No puedes crear mas de 10 ambientes especiales ");
        return;
        }
System.out.println("--- Ambientes especiales creados ---");
    for (int i = 0; i < numeroS; i++) {
        int indiceCentro = random.nextInt(centrosSena.length);
        String centroAsignado = centrosSena[indiceCentro];

        System.out.println("Ambiente especial " + (i + 1) + " asignado al centro: " + centroAsignado);
    }

    System.out.println("reporte: creaste " + numeroA + " ambientes normales y " + numeroS + " ambientes especiales.");
}

public static void asignacionA() {
    System.out.println("Ingresa el número de aprendices que deseas asignar:");
    int numeroA = sc.nextInt();

    if (numeroA > 100) {
        System.out.println("No puedes asignar más de 100 aprendices.");
        return;
    }


    for (int i = 0; i < numeroA; i++) {
        int indiceCentro = random.nextInt(centrosSena.length);
        String centroAsignado = centrosSena[indiceCentro];

        int ambienteAsignado = random.nextInt(15) + 1; 

        System.out.println("Aprendiz " + (i + 1) + " asignado:");
        System.out.println(" Ambiente: Ambiente " + ambienteAsignado);
        System.out.println(" Centro SENA: " + centroAsignado);
        System.out.println();
    }

}




public static void instructorA() {
    System.out.println("Ingresa el número de instructores a asignar a una linea");
    int numeroI = sc.nextInt();

    if (numeroI > 100) {
        System.out.println("No puedes ingresar más de 100 aprendices.");
        return;
    }



    for (int i = 0; i < numeroI; i++) {
        int indiceCentro = random.nextInt(centrosSena.length);
        String centroAsignado = centrosSena[indiceCentro];

        int ambienteAsignado = random.nextInt(15) + 1; 

        System.out.println("instructor " + (i + 1) + " asignado:");
        System.out.println(" Ambiente: Ambiente " + ambienteAsignado);
        System.out.println(" Centro SENA: " + centroAsignado);
        System.out.println();
    }
}
}














    

