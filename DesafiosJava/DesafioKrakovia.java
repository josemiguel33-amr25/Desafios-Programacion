import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;

class DesafioKrakovia {
    public static void main(String[] args) throws IOException {
        int numeroBill = 1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        while (true) {
            String [] datos = br.readLine().split(" ");
            
            if (datos[0].equals("0") && datos[1].equals("0"))
                break;
            
            BigInteger resultadoTotal = new BigInteger("0");
            BigInteger pagarPorPersona = new BigInteger("0");

            int numBebidas = Integer.parseInt(datos[0]);

        
            for (int i = 0; i < numBebidas; i++) {
                String linea = br.readLine();
                resultadoTotal = resultadoTotal.add(new BigInteger(linea));
        }

        pagarPorPersona = resultadoTotal.divide(new BigInteger(datos[1]));

        pw.println("Bill #" + numeroBill + " costs " + resultadoTotal.toString() + ": each friend should pay " + pagarPorPersona.toString() +"\n");
        pw.flush();
        numeroBill++;
        }
    }
}
