package Club.Deportivo;
import java.time.*;
import java.time.temporal.ChronoUnit;


public class Suscripcion {
    private boolean estado;
    private TipoSub tipo;
    private double cuota;
    private Socio titular;
    private LocalDate inscripcion;
    private LocalDate vencimiento;

    public Suscripcion(TipoSub tipo,Socio titular){
        this.tipo = tipo;
        this.titular = titular;
        this.inscripcion = LocalDate.now();
        this.vencimiento = LocalDate.now().plusDays(30);
        // calcular cuota basándonos en el tipo de suscripción
    }

    public void mostrarSub(){
        System.out.println("Estado suscripción: " + estado);
        System.out.println("Tipo de suscripción: " + tipo);
        System.out.println("Cuota mensual de suscripción: " + cuota);
        System.out.println("Titular: " + titular.getNombre());
        System.out.println("Fecha en de inscripción a la suscripción: " + inscripcion);
        System.out.println("Fecha de vencimiento de la suscripción: " + vencimiento);
    }
    public void consultarVencimiento(){
        if (inscripcion.equals(vencimiento)) {
            System.out.println("Tu tarea ha vencido!");
            setEstado(false);
        }
        else{
            System.out.println("Todavía quedan "
                    + ChronoUnit.DAYS.between(inscripcion,vencimiento)
                    + " dias para que expire");
        }
    }

    private void setEstado(boolean b) {
        this.estado = b;
    }

    public void renovarSub(){

    }
    public void bajaSub(){

    }
}
