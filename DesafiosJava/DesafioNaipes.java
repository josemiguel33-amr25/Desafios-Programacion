import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;


public class DesafioNaipes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        String numeroCasos = br.readLine();

        for (int i = 0; i < Integer.parseInt(numeroCasos); i++) {
            Long numero = Long.parseLong(br.readLine());
            Long resultadoTotal = (numero*(2+numero*2))/2;  //n*2(n+1) / 2  + (n-1(n+1)) / 2 >> la otra(n*(n+n*2) / 2) +1
            resultadoTotal = resultadoTotal + (numero*(numero-1))/2;
            pw.println(resultadoTotal);
            pw.flush();
        }
    }
}



