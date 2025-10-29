import java.util.Scanner;

public class DesafioGCDLCM {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Integer numeroCasos = entrada.nextInt();
        for (int i = 0; i < numeroCasos ; i++) {
            Integer mD = entrada.nextInt();
            Integer mMultiplo = entrada.nextInt();
            
            if (mMultiplo % mD == 0) {
                System.out.println(mD + " " + mMultiplo);
            }
            else 
                System.out.println(-1);
            
        }
    }
}
