import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class DesafioEstimarPi {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        while (true) {
            List<Integer> listaNumeros = new LinkedList<>(); 
            List<Integer> listaParejas = new ArrayList<>();
            int parejasCoPrimos = 0;
            int parejasTotales = 0;

            int cantidadNumeros = entrada.nextInt();
            if (cantidadNumeros == 0)
                break;
            
            for (int i = 0; i < cantidadNumeros; i++) {
                listaNumeros.add(entrada.nextInt());    
            }

            for (int i = 0; i < listaNumeros.size(); i++) {
                int numero1 = listaNumeros.get(i);
                for (int b = i+1; b < listaNumeros.size(); b++) {
                    int numero2 = listaNumeros.get(b);
                    parejasTotales++;
                    listaParejas.add(numero1);
                    listaParejas.add(numero2);
                }
            }

            for (int i = 0; i < listaParejas.size(); i = i+2) {
                BigInteger p1 = new BigInteger(listaParejas.get(i).toString());
                BigInteger p2 = new BigInteger(listaParejas.get(i+1).toString());

                if (p1.gcd(p2).intValue() == 1)
                        parejasCoPrimos++;

            }
            if (parejasCoPrimos == 0) {
                pw.println("No estimate for this data set.");
                pw.flush();
            }
            else {
                BigDecimal piEstimado = new BigDecimal(Math.sqrt( (double) (6 * parejasTotales) / (double) parejasCoPrimos));
                pw.println(piEstimado.setScale(6, RoundingMode.HALF_UP));
                pw.flush();
            }
        }
    }
}
