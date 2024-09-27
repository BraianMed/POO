package venta.ropa;

public class RopaMain {
    public static void main(String[] args) {
        Remera remera = new Remera();
        Sweater sweater = new Sweater();
        Camisa camisa = new Camisa("ML");
        Prenda prendaDinamica = new Prenda();
        Tarjeta tarjetaComun = new Tarjeta();
        TarjetaDorada tarjetaDorada = new TarjetaDorada();


        System.out.println("Precio de la remera " + remera.getTalle() + remera.calcularPrecio());
        System.out.println("Precio del sweater " + sweater.getTalle() + sweater.calcularPrecio());
        System.out.println("Precio de la camisa " + camisa.getTalle() + camisa.calcularPrecio());


    }
}
