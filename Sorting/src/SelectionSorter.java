public class SelectionSorter {
    int[] L = {25, 27, 10, 8, 76, 21};

    void selectionSort() {
        int j, k, i, temp;
        int jmax, u = 5;
        for (j = 0; j < 6; j++) {
            jmax = 0;
            System.out.println("Langkah " + (j + 1) + ":");
            for (k = 1; k <= u; k++) {
                if (L[k] > L[jmax]) {
                    jmax = k;
                }
            }
            temp = L[u];
            L[u] = L[jmax];
            L[jmax] = temp;
            u--;
            //melihat hasil tiap langkah
            for (i = 0; i <= 5; i++) {
                System.out.println(L[i] + " index:" + (i + 1));
            }
        }
        System.out.println("Hasil akhir:");
        for (i = 0; i <= 5; i++) {
            System.out.println(L[i] + " index:" + (i + 1));
        }
    }

    public static void main(String[] args) {
        SelectionSorter sorter = new SelectionSorter();
        sorter.selectionSort();
    }
}
