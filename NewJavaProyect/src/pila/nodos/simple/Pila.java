package pila.nodos.simple;
import lista.enlazada.simple.Nodo;


public class Pila {
    // atributos
    private Nodo tope;
    private int cantidad;

    // metodos
    public Pila(){
        this.tope = null;
        this.cantidad = 0;
    }

    public void apilar(int dato){
        Nodo nuevo_nodo = new Nodo(dato);
        nuevo_nodo.setSiguiente(tope);
        tope = nuevo_nodo;
        cantidad++;
    }

    public int desapilar(){
        Nodo resultado = tope;
        tope = tope.getSiguiente();
        resultado.FreeNodo(resultado);
        cantidad--;

        return resultado.getDato();
    }

    public int tope(){
        return tope.getDato();
    }

    public boolean isEmpty(){
        return cantidad == 0;
    }

    public void PrintElements(Pila p) {
        Pila paux = new Pila();
        int actual;
        while (!p.isEmpty()) {
            actual = p.desapilar();
            System.out.println("Dato de la pila: " + actual);  // Imprime cada elemento desapilado
            paux.apilar(actual);  // Apila en paux
        }
        
        while (!paux.isEmpty()) {  // Restaura los elementos a la pila original
            p.apilar(paux.desapilar());
        }
    }
    

    // getter
    public int getCantidad() {
        return cantidad;
    }


}
