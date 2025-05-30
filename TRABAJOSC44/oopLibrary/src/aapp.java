import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class aapp {
    static List<Bookk> books = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n--- Sistema de Biblioteca ---");
            System.out.println("1. Registrar libro");
            System.out.println("2. Listar libros");
            System.out.println("3. Filtrar libro por título");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scan.nextInt();
            scan.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    registerBook();
                    break;
                case 2:
                    getListBooks();
                    break;
                case 3:
                    filterBookByTitle();
                    break;
                case 5:
                    System.out.println("Chao");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 5);
    }

    public static void registerBook() {
        Bookk book = new Bookk();
        System.out.println("\nIngrese la información del libro:");

        System.out.print("ISBN: ");
        book.isbn = scan.nextLine().trim();

        if (book.isbn.isEmpty()) {
            System.out.println("Error: El ISBN no puede estar vacío.");
            return;
        }

        // Validar ISBN duplicado
        for (Bookk b : books) {
            if (b.isbn.equals(book.isbn)) {
                System.out.println("Error: ISBN repetido.");
                return;
            }
        }

        System.out.print("Título: ");
        book.title = scan.nextLine().trim();
        if (book.title.isEmpty()) {
            System.out.println("Error: El título no puede estar vacío.");
            return;
        }

        System.out.print("Autor: ");
        book.author = scan.nextLine().trim();
        if (book.author.isEmpty()) {
            System.out.println("Error: El autor no puede estar vacío.");
            return;
        }

        System.out.print("Género: ");
        book.genere = scan.nextLine().trim();

        System.out.print("Fecha de publicación (YYYY-MM-DD): ");
        try {
            book.publicationDate = LocalDate.parse(scan.nextLine().trim());
        } catch (DateTimeParseException e) {
            System.out.println("Error: Fecha de publicación incorrecta.");
            return;
        }

        books.add(book);
        System.out.println("El libro se registró correctamente.");
    }

    public static void getListBooks() {
        if (books.isEmpty()) {
            System.out.println("No hay libros registrados.");
            return;
        }

        System.out.println("\n--- Lista de Libros ---");
        for (Bookk b : books) {
            System.out.println(b.toString());
        }
    }

    public static void filterBookByTitle() {
        System.out.print("\nIngrese el título del libro a buscar: ");
        String tituloBuscado = scan.nextLine().trim();
        boolean encontrado = false;

        for (Bookk b : books) {
            if (b.title.equalsIgnoreCase(tituloBuscado)) {
                System.out.println(b.toString());
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Error: No se encontró el libro.");
        }
    }
}
