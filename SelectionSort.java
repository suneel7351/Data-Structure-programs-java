class SelectionSort {
    public static void main(String[] args) {
        int Arr[] = { 34, 23, 12, 3, 7, 89, 0, 1 };
        SelectionSorting sortArray = new SelectionSorting();
        System.out.println("Array before sorting");
        sortArray.display(Arr);
        System.out.println("Array after sorting");
        sortArray.sort(Arr);
        sortArray.display(Arr);
    }
}

class SelectionSorting {
    void sort(int Arr[]) {
        for (int i = 0; i < Arr.length; i++) {
            int indexOfMin = i;
            for (int j = i + 1; j < Arr.length; j++) {
                if (Arr[indexOfMin] > Arr[j]) {
                    indexOfMin = j;
                }
            }
            int temp = Arr[i];
            Arr[i] = Arr[indexOfMin];
            Arr[indexOfMin] = temp;
        }
    }

    void display(int Arr[]) {
        for (int k = 0; k < Arr.length; k++) {
            System.out.print(Arr[k] + " ");
        }
        System.out.print("\n");
    }
}