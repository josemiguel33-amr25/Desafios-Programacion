package Desafios;
import java.util.Scanner;

public class DesafioLa1314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroCasos = sc.nextInt();
        sc.nextLine();
        for (int cuantosCasos = 0; cuantosCasos < numeroCasos; cuantosCasos++) {
            String [] numerosLlaves = sc.nextLine().split("-");
            int numero1 = Integer.parseInt(numerosLlaves[0]);
            int numero2 = Integer.parseInt(numerosLlaves[1]);

            if (numero2 % 2 == 0 && numero1-1 == numero2)
                System.out.println("SI");
            else if (numero1 % 2 == 0 && numero2-1 == numero1)
                System.out.println("SI");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
