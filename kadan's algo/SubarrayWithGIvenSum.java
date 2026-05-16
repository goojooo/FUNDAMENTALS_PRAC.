public class SubarrayWithGIvenSum {

    public static void main(String[] args) {

        int arr[] = {10, 2, -2, -20, 10, 5};
        int target = -10;

        int n = arr.length;

        int startIndex = -1;
        int endIndex = -1;

        for (int start = 0; start < n; start++) {

            int cS = 0; // reset for every start

            for (int end = start; end < n; end++) {

                cS += arr[end];

                if (cS == target) {

                    startIndex = start;
                    endIndex = end;
                    break;
                }
            }

            if (startIndex != -1)
                break;
        }

        if (startIndex == -1) {
            System.out.println("No subarray found");
        } else {

            System.out.println("Subarray with given sum:");

            for (int i = startIndex; i <= endIndex; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}