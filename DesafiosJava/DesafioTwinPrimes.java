import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class DesafioTwinPrimes {
        public static Set<Integer> criba(Integer n) {
        List<Integer> listaBase = new ArrayList<>();
        Set<Integer> listaFinal = new TreeSet<>();
        for(int i = 2; i <= 1500000 ; i++ ) {
            listaBase.add(i);
            listaFinal.add(i);
        }

        for (Integer numero : listaBase) {
            if ((numero * numero) > listaBase.get(listaBase.size()-1))
                break;
            for (int b = numero; b < listaBase.size(); b++) {
                if (listaBase.get(b) % numero == 0 ) 
                    listaFinal.remove(listaBase.get(b));
            }
        }

        return listaFinal;
    }
    public static void main(String[] args) {
        int contadorCasos = 0;
        Scanner entrada = new Scanner(System.in);
        Set<Integer> listaFinal = criba(null);
        List<Integer> listaConvertida = new ArrayList<>();

        while (contadorCasos != 10000) { //10000 porque empiezo en 0 y sumo 1 osea 10001
            int numeroPareja = entrada.nextInt();
            if (numeroPareja == 1) {
                System.out.println("(" + listaConvertida.get(numeroPareja-1) +", " + listaConvertida.get(numeroPareja) + ")");
            }
            System.out.println("(" + listaConvertida.get(numeroPareja) +", " + listaConvertida.get(numeroPareja+1));
            contadorCasos++;    
        }
    }
}
