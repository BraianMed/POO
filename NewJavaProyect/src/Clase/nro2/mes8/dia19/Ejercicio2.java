package Clase.nro2.mes8.dia19;
import java.util.ArrayList;

public class Ejercicio2 {
    private int contador = 0;

    public void ejecutarEjemplo2(){
        String pais = "Argentina";
        ArrayList<String> paises = new ArrayList<>();
        paises.add("Holanda");
        paises.add("Argentina");
        paises.add("Alemania");
        paises.add("Francia");
        paises.add("Inglaterra");
        paises.add("Argentina");

        int resultado = this.ejercicio2("Argentina",paises);
        System.out.println("la cadena " + pais + " aparece " + resultado + " veces");
    }

    public int ejercicio2(String cadena,ArrayList<String> lista){
        for(String pais : lista){
            if (cadena.equals(pais)){
                contador++;
            }
        }
        return contador;
    }



}
