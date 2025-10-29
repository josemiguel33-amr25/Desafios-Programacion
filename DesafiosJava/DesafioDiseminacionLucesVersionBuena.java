package Desafios;
import java.util.Scanner;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



public class DesafioDiseminacionLucesVersionBuena {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        long cantidadLuces = 1;
        int luces = 0;
        long diseminacionCantidad = 0;

        while (cantidadLuces != 0) {
            Map<Integer, List<Integer>> mapaLucesLed = new HashMap<>();
            diseminacionCantidad = 0;
            cantidadLuces = entrada.nextInt();

            if (cantidadLuces == 0) {
                break;
            }

            for (int i = 0; i < cantidadLuces; i++) {
                luces = entrada.nextInt();
                List<Integer> listaDelMapa = new ArrayList<>();
                if (mapaLucesLed.containsKey(luces)) {
                        mapaLucesLed.get(luces).set(1, i);
                } else {
                    mapaLucesLed.put(luces, listaDelMapa);
                    mapaLucesLed.get(luces).add(i);
                    mapaLucesLed.get(luces).add(i);
                }
            }

            for (List<Integer> valor : mapaLucesLed.values()) 
                diseminacionCantidad = diseminacionCantidad + (valor.get(1) - valor.get(0));
            
            System.out.println(diseminacionCantidad);


        } 
    }
}
