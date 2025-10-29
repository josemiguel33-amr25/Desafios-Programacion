package Desafios;
import java.util.Scanner;

public class DesafioAburrimientoAutopista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCasos = sc.nextInt();
        sc.nextLine();
        
        for (int casosPrueba = 0; casosPrueba < numCasos; casosPrueba++) {
            String matricula = sc.next();
            
            int contadorNuevos = 0;
            int contadorAntiguos = 0;
            int matriculasIguales = 0;

            String numeroMatriculaEdu = matricula.substring(0,4);
            String letrasMatriculaEdu = matricula.substring(4);
            
            while (!"0".equals(matricula)) {
                matricula = sc.next();
                if ("0".equals(matricula))
                   break;
                String numerosMatricula = matricula.substring(0,4);
                String letrasMatricula = matricula.substring(4);
                
                int comparacionLetras = letrasMatriculaEdu.compareTo(letrasMatricula);
                int comparacionNumeros = numeroMatriculaEdu.compareTo(numerosMatricula);
                
                if (comparacionLetras < 0)
                   contadorNuevos++;
                else if (comparacionLetras  > 0)
                   contadorAntiguos++;
                else if (comparacionLetras == 0)
                   if (comparacionNumeros > 0)
                      contadorAntiguos++;
                    else if (comparacionNumeros < 0)
                      contadorNuevos++;
                    else
                      matriculasIguales++;
                else    
                   matriculasIguales++;
                    
            }
            System.out.println(contadorAntiguos + " " + contadorNuevos);
        }
    }
}