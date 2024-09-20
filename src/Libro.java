public class Libro {

    String nombre;
    String autor;
    int numeroPaginas;
    int anoPublicacion;

    public Libro(String nombre, String autor, int numeroPaginas, int anoPublicacion) {
        this.nombre = nombre;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.anoPublicacion = anoPublicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    // Mostra datos de los libros
public void mostrarDatosLibros(){
    System.out.println("Nombre: " + nombre);
    System.out.println("Autor: " + autor);
    System.out.println("Pagina: " + numeroPaginas);
    System.out.println("Publicaciòn: " + anoPublicacion);
}

}
