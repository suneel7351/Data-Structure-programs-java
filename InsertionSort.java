class InsertionSort {
    public static void main(String[] args) {
        int Arr[] = { 34, 23, 12, 3, 7, 89, 0, 1 };
        InsertSorting sortArray = new InsertSorting();
        System.out.println("Array before sorting");
        sortArray.display(Arr);
        sortArray.sort(Arr);
        System.out.println("Array after sorting");
        sortArray.display(Arr);
    }
}

class InsertSorting {
    void sort(int Arr[]) {
        // Loop for passes
        for (int i = 1; i <= Arr.length - 1; i++) {
            int key = Arr[i];
            int j = i - 1;
            // Loop for each passes
            while (Arr[j] > key && j >= 0) {
                Arr[j + 1] = Arr[j];
                j--;
            }
            Arr[j + 1] = key;
        }
    }

    void display(int Arr[]) {
        for (int k = 0; k < Arr.length; k++) {
            System.out.print(Arr[k] + " ");
        }
        System.out.print("\n");
    }
}
