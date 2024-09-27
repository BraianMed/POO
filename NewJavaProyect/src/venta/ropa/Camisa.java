package venta.ropa;

public class Camisa extends Prenda{
    private boolean mangaLarga;

    public Camisa(String tipo){
        if (tipo.equals("ML")){
            this.mangaLarga = true;
        }
        else if (tipo.equals("MC")){
            this.mangaLarga = false;
        }
        else{
            this.mangaLarga = false;
        }
    }

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
