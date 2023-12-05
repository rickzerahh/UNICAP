public class QuickSort {

    static void quickSort(int[] vetor, int esq, int dir) {
        if (esq < dir) {
            int pi = particao(vetor, esq, dir);

            quickSort(vetor, esq, pi - 1);
            quickSort(vetor, pi + 1, dir);
        }
    }

    static int particao(int[] vetor, int esq, int dir) {
        int pivot = vetor[dir];
        int i = (esq - 1);

        for (int j = esq; j < dir; j++) {
            if (vetor[j] < pivot) {
                i++;

                int temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
        }

        int temp = vetor[i + 1];
        vetor[i + 1] = vetor[dir];
        vetor[dir] = temp;

        return i + 1;
    }

    static void printVetor(int[] vetor) {
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }
    }
}
