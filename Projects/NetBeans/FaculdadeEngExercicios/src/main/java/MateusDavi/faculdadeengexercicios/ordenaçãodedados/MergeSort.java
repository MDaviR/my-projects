package MateusDavi.faculdadeengexercicios.ordenaçãodedados;

public class MergeSort {

    public static void mergeSort(int[] a, int inicio, int fim) {
        if (inicio == fim) {
            return;
        }
        int meio = (inicio + fim) / 2;
        mergeSort(a, inicio, meio);
        mergeSort(a, meio + 1, fim);
        merge(a, inicio, meio, fim);

    }

    public static void merge(int[] a, int inicio, int meio, int fim) {
        int n = fim - inicio + 1;
        int[] b = new int[n];
        int il = inicio, i2 = meio + 1, j = 0;

        while (il <= meio && i2 <= fim) {
            if (a[il] < a[i2]) {
                b[j] = a[il];
                il++;
            } else {
                b[j] = a[i2];
                i2++;
            }
            j = j + 1;
        }
        while (il <= meio) {
            b[j] = a[il];
            il = il + 1;
            j = j + 1;
        }
        while (i2 <= fim){
            b[j] = a[i2];
            i2 = i2 + 1;
            j = j + 1;
            
        }
        for (j = 0; j < n; j++) {
            a[inicio + j] = b[j];
        }

    }

    public static void main(String entrada[]) {
        int i, vet[] = {0, 8, -4, 16, -12, 17, 13, -9, 2, 11};
        mergeSort(vet, 0, 9);

        for (i = 0; i < 10; i++) {
            System.out.println(vet[i] + " ");
        }
        System.exit(0);

    }
}
