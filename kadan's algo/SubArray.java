class SubArray {
    public static void main(String[] args) {

        int arr[] = {1, 3, 1,2,2};
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {

                System.out.print("[ ");

                // print elements from i to j
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }

                System.out.println("]");
            }
        }
    }
}