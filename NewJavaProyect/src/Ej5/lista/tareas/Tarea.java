package Ej5.lista.tareas;
import java.time.*;
import java.util.Scanner;

import java.time.temporal.ChronoUnit;
public class Tarea {
    // atributos
    private final String titulo;
    private final String descripcion;
    private Prioridad prioridad;
    private boolean estado;
    private LocalDate inicio;
    private LocalDate vencimiento;

    // constructor
    public Tarea(String descripcion,String titulo){
        this.descripcion = descripcion;
        this.estado = false;
        this.titulo = titulo;
        setVencimiento();
        setInicio();
        cambiarPrioridad();

    }

    

    // metodos
    public void cambiarPrioridad(){
        Scanner sc = new Scanner(System.in);

        int opc;
        do {
            System.out.println("Seleccione la nueva prioridad para la tarea " + titulo);
            System.out.println("0- BAJA");
            System.out.println("1- MEDIA");
            System.out.println("2- ALTA");
            opc = sc.nextInt();

            switch (opc) {
                case 0:
                    this.prioridad = Prioridad.BAJA;
                    break;
                case 1:
                    this.prioridad = Prioridad.MEDIA;
                    break;
                case 2:
                    this.prioridad = Prioridad.ALTA;
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        } while (opc < 0 || opc > 2);

        System.out.println("La prioridad ha sido cambiada a " + this.prioridad);
    }

    public void mostrarTarea(){
        System.out.println("Titulo : " + titulo);
        System.out.println("Descripcion : " + descripcion);
        System.out.println("Prioridad : " + prioridad);
        System.out.println("Estado : " + (!estado ? "No finalizada" : "Finalizada"));
        System.out.println("Fecha de creación: " + inicio);
        System.out.println("Fecha de vencimiento : " + vencimiento);

    }

    public void tareaVencida(){
        if (inicio.equals(vencimiento)) {
            System.out.println("Tu tarea ha vencido!");
            setEstado(false);
        }
        else{
            System.out.println("Todavía quedan " + ChronoUnit.DAYS.between(inicio,vencimiento) + " dias para que expire");
        }
    }

//    public void tacharTarea(){
//        setEstado(true);
//    }

    // getters and setters


    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public LocalDate getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento() {
        this.vencimiento = LocalDate.now().plusDays(15);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setInicio() {
        this.inicio = LocalDate.now();
    }

}
