package Ej6.LigasYasociaciones;
import java.time.*;


public class Prestamo {

    // atributos
    private Cliente socio;
    private Libro libroPrestado;
    private LocalDate fechaPrestado;
    private LocalDate fechaDevolucion;
    private LocalDate fechaDevuelto;
    

    // constructor

    // metodos

    public void MostrarPrestamo(){
        System.out.println("Prestatario: " + socio.getNombre());
        System.out.println("Libro prestado : " + libroPrestado.getTitulo());
        System.out.println("Fecha en la que se presto el libro : " + fechaPrestado);
        System.out.println("Fecha en la que deberia devolver el libro : " + fechaDevolucion);
        if (fechaDevuelto == null) {
            System.out.println("El libro en cuestion no fue devuelto de momento...");
        }
        else{
            System.out.println("Fecha en la que devolvio el libro : " + fechaDevuelto);
        }
    
    }

    

    // getters and setters 
    
    public Cliente getSocio() {
        return socio;
    }


    public Libro getLibroPrestado() {
        return libroPrestado;
    }


    public LocalDate getFechaPrestado() {
        return fechaPrestado;
    }


    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }


    public LocalDate getFechaDevuelto() {
        return fechaDevuelto;
    }


    public void setFechaPrestado() {
        this.fechaPrestado = LocalDate.now();
    }
    public void setFechaDevolucion() {
        
        this.fechaDevolucion = LocalDate.now().plusDays(15);
    }
    public void setFechaDevuelto() {
        this.fechaDevuelto = LocalDate.now();
    }
    public void setSocio(Cliente socio) {
        this.socio = socio;
    }

    public void setLibroPrestado(Libro libroPrestado) {
        this.libroPrestado = libroPrestado;
    }

}
