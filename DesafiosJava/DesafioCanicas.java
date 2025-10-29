package Desafios;
import java.util.Scanner;
public class DesafioCanicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCasos = sc.nextInt();
        for (int vecesBucle = 0; vecesBucle < numCasos; vecesBucle++) {
            int alturapiramide = sc.nextInt();
            int numCanicasNecesarias = 0;
            for (int vecesAltura = 1; vecesAltura <= alturapiramide; vecesAltura++ ) {
                for (int numVeces = 1; numVeces <= vecesAltura; numVeces++) 
                    numCanicasNecesarias = numCanicasNecesarias+numVeces;
                
            }    
            System.out.println(numCanicasNecesarias);
        }
        sc.close();
    }
}
