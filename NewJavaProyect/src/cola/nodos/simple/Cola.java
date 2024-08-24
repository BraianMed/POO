package cola.nodos.simple;
import lista.enlazada.simple.Nodo;


public class Cola {
    
    // atributos
    private static int MAX_SIZE_C = 10;
    private Nodo start;
    private Nodo end;
    private int cantidad;

    // constructor
    public Cola(){
        this.start = null;
        this.end = null;
        this.cantidad = 0;
    }
    // metodos
    public boolean isEmpty(){
        return start == null;
    }
    public boolean isFull(){
        return cantidad == MAX_SIZE_C;
    }
    
    public void encolar(int dato){
        Nodo nuevo_nodo = new Nodo(dato);
        if (isFull()) {
            System.out.println("COLA LLENA!");
        }
        if (isEmpty()) {
            start = nuevo_nodo;
            cantidad++;    
        }
        else{
            end.setSiguiente(nuevo_nodo);
        }
        end = nuevo_nodo;
        cantidad++;
        
    }

    public int desencolar(){
        if (isEmpty()) {
            return -1;
        }
        Nodo resultado = start;
        start = start.getSiguiente();
        resultado.FreeNodo(resultado);
        cantidad--;

        return resultado.getDato();
    }


    public void PrintElements(Cola c){
        if (isEmpty()) {
            System.out.println("COLA VACIA!!");
        }
        Cola auxiliar = new Cola();
        int actual;
        while (!isEmpty()) {
            actual = c.desencolar();
            System.out.println("Dato de la cola: " + actual);
            auxiliar.encolar(actual);
        }
        while (!auxiliar.isEmpty()) {
            c.encolar(auxiliar.desencolar());
        }
    }

    public int recuperar(){
        return start.getDato();
    }


}
