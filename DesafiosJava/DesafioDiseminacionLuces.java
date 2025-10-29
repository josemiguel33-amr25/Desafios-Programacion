package Desafios;
import java.util.Scanner;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.List;


public class DesafioDiseminacionLuces {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cantidadLuces = 1;
        String luces = "";
        int diseminacionCantidad = 0;
        int contadorDiseminacion = 0;
        Boolean valorMasDeUnaVez = false;

        while (cantidadLuces != 0) {
            //reinicio contadores y variables
            Map<Integer, Integer> mapaLucesLed = new LinkedHashMap<>();
            List<Integer> listaIterados = new ArrayList<>();
            diseminacionCantidad = 0;

            cantidadLuces = entrada.nextInt();
            entrada.nextLine();
            if (cantidadLuces == 0)
                break;

            for (int i = 0; i < cantidadLuces; i++) {
                luces = entrada.next();
                mapaLucesLed.put(i, Integer.parseInt(luces));
            }
            for (Integer valor : mapaLucesLed.values()) {
                valorMasDeUnaVez = false;
                contadorDiseminacion = 0;
                for (Integer valor2: mapaLucesLed.values()) {
                    if (valor == valor2 && contadorDiseminacion != 0 && !listaIterados.contains(valor)) {
                        valorMasDeUnaVez = true;
                        listaIterados.add(valor);
                        break;
                    } else 
                        contadorDiseminacion = contadorDiseminacion +1;
                }
                if (valorMasDeUnaVez)
                    diseminacionCantidad = contadorDiseminacion + diseminacionCantidad;
            }
            System.out.println(contadorDiseminacion);
            
        }
    }
}
