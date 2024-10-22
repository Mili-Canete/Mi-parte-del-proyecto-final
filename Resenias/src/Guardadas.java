import java.util.ArrayList;
class Guardadas {
    private ArrayList<Resenia> resenias;

    public Guardadas() {
        this.resenias = new ArrayList<>();
    }

    public void agregarResenia(Resenia resenia) {
        resenias.add(resenia);
    }

    public void mostrarResenias() {
        if (resenias.isEmpty()) {
            System.out.println("\nNo hay reseñas disponibles.");
        } else {
            System.out.println("\nReseñas anteriores:");
            for (Resenia resenia : resenias) {
                System.out.println("-----------------------------");
                System.out.println(resenia.toString());
            }
        }
    }
}