package Ej6.LigasYasociaciones;
import java.time.LocalDate;
import java.util.ArrayList;
//import java.util.Scanner;

public class Biblioteca {
    // atributos
    private ArrayList<Libro> libros = new ArrayList<Libro>();
    private ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();
    // constructor

    // metodos
    public void AgregarEjemplar(Libro nuevoLibro){
        libros.add(nuevoLibro);
    }
    public void PrestarLibro(String titulo,String autor,Cliente prestatario){
        Prestamo prestamo = new Prestamo();
        if (prestatario.isHabilitado()) {
            for (Libro libro : libros) {
                if (libro.getAutor() == autor && libro.getTitulo() == titulo) {
                    libro.PrestarEjemplar();
                    
                    prestamo.setFechaPrestado();
                    prestamo.setLibroPrestado(libro);
                    prestamo.setSocio(prestatario);
                    prestamo.setFechaDevolucion();
                    prestamos.add(prestamo);
                }
            }
        }
        else{
            System.out.println("el prestatario no puede tomar prestado un libro por inhabilitacion");
        }
        
    }

    public void DevolverLibro(Libro libro,Cliente prestatario){
        for (int i = 0; i < prestamos.size(); i++) {
            if (prestamos.get(i).getFechaDevolucion().equals(LocalDate.now())) {
                libro.DevolverEjemplar();
            }
            else{
                libro.DevolverEjemplar();
                prestatario.setHabilitado(false);
            }
        }
    }

    public void MostrarPrestamos(){
        System.out.println("Prestamos efectuados en la biblioteca!");
        for (Prestamo prestamo : prestamos) {
            prestamo.MostrarPrestamo();
        }
    }

    public void MostrarLibros(){
        System.out.println("Libros existentes en la biblioteca!");
        for (Libro libro : libros) {
            libro.MostrarLibro();
        }
    }
    // getters and setters
    
}
