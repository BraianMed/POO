package lista.enlazada.simple;

public class Nodo {
    // atributos
    private int dato;
    private Nodo siguiente;

    // constructor
    Nodo(int elemento){
        this.dato = elemento;
    }

    // getters and setters
    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    public void FreeNodo(Nodo n){
        n.setSiguiente(null);
    }
}