import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

public class DesafioReferenciasCruzadas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //variables varias 
        int lineas = 1;
        String texto = "";

        //estructuras datos
        Map<String, Set<Integer>> mapaPalabras = new TreeMap<>();
        List <String> listaRepetidas = new ArrayList<>();
        

        while (lineas != 0) {
            lineas = entrada.nextInt();
            entrada.nextLine();
            if (lineas == 0)
                break;
            
            mapaPalabras = new TreeMap<>();

            for (int i = 0; i < lineas; i++) {
                texto = entrada.nextLine(); //meto cada palabra hecha con split en un array y luego en un bucle abajo leo cada palabra y voy metiendo en el map y luego repito proceso con cada linea
                texto = texto.toLowerCase();
                //reiniciamos listas y eso
                String [] textoDividido = texto.split(" ");
                listaRepetidas = new ArrayList<>();

                for (String elemento : textoDividido) {
                    if (elemento.length() > 2 && !mapaPalabras.containsKey(elemento)) {
                        Set<Integer> conjunto = new TreeSet<>();
                        conjunto.add(i+1);
                        mapaPalabras.put(elemento, conjunto);
                        listaRepetidas.add(elemento);
                    } else if (elemento.length() > 2 && mapaPalabras.containsKey(elemento) && !listaRepetidas.contains(elemento)) {
                        mapaPalabras.get(elemento).add(i+1);
                        listaRepetidas.add(elemento);
                    }
                }

            }
            for (String clave : mapaPalabras.keySet()) {
                System.out.print(clave);
                for (int linea : mapaPalabras.get(clave)) 
                    System.out.print(" " + linea);
                System.out.println();
            }
            System.out.println("----");
        }
    }
}

