import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class DesafioGoldBachConjecture {
    public static Set<Integer> criba(Integer n) {
        List<Integer> listaBase = new ArrayList<>();
        Set<Integer> listaFinal = new TreeSet<>();
        for(int i = 2 ; i <= n-1 ; i++ ) {
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
    public static void main(String[] args) { // con bigInteger
        Scanner entrada = new Scanner(System.in);
        int nAnterior = 0;
        List<Integer> listaPrimos = new ArrayList<>(criba(8));
        
        while (true) {
            int numero = entrada.nextInt();
            boolean goldbachEncontrado = false; 
            String resultado = numero + " = ";
            if (numero == 0)
                break;
            
            if (nAnterior < numero) 
                listaPrimos = new ArrayList<>(criba(numero));
            
            for (int i = 0; i < listaPrimos.size(); i++) {
                int numeroSeleccionado = listaPrimos.get(i);
                for (int iAl = listaPrimos.size()-1; iAl >= 0; iAl--) {
                    int numeroMayor = listaPrimos.get(iAl);
                    if (numeroSeleccionado + numeroMayor == numero) {
                        resultado = resultado + numeroSeleccionado + " + "  + numeroMayor;
                        goldbachEncontrado = true;
                        break; 
                    }
                }
                if (goldbachEncontrado) 
                    break;
                
            }

            System.out.println(resultado);
            if (nAnterior < numero)
                nAnterior = numero;

            
        }
    }
}
