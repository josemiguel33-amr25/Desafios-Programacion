import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Desafio25AniosDespues {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 1;
        int cantidadCeros = 1;
        List<Integer> listaNumeros = new LinkedList<>();
        
        listaNumeros.add(5);
        listaNumeros.add(25);
        listaNumeros.add(125);
        listaNumeros.add(625);
        listaNumeros.add(3125);
        listaNumeros.add(15625);
        listaNumeros.add(390625);
        listaNumeros.add(9765625);
        listaNumeros.add(48828125);

        while (numero != 0 && cantidadCeros != 0) {
            int sumaCeros = 0;
            numero = entrada.nextInt();
            cantidadCeros = entrada.nextInt();
            
            String mensaje = "NINGUNO";
            int auxiliar = numero;
            boolean bandera = false;
            if (numero == 0 && cantidadCeros == 0)
                break;

            while (true) {
                sumaCeros = 0;
                for (Integer numeroSeleccionado : listaNumeros) {
                    if (numero >= numeroSeleccionado)
                        sumaCeros = sumaCeros + (numero / numeroSeleccionado);    
                    else
                        break;
                }
                
                if (cantidadCeros == sumaCeros){
                    break;
                } else if (sumaCeros > cantidadCeros) {
                    bandera = true;
                    break;
                }
                numero = numero + auxiliar;
            }
            if (!bandera)
                System.out.println(numero);
            else
                System.out.println(mensaje);
            
        }
    }
}