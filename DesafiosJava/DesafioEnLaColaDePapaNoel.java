package Desafios;
import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;

public class DesafioEnLaColaDePapaNoel {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //estructuras datos
        Deque<String> colaDePapaNoel = new ArrayDeque<>();

        //variables
        int numCasos = entrada.nextInt();
        int contadorMinutos = 0;
        int indiceMarcos = 0;
        int numNinos = 0;
        String ninos = "";
        boolean marcosHaTerminado = false;
        
        for (int i = 0; i < numCasos; i++) {
            numNinos = entrada.nextInt();
            indiceMarcos = entrada.nextInt() - 1;
            
            //reinicio
            contadorMinutos = 0;
            colaDePapaNoel = new ArrayDeque<>();
            marcosHaTerminado = false;
            
            //limpio buffer
            entrada.nextLine();

            for (int recogerEntrada = 0; recogerEntrada < numNinos; recogerEntrada++) {
                ninos = entrada.next();
                colaDePapaNoel.offer(ninos);
            }
            
            while (!colaDePapaNoel.isEmpty() || marcosHaTerminado == false) {
                if (marcosHaTerminado)
                    break;
                for (int recorrerCola = 0; recorrerCola < colaDePapaNoel.size(); recorrerCola++) {
                    int elementoCola = Integer.parseInt(colaDePapaNoel.poll());

                    if (elementoCola > 1 && indiceMarcos != 0) {
                        contadorMinutos = contadorMinutos + 2;
                        elementoCola = elementoCola - 1;
                        colaDePapaNoel.offer(Integer.toString(elementoCola));
                        indiceMarcos = indiceMarcos - 1;
                        indiceMarcos = indiceMarcos % colaDePapaNoel.size();
                    } else if (elementoCola > 1 && indiceMarcos == 0) {
                        contadorMinutos = contadorMinutos + 2;
                        elementoCola = elementoCola -1;
                        colaDePapaNoel.offer(Integer.toString(elementoCola));
                        indiceMarcos = colaDePapaNoel.size() - 1;
                    } else if (elementoCola == 1 && indiceMarcos != 0) {
                        contadorMinutos = contadorMinutos + 2;
                        indiceMarcos = indiceMarcos - 1;
                        indiceMarcos = indiceMarcos % colaDePapaNoel.size();
                    } else if (elementoCola == 1 && indiceMarcos == 0) {
                        contadorMinutos = contadorMinutos + 2;
                        marcosHaTerminado = true;
                        break;
                    }
                }
            }
            System.out.println(contadorMinutos);

            
        }
    }
}
