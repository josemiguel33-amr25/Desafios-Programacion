import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class DesafioCuadradoPerfecto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while (entrada.hasNext()) {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
            String linea = entrada.nextLine();

            BigInteger bI = new BigInteger(linea);
            BigInteger [] resultados = bI.divideAndRemainder(new BigInteger("16")); 
            
            if (resultados[1].intValue() == 0 || resultados[1].intValue() == 1 || resultados[1].intValue() == 4 || resultados[1].intValue() == 9 ) {
                pw.println("NO SE");
                pw.flush();
            } else
                pw.println("IMPERFECTO");
                pw.flush();
        }
    }
}
