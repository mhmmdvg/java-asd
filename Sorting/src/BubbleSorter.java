public class BubbleSorter {
    int[] L = {25, 27, 10, 8, 76, 21};

    void bubbleSort() {
        int i, j, Max = 6, temp;
        for (i = 0; i < Max - 1; i++) {
            System.out.println("Langkah " + (i + 1) + ":");
            for (j = Max - 1; j > i; j--) {
                if (L[j - 1] > L[j]) {
                    temp = L[j];
                    L[j] = L[j - 1];
                    L[j - 1] = temp;
                }
                System.out.println(L[j] + " index =" + (j+1));
            }
            System.out.println(L[j] + " index =" + (j+1));
        }
        System.out.println("Hasil akhir:");
        for (i = 0; i <= 5; i++) {
            System.out.println(L[i] + " index:" + (i+1));
        }
    }

    public static void main(String[] args) {
        BubbleSorter sorter = new BubbleSorter();
        sorter.bubbleSort();
    }
}
