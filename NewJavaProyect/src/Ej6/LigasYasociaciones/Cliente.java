package Ej6.LigasYasociaciones;
import java.util.Random;;


public class Cliente {
    
    private int codigoCliente;
    private String nombre;
    private boolean habilitado;

    public Cliente(String nombre){
        this.nombre = nombre;
        this.habilitado = true;
        setCodigoCliente();
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setCodigoCliente() {
        Random random = new Random();
        this.codigoCliente = random.nextInt(0,100) + 1;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public String getNombre() {
        return nombre;
    }

    
    
    

}
