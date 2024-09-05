package Ej5.lista.tareas;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;

public class Libreto {
    // atributos
    private final ArrayList<Tarea> tareas = new ArrayList<>();

    //constructor

    // metodos
    public void mostrarTareas(){
        for (Tarea tarea : tareas) {
            tarea.mostrarTarea();
        }
    }
    public void ordenarLista(){
        // ordenar lista por estado y luego por fecha de vencimiento
        tareas.sort(Comparator.comparing(Tarea::isEstado)
                .thenComparing(Tarea::getVencimiento));
        // luego mostrar la lista ordenada.
        tareas.forEach(Tarea::mostrarTarea);
    }
    public void agregarTarea(Tarea tarea){
        tareas.add(tarea);
    }
    public void buscarTarea(String titulo){
        Consumer<Tarea> imprimirSiTituloCoincide = tarea -> {
          if (tarea.getTitulo().equals(titulo)){
              tarea.mostrarTarea();
          }
        };
        tareas.forEach(imprimirSiTituloCoincide);
    }
    // getters and setters

}
