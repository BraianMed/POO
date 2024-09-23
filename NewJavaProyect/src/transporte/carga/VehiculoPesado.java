package transporte.carga;

public class VehiculoPesado extends Vehiculo implements IMantenimiento,IMostrarDatos{
    private double capacidadRemolque;

    public VehiculoPesado(String matricula, double pesoMaximo,double capacidadRemolque) {
        super(matricula, pesoMaximo);
        this.capacidadRemolque = capacidadRemolque;
    }

    @Override
    public double calcularImpuesto() {
        return getPesoMaximo() * 0.10 + capacidadRemolque * 0.02;
    }

    @Override
    public void transformarCarga(double peso) {
        if (peso <= capacidadRemolque + getPesoMaximo()){
            System.out.println("El vehiculo de matricula " + getMatricula() + " si puede transportar " + peso + " kilogramos");
        }
        else{
            System.out.println("El vehiculo de matricula " + getMatricula() + " no puede transportar " + peso + " kilogramos");
        }
    }

    @Override
    public void realizarMantenimiento() {
        System.out.println("Se ha realizado el mantenimiento para el vehiculo con matricula: "
        + getMatricula());
    }

    @Override
    public void mostrarDatosVehiculo() {
        System.out.println("Matricula : " + getMatricula());
        System.out.println("Peso máximo: " + getPesoMaximo());
        System.out.println("Capacidad de remolque: " + capacidadRemolque);
    }
}
