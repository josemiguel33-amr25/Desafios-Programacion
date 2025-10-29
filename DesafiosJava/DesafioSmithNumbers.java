import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class DesafioSmithNumbers {

    public static Set<Integer> criba(Integer n) {
        List<Integer> listaBase = new ArrayList<>();
        Set<Integer> listaFinal = new TreeSet<>();
        for(int i = 2; i <= Math.sqrt(n)+2 ; i++ ) {
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
        Scanner entrada = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out))); 
        int casos = entrada.nextInt();

        for (int i = 0; i < casos; i++) {
            Integer n = entrada.nextInt();
            Integer numeroCercano = n +1;
            Integer auxiliar = numeroCercano;
            Integer numeroSmith = numeroCercano;

            Set<Integer> primosGenerados = criba(n+2); //pongo esto porque hay casos de prueba que si el numero smith esta muy lejos no tiene numeros primos suficientes para dividir
            boolean esSmith = false;
            while (!esSmith) {
                Integer sumaDigitos = 0;
                Integer sumaPrimos = 0;
                List<Integer> listaFactores = new ArrayList<>();
                numeroCercano = numeroSmith; 
                String cadenaNum = numeroCercano.toString();
                

                for (int numeroSeleccionado = 0; numeroSeleccionado < cadenaNum.length(); numeroSeleccionado++) 
                    sumaDigitos = sumaDigitos + Integer.parseInt(cadenaNum.substring(numeroSeleccionado, numeroSeleccionado+1 ));

                while (true) {
                    if (new BigInteger(Integer.toString(numeroCercano)).isProbablePrime(5)) {
                        listaFactores.add(numeroCercano);
                        break;
                    }
                    for (Integer primo : primosGenerados) {
                        if (numeroCercano % primo == 0) {
                            numeroCercano = numeroCercano / primo;
                            listaFactores.add(primo);
                            break;
                        }
                    }
                }

                for (Integer factor : listaFactores) {
                    auxiliar = factor;
                    String [] factores = Integer.toString(auxiliar).split("");
                    for (String factorSelec : factores) {
                        sumaPrimos = sumaPrimos + Integer.parseInt(factorSelec);
                    }
                }

                BigInteger numeroComprobacion = new BigInteger(Integer.toString(numeroSmith));
                if (sumaDigitos == sumaPrimos) {
                    if (!numeroComprobacion.isProbablePrime(5)) {
                        esSmith = true;
                        break;
                    }
                }

                numeroSmith++;

            }

            pw.println(numeroSmith);
            pw.flush();
        }
    }
}
