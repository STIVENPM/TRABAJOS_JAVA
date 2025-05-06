package TRABAJOSK111;

public class Two {
    public static void main( String[] args ) {
        String Person = "stiven";
        System.out.println(Person);
        boolean camiseta = true;
        boolean camisetaNueva = false;

        if (camiseta) {
            System.out.println("camiseta esta limpia y huele bien");
        } else {
            System.out.println("camiseta esta sucia y hueles a feo");

            if (camisetaNueva) {
                System.out.println("se cambio la camiseta y ya huele bien");
            } else {
                System.out.println("No hay camisetas limpias, Toco aplicarse locion ");
            }
        }
    }
}
