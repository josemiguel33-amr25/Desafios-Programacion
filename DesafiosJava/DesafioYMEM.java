

import java.math.BigInteger;
import java.util.Scanner;

class DesafioYMEM{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while (entrada.hasNext()) {
            int numero = entrada.nextInt();     
            BigInteger fact = new BigInteger("1");
            BigInteger overFlow = new BigInteger("6227020800");
            BigInteger underFlow = new BigInteger("10000");
            if (numero < 0 && numero % -2 != 0) {
                System.out.println("Overflow!");
            } else if (numero < 0 && numero % -2 == 0) {
                System.out.println("Underflow!");
            } else if (numero > 13) {
                System.out.println("Overflow!");
            } else {
                for (Integer i = 2; i <= numero; i++) {
                    fact = fact.multiply(new BigInteger(Integer.toString(i)));
                }
                
                int comparacion = fact.compareTo(overFlow);
                if (fact.compareTo(underFlow) <= -1) {
                    System.out.println("Underflow!");
                } else if (fact.compareTo(overFlow) <= 0) {
                    System.out.println(fact.toString());
                } else
                    System.out.println("Overflow!");
            }
        }
    }
}