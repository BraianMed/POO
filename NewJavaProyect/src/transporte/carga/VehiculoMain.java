package transporte.carga;

public class VehiculoMain {
    public static void main(String[] args) {
        VehiculoLiviano camioncito = new VehiculoLiviano("AJAX5",155.55,4);
        VehiculoPesado camioneta = new VehiculoPesado("AYAX69",700,250.99);
        camioncito.realizarMantenimiento();
        camioneta.realizarMantenimiento();
        camioncito.transformarCarga(500);
        camioneta.transformarCarga(150);
        camioneta.mostrarDatosVehiculo();
        camioncito.mostrarDatosVehiculo();
    }
}
