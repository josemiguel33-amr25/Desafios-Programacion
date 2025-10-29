package Desafios;

import java.util.Scanner;

public class DesafioCadenaDeBarras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String codigoBarras = "1";
        while (!codigoBarras.equals("0")) {
            codigoBarras = sc.nextLine();
           String codigoBarrasSinDigitoControl = codigoBarras.substring(0,codigoBarras.length()-1);
           System.out.println(codigoBarrasSinDigitoControl);
        }


    }
}
