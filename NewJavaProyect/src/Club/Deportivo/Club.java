package Club.Deportivo;

import Billetera.virtual.*;

import java.util.ArrayList;

public class Club {
    private Billetera fondosClub;
    private ArrayList<Actividad> actividades = new ArrayList<>();
    private ArrayList<Socio> socios = new ArrayList<>();


    public void mostrarListadoSocios(){
        socios.forEach(Socio::mostrarDatos);
    }
    public void mostrarListadoActividades(){

    }
}
