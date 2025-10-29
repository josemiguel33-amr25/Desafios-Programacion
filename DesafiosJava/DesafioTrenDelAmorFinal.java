package algoritmos.unidad3;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DesafioTrenDelAmorFinal {
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
            String aux = "";

            for (int i = 0; i < vagon.length(); i++) {
                String seleccion = vagon.substring(i, i+1);
                if (!seleccion.equals("@") && mapa.containsKey(seleccion))
                    pila.addLast(seleccion);
                else if (seleccion.equals("@"))
                    break;
            }

            while (!pila.isEmpty() || pila.size() != 1) {
                if (pila.isEmpty())
                    break;
                if (aux.equals("")) {
                    aux = pila.poll();
                } else if (!aux.equals("")) {
                    if (mapa.get(pila.peek()).equals(aux)) {
                        contadorParejas++;
                        aux = "";
                        pila.poll();
                    } else
                        pila.addLast(pila.poll());
                }
                if (!aux.equals("") && !pila.contains(mapa.get(aux)))
                    aux = "";
            }
            System.out.println(contadorParejas);
        }
    }
}
