import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Guardadas biblioteca = new Guardadas();
        int opcion;

        do {
            System.out.println("1. Dejar una reseña de un libro");
            System.out.println("2. Ver reseñas anteriores");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    dejarResenia(entrada, biblioteca);
                    break;
                case 2:
                    biblioteca.mostrarResenias();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 3);

        entrada.close();
    }



    private static void dejarResenia(Scanner entrada, Guardadas biblioteca) {
        System.out.println("\nIngrese el título del libro: ");
        String titulo = entrada.nextLine();
        System.out.println("Ingrese su nombre: ");
        String usuario = entrada.nextLine();
        System.out.println("Ingrese su calificación (1-10): ");
        int calificacion = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su comentario: ");
        String comentario = entrada.nextLine();

        Resenia nuevaResenia = new Resenia(titulo, usuario, calificacion, comentario);
        biblioteca.agregarResenia(nuevaResenia);

        System.out.println("¡Reseña agregada exitosamente!");
    }


}