public class BaseBiblioteca {
    public static void main(String[] args) {
        Libro libroUno = new Libro("El principito", "Antoine de Saint", 203, 1960);
        Libro libroDos = new Libro("Cien años de soledad", "Gabriel Garcia Marquez", 2312, 1990);
        System.out.println("Datos libro uno");
        libroUno.mostrarDatosLibros();
        System.out.println("______________________________________________");
        System.out.println("Datos libro dos");
        System.out.println("Nombre: " + libroDos.getNombre());
        System.out.println("Autor: " + libroDos.getAutor());
        System.out.println("Paginas: " + libroDos.getNumeroPaginas());
        System.out.println("Publicacion: " + libroDos.getAnoPublicacion());
        System.out.println("______________________________________________");
        System.out.println("Nombre libro Dos: " + libroDos.getNombre());
        libroDos.setNombre("Cronica de una muerte anunciada");
        System.out.println("Nombre de libro modificado: " + libroDos.getNombre());


    }
}
