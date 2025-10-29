package Desafios;
import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;
public class DesafioParentesisBalanceados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String linea = "";
        boolean esBalanceado = true;
        String elementoSeleccionado = "";

        while (true) {
            Deque<String> pila = new ArrayDeque<>();
            linea = entrada.nextLine();
            
            for (int i = 0; i < linea.length(); i++) {
                if (elementoSeleccionado.equals("(") || elementoSeleccionado.equals("{") || elementoSeleccionado.equals("[") )
                pila.push(elementoSeleccionado);
            }

            if (pila.isEmpty())
                System.out.println("YES");
            else {
                for (int i = 0; i < linea.length(); i++) {
                    elementoSeleccionado = linea.substring(i, i+1);
                    String elementoDeLaCola = pila.poll();

                    if (elementoSeleccionado.equals(")") || elementoSeleccionado.equals("}") || elementoSeleccionado.equals("]")) {
                        if (!elementoSeleccionado.equals(")") && !elementoDeLaCola.equals("(")) {
                            esBalanceado = false;
                            break;
                        } else if (!elementoSeleccionado.equals("}") && !elementoDeLaCola.equals("{")) {
                            esBalanceado = false;
                            break;
                        } else if (!elementoSeleccionado.equals("]") && !elementoDeLaCola.equals("[")) {
                            esBalanceado = false;
                            break;
                        }
                    }

                }

            }
            
        
            if (esBalanceado)
                System.out.println("YES");
            else if (!esBalanceado)
                System.out.println("NO");
        }
    }

