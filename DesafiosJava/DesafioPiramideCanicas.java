
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
public class DesafioPiramideCanicas {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        int numeroCasos = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < numeroCasos; i++) {
            long n = Long.parseLong(br.readLine());
            long resultado = (n*(n+1)*(n+2)) / 6;
            pw.println(resultado);
            pw.flush();
        }

    }
}