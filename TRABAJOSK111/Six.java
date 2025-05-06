package TRABAJOSK111;

public class Six {
    public static void main(String[] args) {
        String Person = "stiven";
        System.out.println(Person);
        
        String caja = "busco una caja ";
        System.out.println(caja);

        boolean construyoCaja = false;
        boolean noConstruyoCaja = false;

        if (construyoCaja) {
            System.out.println("construyo la caaa");
        } else {
            System.out.println("no construyo la caja ");

            if (noConstruyoCaja) {
                System.out.println("no voy a tener una caja construida ");
            } else {
                System.out.println("voy a tener una caja construida ");
            }
        }
    }
}