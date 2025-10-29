package Desafios;
import java.util.Scanner;
public class DesafioSanFerminesPeroSinControlDeCasos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int numeroMayor = 0;
            String torosVelocidades = sc.nextLine();
            String [] torosVelocidadesLista = torosVelocidades.split(" ");
            int numToros = Integer.parseInt(torosVelocidadesLista[0]);
        
            if (numToros >= 1) { 
                if (torosVelocidadesLista.length-1 == numToros) {
                    for (int indice = 1; indice <= numToros; indice++) {
                        int seleccion = Integer.parseInt(torosVelocidadesLista[indice]);
                        if (seleccion > numeroMayor) {
                            numeroMayor = seleccion;
                        }
                    }
                }
            }
            System.out.println(numeroMayor);
        }
    }
}
