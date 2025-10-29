package Desafios;
import java.util.Scanner;
import java.math.BigInteger;
public class DesafioCuantasMeLlevo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String conversion1 = "1";
        String conversion2 = "2";
        int longitudMayor = 0;

        while ( !conversion1.equals("0") || !conversion2.equals("0")){
            String cerosNecesarios = "";
            int contadorLlevadas = 0;
            int acarreos = 0;
            String[] partes = sc.nextLine().split(" ");

            String llevadaCadena = "";
            conversion1 = partes[0];
            conversion2 = partes[1];
            if (conversion1.length() > conversion2.length()) {
                longitudMayor = conversion1.length();
                
                for (int indiceCeros = 0; indiceCeros < conversion1.length()-conversion2.length(); indiceCeros++) {
                    cerosNecesarios = cerosNecesarios.concat("0");
                }
                conversion2 = cerosNecesarios.concat(conversion2);

            } else if (conversion1.length() < conversion2.length()) { 
                longitudMayor = conversion2.length();

                for (int indiceCeros = 0; indiceCeros < conversion2.length()-conversion1.length(); indiceCeros++) {
                    cerosNecesarios = cerosNecesarios.concat("0");
                }

                conversion1 = cerosNecesarios.concat(conversion1);
            } else 
                longitudMayor = conversion1.length();
            
            if (!conversion1.equals("0") || !conversion2.equals("0")) {
                for (int indice = longitudMayor-1; indice >= 0; indice--) {
                
                    char caracter1Seleccionado1 = conversion1.charAt(indice);
                    String caracterSeleccionadoConvertido = Character.toString(caracter1Seleccionado1);
                    char caracter2Seleccionado2 = conversion2.charAt(indice);
                    String caracterSeleccionadoConvertido2 = Character.toString(caracter2Seleccionado2);
                    
                    
                    llevadaCadena = String.valueOf(contadorLlevadas);
                    BigInteger sumando1 = new BigInteger(caracterSeleccionadoConvertido);
                    BigInteger llevada = new BigInteger(llevadaCadena);
                    sumando1 = llevada.add(sumando1);
                    //reinciio de contadorees
                    contadorLlevadas = 0;
                    llevadaCadena = "";

                    if ( sumando1.compareTo(new BigInteger("10")) == 1 ||  sumando1.compareTo(new BigInteger("10")) == 0 ) {
                        acarreos++;
                        contadorLlevadas++;
                    }

                    BigInteger sumando2 = new BigInteger(caracterSeleccionadoConvertido2);
                    BigInteger sum = sumando1.add(sumando2);
                    
                    if ( sum.compareTo(new BigInteger("10")) == 1 ||  sum.compareTo(new BigInteger("10")) == 0 ) {
                        acarreos++;
                        contadorLlevadas++;
                    }
                }
                    System.out.println(acarreos);
            }
        }
        sc.close();
    }
}
