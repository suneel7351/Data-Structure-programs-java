class BubbleSortForChar {
    public static void main(String[] args) {
        char Arr[] = { 'x', 'e', 'w', 'a', 'u', 'i', 'p' };
        CharSorting sort = new CharSorting();
        System.out.println("Array before Sorting");
        sort.display(Arr);
        sort.Sort(Arr);
        System.out.println("Array after Sorting");
        sort.display(Arr);
    }
}

class CharSorting {
    void Sort(char Arr[]) {
        for (int i = 0; i < Arr.length - 1; i++) {
            for (int j = 0; j < Arr.length - i - 1; j++) {
                if ((int) Arr[j] > (int) Arr[j + 1]) {
                    char temp = Arr[j];
                    Arr[j] = Arr[j + 1];
                    Arr[j + 1] = temp;
                }
            }
        }
    }

    void display(char Arr[]) {
        for (int k = 0; k < Arr.length; k++) {
            System.out.print(Arr[k] + " ");
        }
        System.out.print("\n");
    }
}