package TRABAJOSP11;
import java.util.Scanner;

public class xxxxx {
     public static void main(String[] args) {
        Scanner SP = new Scanner(System.in);
        int A, B, C,D, opcion, estado = 0, distancia,promedio,voto;
        double a, b, c, d, R;

        do {
            System.out.println("Seleccione un ejercicio:");
             System.out.println("1. Calcular distancia");
              System.out.println("2. Calcular promedio");
               System.out.println("3. Calcular puntaje de examen");
                System.out.println("4. Calcular puntaje de partidos");
                 System.out.println("5. Calcular sueldo");
                  System.out.println("6. Calcular área de triángulo");
                   System.out.println("7. Calcular CDs necesarios");
                    System.out.println("8. Distancia entre dos puntos");
                     System.out.println("9. Verifica si debe sacar la cédula");
                      System.out.println("10. Compara dos edades");
                       System.out.println("11. Producción semanal y promedio");
                        System.out.println("12. Mayor de tres números");
                         System.out.println("13. Clasificar triángulo");
                          System.out.println("14. Número a romano");
                           System.out.println("15. Bonificación por ventas");
                            System.out.println("16. Número a letra");
                             System.out.println("17. Decenas y unidades");
                            System.out.println("18. Par o impar");
                           System.out.println("19. Primeros cinco pares");
                          System.out.println("20. Sueldo promedio");
                         System.out.println("21. Contar mayores y menores de edad");
                        System.out.println("22. Multiplicación por sumas sucesivas");
                       System.out.println("23. Mostrar impares del 1 al 10");
                      System.out.println("24. Sucesión: A = A*A + 1");
                     System.out.println("25. Detectar vocal y finalizar");
                    System.out.println("26. Serie de Fibonacci hasta 100000");
                   System.out.println("27. Calculadora básica con operadores");
                  System.out.println("28. Contar vocales y consonantes");
                 System.out.println("29. Simulación de votación con ganador");

            System.out.println("0. Salir");

            opcion = SP.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Digite a: ");
                    A = SP.nextInt();
                    System.out.println("Digite b: ");
                    B = SP.nextInt();
                    System.out.println("Resultado: " + (A * B));
                    break;

                case 2:
                    System.out.println("Ingrese la primera nota: ");
                    A = SP.nextInt();
                    System.out.println("Ingrese la segunda nota: ");
                    B = SP.nextInt();
                    System.out.println("Ingrese la tercera nota: ");
                    C = SP.nextInt();
                    System.out.println("El promedio final es: " + (A + B + C) / 3);
                    break;

                case 3:
                    System.out.println("Número de respuestas correctas: ");
                    A = SP.nextInt();
                    System.out.println("Número de respuestas incorrectas: ");
                    B = SP.nextInt();
                    System.out.println("Número de respuestas en blanco: ");
                    C = SP.nextInt();
                    System.out.println("Puntaje final: " + ((A * 4) + (B * 1)));
                    break;

                case 4:
                    System.out.print("Ingrese la cantidad de partidos ganados: ");
                    A = SP.nextInt();
                    System.out.print("Ingrese la cantidad de partidos empatados: ");
                    B = SP.nextInt();
                    System.out.print("Ingrese la cantidad de partidos perdidos: ");
                    C = SP.nextInt();
                    System.out.println("El puntaje total es: " + ((A * 3) + (B * 1)));
                    break;

                case 5:
                    System.out.print("Ingrese las horas laboradas en el mes: ");
                    A = SP.nextInt();
                    System.out.print("Ingrese la tarifa por hora: ");
                    B = SP.nextInt();
                    System.out.println("El total a pagar es: " + (A * B));
                    break;

                case 6:
                    System.out.print("Ingrese un lado del triángulo: ");
                    a = SP.nextDouble();
                    System.out.print("Ingrese el segundo lado: ");
                    b = SP.nextDouble();
                    System.out.print("Ingrese el tercer lado: ");
                    c = SP.nextDouble();
                    d = (a + b + c) / 2;
                    System.out.println("El área del triángulo es: " + Math.sqrt(d * (d - a) * (d - b) * (d - c)));
                    break;

                case 7:
                    System.out.print("Ingrese la cantidad en GB: ");
                    a = SP.nextDouble();
                    b = a * 1024;
                    C = (int) ((b / 700) + 1);
                    System.out.println("CDs necesarios: " + C);
                    break;

                case 8:
                    System.out.print("Ingrese x1: ");
                    A = SP.nextInt();
                    System.out.print("Ingrese y1: ");
                    B = SP.nextInt();
                    System.out.print("Ingrese x2: ");
                    C = SP.nextInt();
                    System.out.print("Ingrese y2: ");
                    d = SP.nextInt();
                    distancia = (int) Math.sqrt(Math.pow(C - A, 2) + Math.pow(d - B, 2));
                    System.out.println("La distancia es: " + distancia);
                    break;

                case 9:
                    System.out.print("Ingrese su edad: ");
                    a = SP.nextInt();
                    if (a >= 18) {
                        System.out.println("Debe solicitar la cédula");
                    } else {
                        System.out.println("No debe solicitar la cédula");
                    }
                    break;

                case 10:
                    System.out.print("Ingrese primera edad: ");
                    a = SP.nextInt();
                    System.out.print("Ingrese segunda edad: ");
                    b = SP.nextInt();
                    if (a > b) {
                        System.out.println("La primera edad es mayor");
                    } else if (b > a) {
                        System.out.println("La segunda edad es mayor");
                    } else {
                        System.out.println("Ambas edades son iguales");
                    }
                    break;

                case 11:
                    A = 0;
                    for (a = 1; a <= 7; a++) {
                        System.out.print("Ingrese producción del día " + a + ": ");
                        B = SP.nextInt();
                        A += B;
                    }
                    promedio = A / 7;
                    System.out.println("Producción total: " + A);
                    System.out.println("Promedio: " + promedio);
                    if (promedio >= 100) {
                        System.out.println("Recibe incentivo");
                    } else {
                        System.out.println("No recibe incentivo");
                    }
                    break;

                case 12:
                    System.out.print("Ingrese A: ");
                    A = SP.nextInt();
                    System.out.print("Ingrese B: ");
                    B = SP.nextInt();
                    System.out.print("Ingrese C: ");
                    C = SP.nextInt();
                    if (A > B && A > C) {
                        System.out.println("A es el mayor");
                    } else if (B > A && B > C) {
                        System.out.println("B es el mayor");
                    } else if (C > A && C > B) {
                        System.out.println("C es el mayor");
                    } else {
                        System.out.println("Hay dos o más números iguales");
                    }
                    break;

                case 13:
                    System.out.print("Ingrese lado A: ");
                    a = SP.nextInt();
                    System.out.print("Ingrese lado B: ");
                    b = SP.nextInt();
                    System.out.print("Ingrese lado C: ");
                    c = SP.nextInt();
                    if (a == b && b == c) {
                        System.out.println("Equilátero");
                    } else if (a == b || b == c || a == c) {
                        System.out.println("Isósceles");
                    } else {
                        System.out.println("Escaleno");
                    }
                    break;

                case 14:
                    System.out.print("Ingrese un número del 1 al 10: ");
                    a = SP.nextInt();
                    switch ((int) a) {
                        case 1:
                            System.out.println("I");
                            break;
                        case 2:
                            System.out.println("II");
                            break;
                        case 3:
                            System.out.println("III");
                            break;
                        case 4:
                            System.out.println("IV");
                            break;
                        case 5:
                            System.out.println("V");
                            break;
                        case 6:
                            System.out.println("VI");
                            break;
                        case 7:
                            System.out.println("VII");
                            break;
                        case 8:
                            System.out.println("VIII");
                            break;
                        case 9:
                            System.out.println("IX");
                            break;
                        case 10:
                            System.out.println("X");
                            break;
                        default:
                            System.out.println("Fuera de rango");
                    }
                    break;
                          case 15:
                    System.out.print("Ingrese el monto de ventas: "); 
                    a = SP.nextDouble();
                    if (a >= 1000) {
                        b = a * 0.10;
                    } else {
                        b = a * 0.05;
                    }
                    System.out.println("Bonificacion: " + b);
                    break;


               case 16:
    System.out.print("Ingrese número del 1 al 10: ");
    a = SP.nextInt();
    switch ((int) a) {
        case 1:
            System.out.println("Letra: A");
            break;
        case 2:
            System.out.println("Letra: B");
            break;
        case 3:
            System.out.println("Letra: C");
            break;
        case 4:
            System.out.println("Letra: D");
            break;
        case 5:
            System.out.println("Letra: E");
            break;
        case 6:
            System.out.println("Letra: F");
            break;
        case 7:
            System.out.println("Letra: G");
            break;
        case 8:
            System.out.println("Letra: H");
            break;
        case 9:
            System.out.println("Letra: I");
            break;
        case 10:
            System.out.println("Letra: J");
            break;
        default:
            System.out.println("Fuera de rango");
    }
    break;

                case 17:
                    System.out.print("Ingrese número de dos cifras: ");
                    a = SP.nextInt();
                    if (a >= 10 && a <= 99) {
                        b = a / 10;
                        c = a % 10;
                        System.out.println("Decenas: " + b);
                        System.out.println("Unidades: " + c);
                    } else {
                        System.out.println("No es de dos cifras");
                    }
                    break;
 
                case 18:
                    System.out.print("Ingrese un número: ");
                    a = SP.nextInt();
                    if (a % 2 == 0) {
                        System.out.println("Es par");
                    } else {
                        System.out.println("Es impar");
                    }
                    break;

                case 19:
                    for (a = 2; a <= 10; a += 2) {
                        System.out.println(a);
                    }
                    break;

                case 20:
                    System.out.print("Ingrese cantidad de empleados: ");
                    a = SP.nextInt();
                    B = 0;
                    for (b = 1; b <= a; b++) {
                        System.out.print("Sueldo del empleado " + b + ": ");
                        C = SP.nextInt();
                        B += C;
                    }
                    System.out.println("Sueldo promedio: " + (B / a));
                    break;
                                    case 21:
                        int MAY = 0, MEN = 0, EP;
                        for (int k = 1; k <= 10; k++) {
                            System.out.print("ingresa tu edad " + k + ": ");
                            EP = SP.nextInt();
                            if (EP < 18) {
                                MEN++;
                            } else {
                                MAY++;
                            }
                        }
                        System.out.println("MENORES de 18: " + MEN);
                        System.out.println("MAYORES de 18: " + MAY);
                        break;

                    case 22:
                        System.out.print("ingrese el primer numero: ");
                        A = SP.nextInt();
                        System.out.print("ingrese el segundo numero: ");
                        B = SP.nextInt();
                        C = 0;
                        for (int k = 1; k <= B; k++) {
                            C = C + A;
                        }
                        System.out.println("el producto es: " + C);
                        break;

                    case 23:
                        for (int k = 1; k <= 10; k++) {
                            if (k % 2 != 0) {
                                System.out.println(k);
                            }
                        }
                        break;

                    case 24:
                        A = 1;
                        while (A < 1000) {
                            System.out.println(A);
                            A = (A * A) + 1;
                        }
                        break;

                    case 25:
                        String semaf = "V";
                        char letra;
                        while (semaf.equals("V")) {
                            System.out.print("Ingrese una letra: ");
                            letra = SP.next().charAt(0);
                            switch (Character.toLowerCase(letra)) {
                                case 'a':
                                case 'e':
                                case 'i':
                                case 'o':
                                case 'u':
                                    semaf = "R";
                                    break;
                                default:
                                    semaf = "V";
                            }
                        }
                        System.out.println("Ingresaste una vocal. Fin del programa.");
                        break;

                    case 26:
                        A = 0;
                        B = 1;
                        C = A + B;
                        System.out.print(A + ", " + B);
                        while (C < 100000) {
                            System.out.print(", " + C);
                            A = B;
                            B = C;
                            C = A + B;
                        }
                        System.out.println();
                        break;

                    case 27:
                        R = 0;
                        String OP;
                        System.out.print("Ingrese el primer numero: ");
                        A = SP.nextInt();
                        System.out.print("Ingrese el segundo numero: ");
                        B = SP.nextInt();
                        System.out.print("Ingrese el operador (+, -, *, ^): ");
                        OP = SP.next();
                        switch (OP) {
                            case "+":
                                R = A + B;
                                break;
                            case "-":
                                R = A - B;
                                break;
                            case "*":
                                R = A * B;
                                break;
                            case "^":
                                R = Math.pow(A, B);
                                break;
                            default:
                                R = 0;
                                System.out.println("Operador no valido. Resultado por defecto: 0");
                        }
                        System.out.println("Resultado: " + R);
                        break;

                    case 28:
                        int NV = 0, NC = 0;
                        for (int k = 1; k <= 10; k++) {
                            System.out.print("Ingrese una letra: ");
                            letra = SP.next().charAt(0);
                            letra = Character.toLowerCase(letra);
                            switch (letra) {
                                case 'a':
                                case 'e':
                                case 'i':
                                case 'o':
                                case 'u':
                                    NV++;
                                    break;
                                default:
                                    if (Character.isLetter(letra)) {
                                        NC++;
                                    } else {
                                        System.out.println("No es una letra valida.");
                                    }
                            }
                        }
                        System.out.println("Numero de vocales: " + NV);
                        System.out.println("Numero de consonantes: " + NC);
                        break;

                     case 29:
                    A = 0; 
                    B = 0; 
                    C = 0; 
                    D = 0; 
                    for (int k = 1; k <= 16; k++) {
                        System.out.print("Elector #" + k + " - Ingrese su voto (1, 2, 3, otro=nulo): ");
                         voto = SP.nextInt();
                        switch (voto) {
                            case 1:
                                A++;
                                break;
                            case 2:
                                B++;
                                break;
                            case 3:
                                C++;
                                break;
                            default:
                                D++;
                        }
                    }

                    if ((A > B) && (A > C) && (A > D)) {
                        voto = 1;
                    } else if ((B > A) && (B > C) && (B > D)) {
                        voto = 2;
                    } else if ((C > A) && (C > B) && (C > D)) {
                        voto = 3;
                    } else {
                        voto = 0;
                    }
                    System.out.println("Candidato 1: " + A + " votos");
                    System.out.println("Candidato 2: " + B + " votos");
                    System.out.println("Candidato 3: " + C + " votos");
                       break;
                case 0:
                    System.out.println("¡Hasta pronto!");
                    estado = 1;
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (estado == 0);

        SP.close();
    }
}
    

