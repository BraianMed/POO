package venta.ropa;

public class Remera extends Prenda{

    @Override
    public double calcularPrecio() {
        return (super.calcularPrecio()) + 100;
    }
}
