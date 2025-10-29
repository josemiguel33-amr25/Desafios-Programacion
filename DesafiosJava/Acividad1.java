package algoritmos.unidad2;

import java.math.BigInteger;

public class Acividad1 {
    public static void main(String[] args) {
        BigInteger b1 = new BigInteger("2");
        BigInteger exponente = new BigInteger("1000");
        BigInteger modulo = new BigInteger("13");
        System.out.println(b1.modPow(exponente, modulo));
    }
}
