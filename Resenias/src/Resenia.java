
import java.util.Scanner;

class Resenia {
    private String titulo;
    private String usuario;
    private int calificacion;
    private String comentario;

    public Resenia(String titulo, String usuario, int calificacion, String comentario) {
        this.titulo = titulo;
        this.usuario = usuario;
        this.calificacion = calificacion;
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + "\nUsuario: " + usuario + "\nCalificación: " + calificacion + "\nComentario: " + comentario;
    }
}
