import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class DesafioWorldCup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int casos = sc.nextInt();
        for (int i=0; i<casos; i++) {

            int numeroIntroducido = sc.nextInt();

            double resultado = (Math.pow(((1+Math.sqrt(5))/2), (numeroIntroducido+2))
            - Math.pow(((1-Math.sqrt(5))/2), (numeroIntroducido+2))) / Math.sqrt(5);
            
            System.out.println("Scenario #" + (i+1) + ":");
            pw.println((long) resultado + "\n");
            pw.flush();
        }   
    }
}