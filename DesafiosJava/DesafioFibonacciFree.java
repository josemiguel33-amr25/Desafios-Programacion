import java.math.BigInteger;
import java.util.Scanner;

public class DesafioFibonacciFree {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while (entrada.hasNext()) {
            int numero = entrada.nextInt();
            BigInteger primero = new BigInteger("0");
            BigInteger segundo = new BigInteger("1");
            BigInteger auxilia = new BigInteger("0");

            BigInteger fibonacci = new BigInteger("0");
            if (numero == 1) {
                System.out.println("The Fibonacci number for " + numero + " is " + BigInteger.ONE);
            } else {
                for (int i = 1; i < numero; i++) {
                    fibonacci = primero.add(segundo);
                    auxilia = segundo;
                    segundo = fibonacci;
                    primero = auxilia;
                }

                System.out.println("The Fibonacci number for " + numero + " is " + fibonacci );
            }
     }
    }
}
