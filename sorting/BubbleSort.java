public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 13, 45, 24, 52, 20, 9 };

        int n = arr.length;

        System.out.println("Original array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = n - 1; i >= 0; i--) {
            int didSwap = 0;
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = t;
                    didSwap = 1;
                }
            }
            if(didSwap == 0)
            {
                break; // O(n)
            }
        }
        System.out.println("Sorted array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        } 
        // O(n2)

    }
}
