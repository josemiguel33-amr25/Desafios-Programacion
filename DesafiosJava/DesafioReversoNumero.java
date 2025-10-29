import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;

public class DesafioReversoNumero {

    public static String invertirNumero(String numero) {
        String numeroInvertido = "";

        for (int i = numero.length()-1; i >= 0; i--) {
            numeroInvertido = numeroInvertido + numero.substring(i, i+1);
        }

        return numeroInvertido;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        String numeroCasos = br.readLine();

        for (int i = 0; i < Integer.parseInt(numeroCasos); i++) {
            String [] numeros = br.readLine().split(" ");
            
            BigInteger resultadoTotal = new BigInteger("0");
            BigInteger n1 = new BigInteger(invertirNumero(numeros[0]));
            BigInteger n2 = new BigInteger(invertirNumero(numeros[1]));
            
            resultadoTotal = resultadoTotal.add(n1);
            resultadoTotal = resultadoTotal.add(n2);
            resultadoTotal = new BigInteger(invertirNumero(resultadoTotal.toString()));

            pw.println(resultadoTotal.toString());
            pw.flush();
        }

    }
}
