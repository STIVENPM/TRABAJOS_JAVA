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
    
    static String[] horarioI = {
        "mañana,6:00 am - 12:00 pm",
        "tarde,12:00 pm - 6:00 pm",
        "noche,6:00 pm - 12:00 pm",

    };
    static String[] coordinadoresSena = {
    "Andrés Gómez, Coordinador Académico - Bogotá",
    "Marta Rodríguez, Coordinadora de Formación - Medellín",
    "Carlos Ramírez, Coordinador Técnico - Cali",
    "Luisa Fernández, Coordinadora Administrativa - Bucaramanga",
    "Juan Pérez, Coordinador Regional - Barranquilla",
    "Natalia Castro, Coordinadora de Proyectos - Pereira",
    "Santiago Ríos, Coordinador General - Cartagena",
    "Diana López, Coordinadora de Ambientes - Cúcuta",
    "Ricardo Torres, Coordinador de Infraestructura - Armenia",
    "Camila Ruiz, Coordinadora de Evaluación - Ibagué"
};
static String[] ambientesFormacion = {
    "Ambiente de Sistemas,Espacio equipado con computadores para formación en programación, redes y software",
    "Ambiente de Electricidad,Área especializada en instalaciones eléctricas residenciales e industriales",
    "Ambiente de Mecánica Industrial,Taller con maquinaria para procesos de torneado, fresado y soldadura",
    "Ambiente de Electrónica,Laboratorio para circuitos electrónicos, robótica y automatización",
    "Ambiente de Gastronomía,Cocina industrial para formación en cocina nacional e internacional",
    "Ambiente de Hotelería,Espacio simulado de hotel para prácticas en recepción y alojamiento",
    "Ambiente de Salud,Ocupado para prácticas en primeros auxilios, enfermería y laboratorio clínico",
    "Ambiente de Diseño Gráfico,Dotado con software y equipos para diseño digital y multimedia",
    "Ambiente de Confección,Taller con máquinas textiles para corte, confección y patronaje",
    "Ambiente de Construcción,Área práctica para albañilería, estructuras metálicas y acabados",
    "Ambiente de Logística,Zona para manejo de inventarios, bodegas y distribución de productos",
    "Ambiente de Mantenimiento de Motores,Taller de reparación de motores diésel y gasolina",
    "Ambiente de Agricultura,Espacio rural para cultivos, riego tecnificado y prácticas agrícolas",
    "Ambiente de Bilingüismo,Sala equipada para enseñanza de inglés con software interactivo",
    "Ambiente de Emprendimiento,Espacio de innovación para creación de ideas de negocio y simulación empresarial"
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




public static void instructorL() {
    System.out.println("Ingresa el número de instructores a asignar a una linea");
    int numeroI = sc.nextInt();

    if (numeroI > 100) {
        System.out.println("No puedes ingresar más de 100 aprendices.");
        return;
    }



    for (int i = 0; i < numeroI; i++) {
        int indiceCentro = random.nextInt(centrosSena.length);
        String centroAsignado = centrosSena[indiceCentro];

        System.out.println("instructor " + (i + 1) + " asignado:");
        System.out.println(" Centro SENA: " + centroAsignado);
        System.out.println();
    }
}

public static void horarioI(){
    System.out.println("Ingresa el número de instructores a asignar el horario:");
    int cantidad = sc.nextInt();

    if (cantidad > 10) {
        System.out.println("No puedes ingresar más de 10 instructores.");
        return;
    }

    for (int i = 0; i < cantidad; i++) {
        int indiceHorario = random.nextInt(horarioI.length); 
        String horarioAsignado = horarioI[indiceHorario];

        int ambienteAsignado = random.nextInt(3) + 1; 

        System.out.println("Instructor " + (i + 1) + " asignado:");
        System.out.println(" Ambiente: " + ambienteAsignado);
        System.out.println("  Horario asignado: " + horarioAsignado);
        System.out.println("---------------------------");
    }
}
public static void  cordinadorI(){
    System.out.println("Ingresa el número de instructores a asignar a la coordinación:");
    int cantidad = sc.nextInt();

    if (cantidad > 10) {
        System.out.println("No puedes ingresar más de 10 instructores.");
        return;
    }
    for (int i = 0; i < cantidad; i++) {
        int indiceCoordinador = random.nextInt(coordinadoresSena.length);
        String coordinadorAsignado = coordinadoresSena[indiceCoordinador];
    System.out.println(" Instructor " + (i + 1) + " asignado:");
    System.out.println(" Coordinador: " + coordinadorAsignado);
    }
   

}
public static void descripcionA(){
    System.out.println(" ingresa el numero de el ambiente que deseas saber su descripcion :");

         for (int i = 0; i < ambientesFormacion.length; i++) {
            System.out.println((i + 1) + ". " + ambientesFormacion[i]);
        }
        System.out.println("ingresa tu opcion");
        int opcion = sc.nextInt();
        
        if (opcion < 1 || opcion > ambientesFormacion.length) {
            System.out.println("opcion no valida.");
            return;
        }
        System.out.println("la descripcion del ambiente q elegiste es: " );
        System.out.println( ambientesFormacion[opcion -1]);
}
public static void horarioA(){
    System.out.println("ingresa el numero de aprendices q quieres asignar a un horario");
    int cantidad = sc.nextInt();

    if (cantidad > 100) {
        System.out.println("No puedes ingresar más de 100 aprendices.");
        return;
    }

    for (int i = 0; i < cantidad; i++) {
        int indiceHorario = random.nextInt(horarioI.length); 
        String horarioAsignado = horarioI[indiceHorario];

        System.out.println("Aprendiz " + (i + 1) + " asignado:");
        System.out.println("Horario: " + horarioAsignado);
}
}
public static void instructorA(){
    System.out.println("ingresa el numero de instructor q quieres asignar a un ambiente");
    int cantidad = sc.nextInt();
    if (cantidad > 10) {
        System.out.println("No puedes ingresar más de 10 instructores.");
        return;
        }
        for (int i = 0; i < cantidad; i++) {
            int ambienteAsignado = random.nextInt(3) + 1; 
            String ambiente = ambientesFormacion[ambienteAsignado - 1];
           
            System.out.println("Instructor " + (i + 1) + " asignado:");
            System.out.println("Ambiente: " + ambiente);   
}
}

}



















    

