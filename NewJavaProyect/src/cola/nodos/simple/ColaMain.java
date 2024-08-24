package cola.nodos.simple;

public class ColaMain {
    public static void main(String[] args) {
        Cola nueva_cola = new Cola();
        nueva_cola.encolar(0);
        nueva_cola.encolar(2);
        nueva_cola.encolar(4);
        nueva_cola.encolar(6);
        nueva_cola.encolar(8);
        nueva_cola.encolar(9);
        nueva_cola.encolar(10);
        nueva_cola.PrintElements(nueva_cola);

        
    }
}
