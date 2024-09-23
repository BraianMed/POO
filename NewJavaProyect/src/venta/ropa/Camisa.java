package venta.ropa;

public class Camisa extends Prenda{
    private boolean mangaLarga;

    @Override
    public double calcularPrecio() {
        double extra = (super.getPrecioLista() * 5) / 100 ;
        double resultado = super.calcularPrecio();
        if (isMangaLarga()){
            resultado += extra;
        }
        return resultado;
    }

    public boolean isMangaLarga() {
        return mangaLarga;
    }
}
