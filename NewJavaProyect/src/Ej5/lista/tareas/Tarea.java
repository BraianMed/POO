package Ej5.lista.tareas;
import java.time.*;
import java.util.Scanner;

import java.time.temporal.ChronoUnit;
public class Tarea {
    // atributos
    private String descripcion;
    private Prioridad prioridad;
    private boolean estado = true; // false = incompleta   true = completada
    private LocalDate inicio;
    private LocalDate vencimiento;

    // constructor
    public Tarea(String descripcion,Prioridad prioridad){
        this.descripcion = descripcion;
        cambiarPrioridad();
        this.estado = false;
    }

    

    // metodos
    public void cambiarPrioridad(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione la nueva prioridad");   
        System.out.println("0- BAJA");   
        System.out.println("1- MEDIA");   
        System.out.println("2- ALTA");   
        int opc = sc.nextInt();
        while (this.prioridad == null) {
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
                    System.out.println("Opcion no valida intente denuevo!");
            }
        }
        
        sc.close();
        System.out.println("La prioridad ha sido cambiada a " + this.prioridad);
    }

    public void MostrarTarea(){
        System.out.println("Descripcion : " + descripcion);
        System.out.println("Prioridad : " + prioridad);
        System.out.println("Estado : " + (!estado ? "No finalizada" : "Finalizada"));
        System.out.println("Fecha de vencimiento : " + vencimiento);

    }

    public void TareaVencida(){
        if (inicio.equals(vencimiento)) {
            System.out.println("Tu tarea ha vencido!");
            this.estado = false;
        }
        else{
            System.out.println("Todavia quedan " + ChronoUnit.DAYS.between(inicio,vencimiento) + " dias para que expire");
        }
    }

    // getters and setters
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }

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
    
}
