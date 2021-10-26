class MinimizeStorage {
    public static void main(String[] args) {
        int Array[] = { 2, 3, 4, 5, 6, 7 };
        int cost = 0;
        for (int i = 0; i < Array.length - 1; i++) {
            Array[i + 1] = Array[i] + Array[i + 1];
            cost = cost + Array[i + 1];
        }
        System.out.println(cost);
    }

}
