import java.util.Scanner;

class Hashing {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask user for array size
        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        // Create array
        int arr[] = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            // Show what got stored
            System.out.println("Stored " + arr[i] + " at index " + i);
        }

        // Create hash array
        int hash[] = new int[100];

        // Frequency counting
        System.out.println("\nCounting frequency...");

        for (int i = 0; i < n; i++) {

            hash[arr[i]]++;

            System.out.println(
                "Number " + arr[i] +
                " frequency became " +
                hash[arr[i]]
            );
        }

        // Ask number of queries
        System.out.println("\nHow many queries?");
        int q = sc.nextInt();

        // Process queries
        while (q-- > 0) {

            System.out.println("\nEnter number to search frequency:");

            int num = sc.nextInt();

            System.out.println(
                "Frequency of " + num +
                " is: " + hash[num]
            );
        }

        sc.close();
    }
}