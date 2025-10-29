import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class DesafioDivisoresFactorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        while (true) {
            String [] numeros = entrada.nextLine().split(" ");
            int divisor = Integer.parseInt(numeros[0]);
            int primo = Integer.parseInt(numeros[1]);
            String mensaje = "NO";
            if (primo < 0 && divisor < 0) {
                break;
            } else if (primo == 0 && divisor == 1) {
                mensaje = "YES";
            } else if (divisor <= primo)
                mensaje = "YES";
            
            pw.println(mensaje);
            pw.flush();
            
            
        }
    }
}
