package algoritmos.unidad3;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;


public class DesafioNumerosOptimizado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n = 1;
        
        while (n != 0) {
            n = entrada.nextInt();
            int m = 2;
            int mAuxiliar = 2;
            int tamanioInicial = 0;

            
            Queue<Integer> colaNumeros = new ArrayDeque<>();
            List<Integer> setAuxiliar = new ArrayList<>();

            for (int i = 1; i <= n; i++) { 
                colaNumeros.offer(i);
                setAuxiliar.add(i);
            }
            

            while (setAuxiliar.size() > m) {
                if (setAuxiliar.size() <= m)
                    break;
                tamanioInicial = setAuxiliar.size();
                for (int i = 0; i < tamanioInicial; i++) {
                    if (mAuxiliar == m) {
                        setAuxiliar.remove(colaNumeros.poll());
                        mAuxiliar = 1;
                    } else {
                        mAuxiliar++;
                        colaNumeros.offer(colaNumeros.poll());
                    }
                }
                colaNumeros = new ArrayDeque<>(setAuxiliar);
                m++;
                mAuxiliar = m;
            }
            System.out.print(n + ":" + " ");
            for (int i = setAuxiliar.size()-1; i >= 0; i--)
                System.out.print(setAuxiliar.get(i) + " ");
            System.out.println();
        }
    }
}
