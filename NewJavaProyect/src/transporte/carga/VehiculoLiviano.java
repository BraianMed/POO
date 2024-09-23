package transporte.carga;

public class VehiculoLiviano extends Vehiculo implements IMantenimiento,IMostrarDatos {
    private int numeroPasajeros;

    public VehiculoLiviano(String matricula, double pesoMaximo,int numeroPasajeros) {
        super(matricula, pesoMaximo);
        this.numeroPasajeros = numeroPasajeros;
    }

    @Override
    public double calcularImpuesto() {
        return getPesoMaximo() * 0.05;
    }

    @Override
    public void transformarCarga(double peso) {
        if (peso <= getPesoMaximo()){
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
        System.out.println("Número de pasajeros: " + numeroPasajeros);
    }
}
