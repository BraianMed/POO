package pila.nodos.simple;

public class PilaMain {
    public static void main(String[] args) {
        Pila p = new Pila();

        p.apilar(0);
        p.apilar(2);
        p.apilar(7);
        p.apilar(9);
        p.apilar(19);

        p.PrintElements(p);
        System.out.println("la cantidad de la pila es de: " + p.getCantidad());
        p.desapilar();
        p.desapilar();
        System.out.println("la cantidad de la pila es de: " + p.getCantidad());

    }
}
