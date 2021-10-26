class BubbleSort {
    public static void main(String ar[]) {
        int Arr[] = { 23, 43, 1, 0, 9, 3, 5 };
        Sorting sortedArray = new Sorting();
        sortedArray.display(Arr);
        sortedArray.Sort(Arr);
        sortedArray.display(Arr);
    }
}

class Sorting {
    void Sort(int Arr[]) {
        for (int i = 0; i < Arr.length - 1; i++) {
            for (int j = 0; j < Arr.length - i - 1; j++) {
                if (Arr[j] > Arr[j + 1]) {
                    int temp = Arr[j];
                    Arr[j] = Arr[j + 1];
                    Arr[j + 1] = temp;
                }
            }
        }
    }

    void display(int Arr[]) {
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + " ");
        }
        System.out.print("\n");
    }
}