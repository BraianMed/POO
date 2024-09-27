package practica.autonoma;

import java.time.LocalDate;

public abstract class Producto {
    private long codigoBarras;
    private int id;
    private int stock;
    private LocalDate fechaVencimiento;
    private double precio;

    public abstract void calcularPrecio();
    public void mostrarProducto(){
        System.out.println("Id producto: " + id);
        System.out.println("Stock de producto: " + stock);
        System.out.println("Fecha de vencimiento de producto: " + fechaVencimiento);
        System.out.println("Precio producto: " + precio);

    }
    public int getStock() {
        return stock;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public long getCodigoBarras() {
        return codigoBarras;
    }

    public int getId() {
        return id;
    }

    public void setCodigoBarras(long codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setFechaVencimiento() {
        this.fechaVencimiento = LocalDate.now().plusDays(30);
    }
}
