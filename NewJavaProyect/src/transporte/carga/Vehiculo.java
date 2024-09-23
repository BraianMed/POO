package transporte.carga;

public abstract class Vehiculo {
    private String matricula;
    private double pesoMaximo;

    public abstract double calcularImpuesto();
    public abstract void transformarCarga(double peso);

    public Vehiculo(String matricula,double pesoMaximo){
        this.matricula = matricula;
        this.pesoMaximo = pesoMaximo;
    }
    public double getPesoMaximo() {
        return pesoMaximo;
    }

    public String getMatricula() {
        return matricula;
    }
}
