package Desafios;
import java.util.Scanner;
public class DesafioRectangulo {
    public static void main(String[] args) {
        boolean rectanguloNoProcesado = false;
        Scanner sc = new Scanner(System.in);
        while (rectanguloNoProcesado == false) {
            String medidasRectangulo = sc.nextLine();
            String [] medidasRectanguloLista = medidasRectangulo.split(" ");
            int x1 = Integer.parseInt(medidasRectanguloLista[0]);
            int y1 = Integer.parseInt(medidasRectanguloLista[1]); 
            int x2 = Integer.parseInt(medidasRectanguloLista[2]); 
            int y2 = Integer.parseInt(medidasRectanguloLista[3]);

            if (x2-x1 < 0 && y2-y1<0)
                rectanguloNoProcesado = true;
            else {
                int areaRectangulo = (y2-x1)*(x2-y1);
                System.out.println(areaRectangulo);
            }
                
        }
        sc.close();
    }
}
