package Desafios;
import java.util.Scanner;
public class DesafioCodigoDeBarras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String codigoBarra = "1";
        int calculoDigitos = 0;
        Boolean esEan8 = true;
        
        while (!codigoBarra.equals("0")) {
            codigoBarra = sc.nextLine();
            String codigoBarraSinDigitoControl = codigoBarra.substring(0,codigoBarra.length()-1);
            int digitoControl = Integer.parseInt(codigoBarra.substring(codigoBarra.length()-1));
            calculoDigitos = 0;
            
            if (codigoBarra.length() > 8)
                esEan8 = false;
            else if (codigoBarra.length() <= 8)
                esEan8 = true;
            
                for (int indice = 1; indice <= codigoBarraSinDigitoControl.length(); indice++) {
                int digitoSeleccionado = Integer.parseInt(codigoBarraSinDigitoControl.substring(codigoBarraSinDigitoControl.length()-indice,codigoBarraSinDigitoControl.length()-indice+1));
                if (indice%2 == 0) 
                    calculoDigitos = digitoSeleccionado + calculoDigitos;
                else if (indice%2 != 0)
                    calculoDigitos = digitoSeleccionado * 3 + calculoDigitos;
            
            }

            System.out.println(calculoDigitos);
            if ((digitoControl + calculoDigitos)%10 == 0)
                System.out.println("SI");
            else if (calculoDigitos % 10 == 0)
                System.out.println("SI");
            else if ((digitoControl + calculoDigitos) % 10 != 0)
                System.out.println("NO");

        }

}
}
