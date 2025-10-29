package Desafios;
import java.util.Arrays;
import java.util.Scanner;
public class Desafio7Picos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cantidadAlturasMontaña = 1;
        int contadorPicos = 0;
        
        while (true) {
            cantidadAlturasMontaña = entrada.nextInt();
            if (cantidadAlturasMontaña == 0) 
                break;
            int [] arrayAlturas = new int[cantidadAlturasMontaña];
            entrada.nextLine();

            String cadenaAlturas = entrada.nextLine();
            String[] alturas = cadenaAlturas.split(" ");
            contadorPicos = 0;
            for(int i = 0; i < arrayAlturas.length; i++){
                arrayAlturas[i] = Integer.parseInt(alturas[i]);
            }

            for (int i = 0; i < arrayAlturas.length; i++) {
                if (i != arrayAlturas.length-1) {
                        if (i == 0)  {
                            if (arrayAlturas[i] > arrayAlturas[i+1] && arrayAlturas[i] > arrayAlturas[arrayAlturas.length-1])
                                contadorPicos++;
                        } else if (arrayAlturas[i] > arrayAlturas[i+1] && arrayAlturas[i] > arrayAlturas[i-1]) {
                            contadorPicos++;
                        }
                } else if (i == arrayAlturas.length-1) {
                    if (arrayAlturas[i] > arrayAlturas[i-1] && arrayAlturas[i] > arrayAlturas[0])
                        contadorPicos++;
                }
                
            }
            System.out.println(contadorPicos);



        } 
    }
}
