package Clase.nro2.mes8.dia19;
import java.util.ArrayList;

public class Ejercicio1 {
    public void ejecutarEjemplo() {
        String cadena = "hola";
        ArrayList<String> listaDeCadenas = new ArrayList<>();
        listaDeCadenas.add("cadena 1");
        listaDeCadenas.add("cadena 2");
        listaDeCadenas.add("hola");
        listaDeCadenas.add("cadena 3");
        listaDeCadenas.add("cadena 4");
        listaDeCadenas.add("cadena 5");
        String resultado = this.ejercicio1(cadena, listaDeCadenas);
        System.out.println("Resultado: " + resultado);
    }

    public String ejercicio1(String unString, ArrayList<String> unaListaDeStrings) {
        /*for (int i = 0; i < unaListaDeStrings.size(); i++) {
            String siguienteString = unaListaDeStrings.get(i);
            if (unString.equals(siguienteString)) {
                return siguienteString;
            }
        }*/
        for (String siguienteString : unaListaDeStrings) {
            if (unString.equals(siguienteString)){
                return siguienteString;
            }
        }
        return null;
    }
}

