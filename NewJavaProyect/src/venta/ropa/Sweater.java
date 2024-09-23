package venta.ropa;

public class Sweater extends Prenda{

    @Override
    public double calcularPrecio() {
        double extra = (super.getPrecioLista() * 8) / 100;
        return super.getPrecioLista() + extra;
    }
}
