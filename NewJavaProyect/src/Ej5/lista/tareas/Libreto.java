package Ej5.lista.tareas;
import java.util.ArrayList;

public class Libreto {
    // atributos
    private ArrayList<Tarea> tareas = new ArrayList<Tarea>();

    //constructor

    // metodos
    public void MostrarTareas(){
        for (Tarea tarea : tareas) {
            tarea.MostrarTarea();
        }
    }
    // getters and setters

}
