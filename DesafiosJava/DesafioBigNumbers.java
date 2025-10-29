package algoritmos.unidad2;

import java.math.BigInteger;
import java.util.Scanner;

class DesafioBigNumbers{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while (entrada.hasNext()) {
            int numero = entrada.nextInt();     
            BigInteger fact = new BigInteger("1");
            BigInteger sumaDigitos = new BigInteger("0");

            for (Integer i = 2; i <= numero; i++) 
                fact = fact.multiply(new BigInteger(Integer.toString(i)));


            for (int i = 0; i < fact.toString().length(); i++) 
                sumaDigitos = sumaDigitos.add(new BigInteger (fact.toString().substring(i, i+1)));
            
            System.out.println(sumaDigitos.toString());
        }
    }
}