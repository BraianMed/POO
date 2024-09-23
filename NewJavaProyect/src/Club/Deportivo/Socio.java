package Club.Deportivo;
import Billetera.virtual.*;

public class Socio {
    private String nombre;
    private String direccion;
    private String email;
    private Billetera billetera;



    public void mostrarDatos(){

    }
    public double consultarSaldo(){
        return billetera.getSaldo();
    }

    public String getNombre() {
        return nombre;
    }
}
