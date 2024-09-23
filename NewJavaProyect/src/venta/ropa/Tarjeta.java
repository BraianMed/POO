package venta.ropa;

public class Tarjeta {

    public double aplicarDescuento(double monto){
        double desc = (monto * 1) / 100;
        return monto - desc;
    }
}
