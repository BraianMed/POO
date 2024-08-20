package lista.enlazada.simple;

public class ListaEnlazadaSimple {
    final int MAX_SIZE = 10;
    // atributos
    private int cantidad;
    private Nodo inicio;

    // constructor
    ListaEnlazadaSimple(){
        this.cantidad = 0;
        this.inicio = null;
    }

    // methods
    public boolean isEmpty(){
        return this.inicio == null;
    }
    public boolean isFull(){
        return this.cantidad == MAX_SIZE;
    }

    public void AppendElement(ListaEnlazadaSimple lista, int dato){
        if (lista.isFull()){return;}
        Nodo nuevo_nodo = new Nodo(dato);
        if (lista.isEmpty()){
            inicio = nuevo_nodo;
            return;
        }
        Nodo actual = this.inicio;
        while(actual.getSiguiente() != null){
            actual = actual.getSiguiente();
        }
        actual.setSiguiente(nuevo_nodo);
        lista.cantidad++;

    }
    public void PrintElements(){
        Nodo actual = this.inicio;
        while(actual != null){
            System.out.println(actual.getDato());
            actual = actual.getSiguiente();
        }
    }
    public void DeleteElements(ListaEnlazadaSimple lista,int position){
        if (lista.isEmpty()){return;}
        Nodo actual = inicio;
        Nodo ant = null;
        int i = 1;
        while(actual != null){
            if (i == position){
                if(ant == null){
                    inicio = actual.getSiguiente();
                }
                else{
                    ant.setSiguiente(actual.getSiguiente());
                }
                actual.FreeNodo(actual);
                cantidad--;
                return;
            }
            i++;
            ant = actual;
            actual = actual.getSiguiente();
        }

        return;
    }
    public void InsertElements(ListaEnlazadaSimple lista, int position,int dato){
        if (lista.isEmpty()){
            lista.AppendElement(lista,dato);
            return;
        }
        if (lista.isFull()){return;}
        Nodo actual = inicio;
        Nodo ant = null;
        Nodo p = new Nodo(dato);

        int i = 1;
        while(actual != null){
            if (i == position){
                if (i == 1){
                    p.setSiguiente(inicio);
                    inicio = p;
                }
                else{
                    p.setSiguiente(actual);
                    ant.setSiguiente(p);
                }
                cantidad++;
                return;
            }
            i++;
            ant = actual;
            actual = actual.getSiguiente();
        }
        return;
    }
    // getters and setters
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }
}
