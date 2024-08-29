package Ej6.LigasYasociaciones;

public class Libro {

    // atributos
    private String autor;
    private String titulo;
    private int nroPaginas;
    private int cantEjemplares;
    private int ejemplaresPrestados;

    // constructor
    public Libro(String autor, String titulo, int nroPaginas, int cantEjemplares) {
        this.autor = autor;
        this.titulo = titulo;
        this.nroPaginas = nroPaginas;
        this.cantEjemplares = cantEjemplares;
    }

    // metodos
    

    public void PrestarEjemplar(){
        if (cantEjemplares > 1) {
            System.out.println("El libro ha sido prestado con exito!");
            cantEjemplares--;
            ejemplaresPrestados++;
        }
        else{
            System.out.println("El libro no se puede prestar por falta de existencias!");
        }
    }


    public void DevolverEjemplar(){
        cantEjemplares++;
    }
    public void MostrarLibro(){
        System.out.println("Autor: " + autor);
        System.out.println("Titulo: " + titulo);
        System.out.println("Numero de paginas: " + nroPaginas);
        System.out.println("Cantidad de ejemplares: " + cantEjemplares);
        System.out.println("Ejemplares prestados: " + ejemplaresPrestados);
        
    }

    // getters and setters
    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNroPaginas() {
        return nroPaginas;
    }

    public int getCantEjemplares() {
        return cantEjemplares;
    }

    public int getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setCantEjemplares(int cantEjemplares) {
        this.cantEjemplares = cantEjemplares;
    }

    public void setEjemplaresPrestados(int ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    

    


}

    
