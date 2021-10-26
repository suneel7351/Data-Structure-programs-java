class QuickSort {
    public static void main(String ar[]) {
        int Arr[] = { 6, 13, 9, 13, 45 };
        int high = Arr.length;
        int low = 0;
        QuickSorting newArray = new QuickSorting();
        newArray.printArray(Arr, high);
        newArray.quicksort(Arr, low, high);
        newArray.printArray(Arr, high);
    }
}

class QuickSorting {
    void printArray(int Arr[], int high) {
        for (int i = 0; i < high; i++) {
            System.out.print(Arr[i] + " ");
        }
        System.out.println("\n");
    }

    void quicksort(int Arr[], int low, int high) {
        int partitionIndex;
        if (low < high) {
            partitionIndex = partition(Arr, low, high);
            quicksort(Arr, low, partitionIndex - 1);
            quicksort(Arr, partitionIndex + 1, high);
        }
    }

    int partition(int Arr[], int low, int high) {
        int pivot = Arr[low];
        int i = low + 1;
        int j = high;
        int temp;

        do {
            while (Arr[i] <= pivot) {
                i++;
            }
            while (Arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                temp = Arr[i];
                Arr[i] = Arr[j];
                Arr[j] = temp;
            }
        } while (i < j);
        temp = Arr[low];
        Arr[low] = Arr[j];
        Arr[j] = temp;
        return j;
    }
}