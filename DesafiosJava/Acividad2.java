package algoritmos.unidad2;

import java.math.BigInteger;

public class Acividad2 {
    public static void main(String[] args) {
        BigInteger b1 = new BigInteger("7");
        BigInteger exponente = new BigInteger("222");
        BigInteger modulo = new BigInteger("10");
        System.out.println(b1.modPow(exponente, modulo));
    }
}
