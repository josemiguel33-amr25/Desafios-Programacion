package algoritmos.unidad3;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DesafioTrenDelAmor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Map<String,String> mapa = new HashMap<>();
        mapa.put("H", "M");
        mapa.put("h", "m");
        mapa.put("M", "H");
        mapa.put("m", "h");

        while (entrada.hasNext()) {
            String vagon = entrada.nextLine();
            Deque<String> pila = new ArrayDeque<>();
            int contadorParejas = 0;

            for (int i = 0; i < vagon.length(); i++) {
                String seleccion = vagon.substring(i, i+1);
                if (seleccion.equals("@"))
                    break;
                
                if (pila.isEmpty() && mapa.containsKey(seleccion)) {
                    pila.add(seleccion);
                } else if (!pila.isEmpty() && mapa.containsKey(seleccion)) {
                    if (pila.peek().equals(mapa.get(seleccion))) {
                        contadorParejas++;
                        pila.clear();
                    }
                }
            }
            System.out.println(contadorParejas);
        }
    }
}
