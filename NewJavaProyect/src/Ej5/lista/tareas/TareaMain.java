package Ej5.lista.tareas;

public class TareaMain {
    public static void main(String[] args) {
        Tarea t1 = new Tarea("Ir al supermercado mañana","Super");
        Tarea t2 = new Tarea("Consultar repuesto del auto","Repuestos");
        Tarea t3 = new Tarea("Ir al cine a ver la nueva película de Marvel","Cine");

        Libreto libreto = new Libreto();
        libreto.agregarTarea(t1);
        libreto.agregarTarea(t2);
        libreto.agregarTarea(t3);

        libreto.mostrarTareas();

        libreto.buscarTarea("Super");
        libreto.ordenarLista();
    }
}
