package MateusDavi.faculdadeengexercicios.ordenaçãodedados;

public class QuickSort {

    public static void quicksort(int p, int q, int vetor[]) {

        int x;

        if (p < q) {
            x = particao(p, q, vetor);
            quicksort(p, x - 1, vetor);
            quicksort(x + 1, q, vetor);

        }
    }

    public static int particao(int p, int q, int vetor[]) {

        int j = p - 1;
        int temp, aux = vetor[q];

        for (int i = p; i <= q; i++) {
            if (vetor[i] <= aux) {
                j++;
                temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
        }
        return j;

    }

    public static void main (String entrada []){
        int i, vet[] = {12, 5, -3, 4, 0, 21, 8, -7, 9, 6};
         quicksort(0, 9, vet);
         for (i = 0; i<10 ; i++){
             System.out.println(vet[i]+ " ");
         }
         System.exit(0);
    }
    
}
