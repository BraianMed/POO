package lista.enlazada.simple;


public class Main {
    public static void main(String[] args) {
        ListaEnlazadaSimple lista = new ListaEnlazadaSimple();
        System.out.println("Lista luego de agregar elementos: \n");
        lista.AppendElement(lista,10);
        lista.AppendElement(lista,12);
        lista.AppendElement(lista,13);
        lista.AppendElement(lista,14);
        lista.AppendElement(lista,15);
        lista.PrintElements();

        lista.DeleteElements(lista,3);
        System.out.println("Lista luego de eliminar elementos: \n");

        lista.PrintElements();

        lista.InsertElements(lista,1,29);
        lista.InsertElements(lista,3,57);

        System.out.println("Luego de insertar elementos: \n");
        lista.PrintElements();

        System.out.println("la cantidad de elementos que tiene la lista es de: " + lista.getCantidad() );

    }
}