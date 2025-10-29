package Desafios;
import java.util.Scanner;
public class DesafioSanFermines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casosPrueba = sc.nextInt();
        
        for (int casosContador = 0; casosContador < casosPrueba; casosContador++) {
            int numeroMayor = 0;
            sc.nextLine();
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
