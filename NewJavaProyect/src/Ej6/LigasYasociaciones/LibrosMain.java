package Ej6.LigasYasociaciones;

public class LibrosMain {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Jorge");
        Biblioteca biblio = new Biblioteca();
        Libro l1 = new Libro("Cortazar", "Rayuela", 728, 10);
        biblio.AgregarEjemplar(l1);



        biblio.PrestarLibro("Rayuela", "Cortazar", c1);
        biblio.MostrarPrestamos();
        biblio.MostrarLibros();
    }
}
