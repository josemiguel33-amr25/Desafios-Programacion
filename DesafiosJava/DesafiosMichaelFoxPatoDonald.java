package Desafios;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

public class DesafiosMichaelFoxPatoDonald {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numPersonasGrupo = 1;
        String fecha = "";
        Boolean cumple = false;

        Set<String> conjuntoFechas = new HashSet<>();

        while (numPersonasGrupo != 0) {
            cumple = false;
            conjuntoFechas = new HashSet<>();
            numPersonasGrupo = entrada.nextInt();
            
            if (numPersonasGrupo == 0)
                break;
            
                for (int i = 0; i < numPersonasGrupo; i++) {
                    fecha = entrada.next();

                    if (conjuntoFechas.add(fecha.substring(0, fecha.length()-5)) == false) {
                        cumple = true;
                        break;
                    }
                }
            entrada.nextLine();
            if (cumple)
                System.out.println("SI");
            else
                System.out.println("NO");
        }

    }   
}
