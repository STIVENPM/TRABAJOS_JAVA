package TRABAJOSP;
import java.util.Scanner;

public class TRABAJOSTODOS {
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
                            System.out.println("16. Numero a letra");
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
                System.out.println("30. sacar el promedio de dos numeros ");
            

            System.out.println("0. Salir");

            opcion = SP.nextInt();

            switch (opcion) {
                 case 1:
                     System.out.println("digite a: ");
                     A = SP.nextInt();
                     System.out.println("digite b: ");
                     B = SP.nextInt();
                     System.out.println("resultado: " + (A * B));
                     break;

                 case 2:
                     System.out.println("ingrese la primera nota: ");
                     A = SP.nextInt();
                     System.out.println("ingrese la segunda nota: ");
                     B = SP.nextInt();
                     System.out.println("ingrese la tercera nota: ");
                     C = SP.nextInt();
                     System.out.println("el promedio final es: " + (A + B + C) / 3);
                     break;

                 case 3:
                     System.out.println("numero de respuestas correctas: ");
                     A = SP.nextInt();
                     System.out.println("numero de respuestas incorrectas: ");
                     B = SP.nextInt();
                     System.out.println("numero de respuestas en blanco: ");
                     C = SP.nextInt();
                     System.out.println("puntaje final: " + ((A * 4) + (B * 1)));
                     break;

                 case 4:
                     System.out.print("ingrese la cantidad de partidos ganados: ");
                     A = SP.nextInt();
                     System.out.print("ingrese la cantidad de partidos empatados: ");
                     B = SP.nextInt();
                     System.out.print("ingrese la cantidad de partidos perdidos: ");
                     C = SP.nextInt();
                     System.out.println("el puntaje total es: " + ((A * 3) + (B * 1)));
                     break;

                 case 5:
                     System.out.print("ingrese las horas laboradas en el mes: ");
                     A = SP.nextInt();
                     System.out.print("ingrese la tarifa por hora: ");
                     B = SP.nextInt();
                     System.out.println("el total a pagar es: " + (A * B));
                     break;

                 case 6:
                     System.out.print("ingrese un lado del triangulo: ");
                     a = SP.nextDouble();
                     System.out.print("ingrese el segundo lado: ");
                     b = SP.nextDouble();
                     System.out.print("ingrese el tercer lado: ");
                     c = SP.nextDouble();
                     d = (a + b + c) / 2;
                     System.out.println("el area del triangulo es: " + Math.sqrt(d * (d - a) * (d - b) * (d - c)));
                     break;

                 case 7:
                     System.out.print("ingrese la cantidad en gb: ");
                     a = SP.nextDouble();
                     b = a * 1024;
                     C = (int) ((b / 700) + 1);
                     System.out.println("cds necesarios: " + C);
                     break;

                 case 8:
                     System.out.print("ingrese x1: ");
                     A = SP.nextInt();
                     System.out.print("ingrese y1: ");
                     B = SP.nextInt();
                     System.out.print("ingrese x2: ");
                     C = SP.nextInt();
                     System.out.print("ingrese y2: ");
                     d = SP.nextInt();
                     distancia = (int) Math.sqrt(Math.pow(C - A, 2) + Math.pow(d - B, 2));
                     System.out.println("la distancia es: " + distancia);
                     break;

                 case 9:
                     System.out.print("ingrese su edad: ");
                     a = SP.nextInt();
                     if (a >= 18) {
                         System.out.println("debe solicitar la cedula");
                     } else {
                         System.out.println("no debe solicitar la cedula");
                     }
                     break;

                 case 10:
                     System.out.print("ingrese primera edad: ");
                     a = SP.nextInt();
                     System.out.print("ingrese segunda edad: ");
                     b = SP.nextInt();
                     if (a > b) {
                         System.out.println("la primera edad es mayor");
                     } else if (b > a) {
                         System.out.println("la segunda edad es mayor");
                     } else {
                         System.out.println("ambas edades son iguales");
                     }
                     break;

                 case 11:
                     A = 0;
                     for (a = 1; a <= 7; a++) {
                         System.out.print("ingrese produccion del dia " + a + ": ");
                         B = SP.nextInt();
                         A += B;
                     }
                     promedio = A / 7;
                     System.out.println("produccion total: " + A);
                     System.out.println("promedio: " + promedio);
                     if (promedio >= 100) {
                         System.out.println("recibe incentivo");
                     } else {
                         System.out.println("no recibe incentivo");
                     }
                     break;

                 case 12:
                     System.out.print("ingrese a: ");
                     A = SP.nextInt();
                     System.out.print("ingrese b: ");
                     B = SP.nextInt();
                     System.out.print("ingrese c: ");
                     C = SP.nextInt();
                     if (A > B && A > C) {
                         System.out.println("a es el mayor");
                     } else if (B > A && B > C) {
                         System.out.println("b es el mayor");
                     } else if (C > A && C > B) {
                         System.out.println("c es el mayor");
                     } else {
                         System.out.println("hay dos o mas numeros iguales");
                     }
                     break;

                 case 13:
                     System.out.print("ingrese lado a: ");
                     a = SP.nextInt();
                     System.out.print("ingrese lado b: ");
                     b = SP.nextInt();
                     System.out.print("ingrese lado c: ");
                     c = SP.nextInt();
                     if (a == b && b == c) {
                         System.out.println("equilatero");
                     } else if (a == b || b == c || a == c) {
                         System.out.println("isosceles");
                     } else {
                         System.out.println("escaleno");
                     }
                     break;

                 case 14:
                     System.out.print("ingrese un numero del 1 al 10: ");
                     a = SP.nextInt();
                     switch ((int) a) {
                         case 1:
                             System.out.println("i");
                             break;
                         case 2:
                             System.out.println("ii");
                             break;
                         case 3:
                             System.out.println("iii");
                             break;
                         case 4:
                             System.out.println("iv");
                             break;
                         case 5:
                             System.out.println("v");
                             break;
                         case 6:
                             System.out.println("vi");
                             break;
                         case 7:
                             System.out.println("vii");
                             break;
                         case 8:
                             System.out.println("viii");
                             break;
                         case 9:
                             System.out.println("ix");
                             break;
                         case 10:
                             System.out.println("x");
                             break;
                         default:
                             System.out.println("fuera de rango");
                     }
                     break;
                                      case 15:
                     System.out.print("ingrese el monto de ventas: ");
                     a = SP.nextDouble();
                     if (a >= 1000) {
                         b = a * 0.10;
                     } else {
                         b = a * 0.05;
                     }
                     System.out.println("bonificacion: " + b);
                break;
            

                case 16:
         System.out.print("ingrese numero del 1 al 10: ");
         a = SP.nextInt();
         switch ((int) a) {
             case 1:
                 System.out.println("letra: a");
                 break;
             case 2:
                 System.out.println("letra: b");
                 break;
             case 3:
                 System.out.println("letra: c");
                 break;
             case 4:
                 System.out.println("letra: d");
                 break;
             case 5:
                 System.out.println("letra: e");
                 break;
             case 6:
                 System.out.println("letra: f");
                 break;
             case 7:
                 System.out.println("letra: g");
                 break;
             case 8:
                 System.out.println("letra: h");
                 break;
             case 9:
                 System.out.println("letra: i");
                 break;
             case 10:
                 System.out.println("letra: j");
                 break;
             default:
                 System.out.println("fuera de rango");
         }
         break;

                 case 17:
                     System.out.print("ingrese numero de dos cifras: ");
                     a = SP.nextInt();
                     if (a >= 10 && a <= 99) {
                         b = a / 10;
                         c = a % 10;
                         System.out.println("decenas: " + b);
                         System.out.println("unidades: " + c);
                     } else {
                         System.out.println("no es de dos cifras");
                     }
                     break;

                 case 18:
                     System.out.print("ingrese un numero: ");
                     a = SP.nextInt();
                     if (a % 2 == 0) {
                         System.out.println("es par");
                     } else {
                         System.out.println("es impar");
                     }
                     break;

                 case 19:
                     for (a = 2; a <= 10; a += 2) {
                         System.out.println(a);
                     }
                     break;

                 case 20:
                     System.out.print("ingrese cantidad de empleados: ");
                     a = SP.nextInt();
                     B = 0;
                     for (b = 1; b <= a; b++) {
                         System.out.print("sueldo del empleado " + b + ": ");
                         C = SP.nextInt();
                         B += C;
                     }
                     System.out.println("sueldo promedio: " + (B / a));
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
                         System.out.println("menores de 18: " + MEN);
                         System.out.println("mayores de 18: " + MAY);
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
                             System.out.print("ingrese una letra: ");
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
                         System.out.println("ingresaste una vocal. fin del programa.");
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
                         System.out.print("ingrese el primer numero: ");
                         A = SP.nextInt();
                         System.out.print("ingrese el segundo numero: ");
                         B = SP.nextInt();
                         System.out.print("ingrese el operador (+, -, *, ^): ");
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
                                 System.out.println("operador no valido. resultado por defecto: 0");
                         }
                         System.out.println("resultado: " + R);
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
                    case 30:{
                System.out.println("Numero 1:");
                A = SP.nextInt();
                System.out.println("Numero 2:");
                B = SP.nextInt();
                System.out.println("resultado: " + (A + B)/2);
            break;}

                default:
                    System.out.println("Opción no valida. Intente de nuevo.");
            }
        } while (estado == 0);

        SP.close();
    }
}
    

