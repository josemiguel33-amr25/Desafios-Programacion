package Desafios;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class DesafioNinotsIndultados {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        int numeroVotos = 1;
        
        while (numeroVotos != 0) {
            String ninotGanadorAdulto = "";
            String ninotGanadorInfantil = "";
            int variableAuxiliarGanador = -33;

            numeroVotos = entrada.nextInt();
            int contadorVotosRecogidos = 0;

            //creacion mapas
            Map<String, Integer> mapaVotosAdultos = new LinkedHashMap<>();
            Map<String, Integer> mapaVotosNinos = new LinkedHashMap<>();

            //limpio buffer  de entrada
            entrada.nextLine();
            if (numeroVotos == 0)
                break;

            while (contadorVotosRecogidos < numeroVotos) {
                String ninots = entrada.nextLine();
                String [] arrayVotos = ninots.split(" ");

                for (String elemento : arrayVotos) {
                    if (elemento.equals(elemento.toUpperCase())) {
                        if (!mapaVotosAdultos.containsKey(elemento)) {
                            mapaVotosAdultos.put(elemento, 1);
                            contadorVotosRecogidos++;
                        } else if (mapaVotosAdultos.containsKey(elemento)) {
                            mapaVotosAdultos.put(elemento, mapaVotosAdultos.get(elemento)+1);
                            contadorVotosRecogidos++;
                        }
                    } else if (elemento.equals(elemento.toLowerCase())) {
                        if (!mapaVotosNinos.containsKey(elemento)) {
                            mapaVotosNinos.put(elemento, 1);
                            contadorVotosRecogidos++;
                        } else if (mapaVotosNinos.containsKey(elemento)) {
                            mapaVotosNinos.put(elemento, mapaVotosNinos.get(elemento)+1);
                            contadorVotosRecogidos++;
                        }
                    }
                }
            }
            for (String clave : mapaVotosAdultos.keySet()) {
                if (mapaVotosAdultos.get(clave)  > variableAuxiliarGanador) {
                    ninotGanadorAdulto = clave;
                    variableAuxiliarGanador = mapaVotosAdultos.get(clave);
                } else if (mapaVotosAdultos.get(clave) == variableAuxiliarGanador) {
                    ninotGanadorAdulto = "EMPATE";
                    variableAuxiliarGanador = mapaVotosAdultos.get(clave);
                }
            }
            variableAuxiliarGanador = -33;

            for (String claveInfantil : mapaVotosNinos.keySet()) {
                if (mapaVotosNinos.get(claveInfantil)  > variableAuxiliarGanador) {
                    ninotGanadorInfantil = claveInfantil;
                    variableAuxiliarGanador = mapaVotosNinos.get(claveInfantil);
                } else if (mapaVotosNinos.get(claveInfantil) == variableAuxiliarGanador) {
                    ninotGanadorInfantil = "empate";
                    variableAuxiliarGanador = mapaVotosNinos.get(claveInfantil);
                }
            }
            System.out.println(ninotGanadorInfantil + " " +  ninotGanadorAdulto);
        }
    }
}

