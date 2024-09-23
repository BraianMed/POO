package venta.ropa;

public class TarjetaDorada extends Tarjeta{

    @Override
    public double aplicarDescuento(double monto) {
        double desc = ((monto * 1.5) / 100) - 100;
        return monto - desc;
    }
}
