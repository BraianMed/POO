package venta.ropa;

public class Prenda {
    private double precioLista;
    private String talle;

    public double calcularPrecio(){
        double porcentaje = (precioLista * 10) / 100;
        return precioLista + porcentaje;
    }
    public double calcularPrecio(Tarjeta tarjeta){
        return tarjeta.aplicarDescuento(this.calcularPrecio());
    }
    public double getPrecioLista() {
        return precioLista;
    }

    public String getTalle() {
        return talle;
    }

}
