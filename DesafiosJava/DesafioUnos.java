package algoritmos.unidad2;

import java.math.BigInteger;
import java.util.Scanner;

public class DesafioUnos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while (entrada.hasNext()) {
            String numero = entrada.nextLine();
            String uno = "1";
            int cantidadUnos = 2;
            BigInteger b1 = new BigInteger(numero);
            for (int i = 0; i < numero.length(); i++)
                uno = uno + "1";
            while (true) {  
                BigInteger numeroUnos = new BigInteger(uno);  // (numeroUnos.mod(b1).toString().equals("0")
                if (numeroUnos.mod()) {
                    break;
                }
                uno = uno + "1";
            }
            System.out.println(uno.length());
        }
    }
}
