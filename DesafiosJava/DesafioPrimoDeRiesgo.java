import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;


public class DesafioPrimoDeRiesgo {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        String linea = "";
        
        int casosPrueba = Integer.parseInt(br.readLine());


        for (int i = 0; i < casosPrueba; i++) {    
            linea = br.readLine();
            byte[] bytes = linea.getBytes("ASCII");

            Integer suma = 0;
            int resultado = 0;

            for (byte b : bytes) 
                suma = suma + b;

            for (Integer n = suma-1; n >= 2; n--) {
                BigInteger numeroFinal = new BigInteger(n.toString());
                
                if (numeroFinal.isProbablePrime(10)) {
                    resultado = n;
                    break;
                }
            }
            pw.println(resultado);
            pw.flush();
            
        }
    }
}
