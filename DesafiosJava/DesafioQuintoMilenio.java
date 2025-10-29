package Desafios;
import java.util.Scanner;
public class DesafioQuintoMilenio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casosPrueba = sc.nextInt();
        int indiceLetraEncontrada = 0;
        int indiceLetraBuscamos = 0;
        Boolean encontradoMensaje = true;
        sc.nextLine();
        
        for (int limiteCasos = 1; limiteCasos <= casosPrueba; limiteCasos++) {
            
            String mensajeDondeBuscar = sc.nextLine();
            String mensajeABuscar = sc.nextLine();
            mensajeDondeBuscar = mensajeDondeBuscar.toLowerCase();
            mensajeABuscar = mensajeABuscar.toLowerCase();
            
            indiceLetraBuscamos = 0;
            indiceLetraEncontrada = 0;
            encontradoMensaje = true;

            while (encontradoMensaje && indiceLetraBuscamos < mensajeABuscar.length()) {
                char caracterBuscamos = mensajeABuscar.charAt(indiceLetraBuscamos);
                int busquedaLetra = mensajeDondeBuscar.indexOf(caracterBuscamos, indiceLetraEncontrada);
                
                if (caracterBuscamos == ' ' ) 
                    indiceLetraBuscamos++;
                else if (busquedaLetra >= 0) {
                    indiceLetraBuscamos++;
                    indiceLetraEncontrada = busquedaLetra;
                } else
                    encontradoMensaje = false; 
            }
            if (encontradoMensaje) 
                System.out.println("SI");
            else
                System.out.println("NO");
        }
    }
}