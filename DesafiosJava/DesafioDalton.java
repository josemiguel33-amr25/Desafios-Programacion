package Desafios;
import java.util.Scanner;

public class DesafioDalton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroPersonas = 1;
        int seleccionNumero = 0;
        while (numeroPersonas != 0) {
            boolean esDalton = true;
            int anteriorNumero = 0;
            numeroPersonas = sc.nextInt();
            sc.nextLine();
            if (numeroPersonas == 0)
                break;
            else if (numeroPersonas >= 2) {
                String alturas = sc.nextLine();
                String [] alturasEntradas = alturas.split(" ");
                int primerNumero = Integer.parseInt(alturasEntradas[0]);
                if (alturasEntradas.length == numeroPersonas) {
                    for (int indice = 0; indice <= numeroPersonas-1; indice++) {
                        seleccionNumero = Integer.parseInt(alturasEntradas[indice]);
                        if (seleccionNumero < primerNumero || seleccionNumero <= anteriorNumero) {
                            esDalton = false;
                            break;
                        }
                        anteriorNumero = Integer.parseInt(alturasEntradas[indice]);
                    }
                    
                    if (esDalton) 
                        System.out.println("DALTON");
                    else 
                        System.out.println("DESCONOCIDO");
                }
            }
            
        }
        sc.close();    
    }
}
