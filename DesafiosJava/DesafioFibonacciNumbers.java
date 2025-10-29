import java.math.BigInteger;
import java.util.Scanner;

public class DesafioFibonacciNumbers {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while (entrada.hasNext()) {
            int numero = entrada.nextInt();
            BigInteger primero = new BigInteger("0");
            BigInteger segundo = new BigInteger("1");
            BigInteger auxiliar = new BigInteger("0");

            BigInteger fibonacci = new BigInteger("0");
            if (numero == 1) {
                System.out.println(BigInteger.ONE);
            } else {
                for (int i = 1; i < numero; i++) {
                    fibonacci = primero.add(segundo);
                    auxiliar = segundo;
                    segundo = fibonacci;
                    primero = auxiliar;
                }

                System.out.println(fibonacci);
            }
     }
    }
}
