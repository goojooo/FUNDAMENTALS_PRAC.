// public class SelectionSort {

//     public static void main(String[] args) {
//         int arr[] = { 13, 46, 24, 52, 20, 9 };
//         int n = arr.length;

//         System.out.println("Original array : ");

//         System.out.println("\n");

//         for (int i = 0; i <= n - 1; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println("Array after sorting : ");
//         // Selection sort
//         for (int i = 0; i < n - 1; i++) {
//             // Assume current index has minimum value
//             int minIndex = i;
//             System.out.println("Pass " + (i + 1));

//             // Find smallest element
//             for (int j = 0; j < n; j++) {
//                 System.out.println("COmparing " + arr[j] + " and " + arr[minIndex]);
//                 if (arr[j] < arr[minIndex]) {
//                     minIndex = j;
//                     System.out.println(arr[j] + " is new minimun");
//                 }
//                 // System.out.println(arr[i]);
//             }
//             // Swap
//             int t = arr[i];
//             arr[i] = arr[minIndex];
//             arr[i] = t;

//             // Print array after each pass
//             System.out.println("Array after pass + " + (i + 1) + " : ");
//             for (int k = 0; k < n; k++) {
//                 System.out.print(arr[k] + " ");
//             }
//             System.out.println();

//         }
//         // Final sorted array
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

public class SelectionSort {

    public static void main(String[] args) {

        int arr[] = {13, 46, 24, 52, 20, 9};

        int n = arr.length;

        // Print original array
        System.out.println("Original Array:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n");

        // Selection Sort
        for (int i = 0; i < n - 1; i++) {

            // Assume current index has minimum value
            int minIndex = i;

            System.out.println("Pass " + (i + 1));

            // Find smallest element
            for (int j = i + 1; j < n; j++) {

                System.out.println(
                    "Comparing " + arr[j] +
                    " and " + arr[minIndex]
                );

                if (arr[j] < arr[minIndex]) {

                    minIndex = j;

                    System.out.println(
                        arr[j] + " is new minimum"
                    );
                }
            }

            // Swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

            // Print array after each pass
            System.out.print("Array after pass " + (i + 1) + ": ");

            for (int k = 0; k < n; k++) {
                System.out.print(arr[k] + " ");
            }

            System.out.println("\n");
        }

        // Final sorted array
        System.out.println("Sorted Array:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}