package algoritmos.unidad2;

import com.sun.source.tree.Tree;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class DesafioFactoVisor {
    public static Set<Integer> criba(Integer n) {
        List<Integer> listaBase = new ArrayList<>();
        Set<Integer> listaFinal = new TreeSet<>();
        for(int i = 2; i <= Math.sqrt(n)+1 ; i++ ) {
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
        Set<Integer> conjuntoPrimos = criba(10000);
        Scanner entrada = new Scanner(System.in);

        while (entrada.hasNext()) { 
            Long factorial = entrada.nextLong();
            Long divisor =  entrada.nextLong();
            Long resultadoPotencia;
            Integer exponente = 1;
            Long suma = 0l;
            boolean divisible = true;

            Map<Integer, Long> mapaFactorial = new TreeMap<>();
            Map<Integer, Long> mapaDivisor = new TreeMap<>();
            
            Long auxiliarDivisor = divisor; 
            Integer auxiliarPrimo = 0;
            BigInteger divisorBig = new BigInteger(divisor.toString());
            if (divisorBig.isProbablePrime(10)) {
                if (factorial <= divisor)
                    System.out.println(divisor + " does not divide " + factorial + "!");
                else if (factorial > divisor)
                    System.out.println(divisor + " divides " + factorial + "!");
            } else {
                while (true) {
                    if (new BigInteger(Long.toString(auxiliarDivisor)).isProbablePrime(10)) {
                        if (mapaDivisor.containsKey(auxiliarPrimo)) {
                            mapaDivisor.put(auxiliarPrimo, mapaDivisor.get(auxiliarPrimo)+1);
                        } else 
                            mapaDivisor.put(auxiliarPrimo, 1l);
                        break;
                    }
                    for (Integer primo : conjuntoPrimos) {
                        if (auxiliarDivisor % primo == 0) {
                            auxiliarDivisor = auxiliarDivisor / primo;
                            if (mapaDivisor.containsKey(primo)) {
                                mapaDivisor.put(primo, mapaDivisor.get(primo)+1);
                            } else if (!mapaDivisor.containsKey(primo)) {
                                mapaDivisor.put(primo, 1l);
                            }
                            auxiliarPrimo = auxiliarDivisor.intValue();
                            break;
                        }
                    }
                }
                
                for (Integer nSeleccionado : mapaDivisor.keySet()) {
                    exponente = 1;
                    suma = 0l;
                    while (true) { 
                        resultadoPotencia = new BigInteger(nSeleccionado.toString()).pow(exponente).longValue();
                        if (resultadoPotencia > factorial)
                            break;
                        suma = suma + factorial / resultadoPotencia;
                        exponente++;
                    }
                    mapaFactorial.put(nSeleccionado, suma);
                }

                for (Integer clave : mapaFactorial.keySet()) {
                    Long cantidadFactor = mapaFactorial.get(clave);
                    if (mapaDivisor.containsKey(clave)) {
                        Long cantidadDivisor = mapaDivisor.get(clave);
                        if (cantidadFactor.compareTo(cantidadDivisor) < 0) {
                            divisible = false;
                            break;
                        }
                    } else {
                        divisible = false;
                        break;
                    }
                }

                if (divisible) {
                    System.out.println(divisor + " divides " + factorial + "!");
                } else
                    System.out.println(divisor + " does not divide " + factorial + "!");


            }
        }

    }
}
