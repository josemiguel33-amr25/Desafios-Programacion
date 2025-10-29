package algoritmos.unidad2;

import java.math.BigInteger;
import java.util.Scanner;

class DesafioQuinientos{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while (entrada.hasNext()) {
            int numero = entrada.nextInt();     
            BigInteger fact = new BigInteger("1");

            for (Integer i = 2; i <= numero; i++) 
                fact = fact.multiply(new BigInteger(Integer.toString(i)));
            
                
            System.out.println(numero + "!");
            System.out.println(fact.toString());

        }
    }
}