public class MergeSort {

    static void mergeSort(int[] vetor, int esq, int dir) {
        if (esq < dir) {
            int m = (esq + dir) / 2;

            mergeSort(vetor, esq, m);
            mergeSort(vetor, m + 1, dir);

            merge(vetor, esq, m, dir);
        }
    }

    static void merge(int[] vetor, int esq, int meio, int r) {
        int n1 = meio - esq + 1;
        int n2 = r - meio;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = vetor[esq + i];
        for (int j = 0; j < n2; ++j)
            R[j] = vetor[meio + 1 + j];

        int i = 0, j = 0;
        int k = esq;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                vetor[k] = L[i];
                i++;
            } else {
                vetor[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            vetor[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            vetor[k] = R[j];
            j++;
            k++;
        }
    }

    static void printVetor(int[] vetor) {
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }
    }
}