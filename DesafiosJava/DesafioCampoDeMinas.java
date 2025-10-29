package Desafios;
//60 min con 54 segundos
import java.util.Scanner;

public class DesafioCampoDeMinas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int ancho = 1;
        int alto = 1;
        String medidas = "";
        String paraInsertarEnMatriz = "";


        while (ancho != 0 || alto != 0) {
            medidas = entrada.nextLine();
            ancho = Integer.parseInt(medidas.substring(0,1));
            alto = Integer.parseInt(medidas.substring(2, 3));
            int contadorMinas = 0;
            int contadorHuecosConSeisAlrededor = 0;
            String [][] tablero = new String[alto][ancho];
            if (ancho == 0 || alto == 0)
                break;
                
            for (int filasIndice = 0; filasIndice < alto; filasIndice++ ) {
                paraInsertarEnMatriz = entrada.nextLine();
                for (int columnaIndice = 0; columnaIndice < ancho; columnaIndice++) {
                    tablero[filasIndice][columnaIndice] = paraInsertarEnMatriz.substring(columnaIndice,columnaIndice+1);
                }
            }

            for (int filas = 0; filas < alto; filas++) {
                for (int columna = 0; columna < ancho; columna++) {
                    String seleccion = tablero[filas][columna];
                    if (seleccion.equals("-")) {
                        if ((filas != 0 && filas != tablero.length-1) && (columna != 0 && columna != tablero[filas].length-1) ) {
                                for (int filas2 = filas-1; filas2 < filas+2; filas2++) {
                                    for (int columnas2 = columna-1; columnas2 < columna+2; columnas2++ ) {
                                        if (tablero[filas2][columnas2].equals("m")) 
                                            contadorMinas++;
                                    }
                                }
                        }
                    }
                    if (contadorMinas >= 6)
                        contadorHuecosConSeisAlrededor++;
                    
                    contadorMinas = 0;
                }
            }
            System.out.println(contadorHuecosConSeisAlrededor);

        }
    }
}
