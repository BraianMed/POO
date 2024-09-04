package Billetera.virtual;

public class Billetera {
    private Usuario user;
    private TipoMoneda tipomoneda;
    private double saldo;

    public Billetera(TipoMoneda moneda){
        this.tipomoneda = moneda;
    }

    public void Depositar(double cantidad){
        saldo = saldo + cantidad;
    }
    public boolean Retirar(double cantidad){
        if (saldo == 0){
            System.out.println("No se puede retirar dinero por falta de fondos.");
            return false;
        }
        setSaldo(getSaldo()-cantidad);
        return true;
    }
    public void Transferir(double cantidad,Billetera destino){
        destino.Depositar(cantidad);
        Retirar(cantidad);
    }

    public void MostrarDatos(){
        System.out.println("Titular de la billetera virtual: " + user.getNombre());
        System.out.println("Tipo de moneda: " + tipomoneda);
        System.out.println("Saldo actual: " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
