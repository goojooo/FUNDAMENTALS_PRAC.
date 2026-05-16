public class MaximumSumSubarrayOptimal {

    public static void main(String[] args) {

        int arr[] = {4, -1, -2, 1, 5};

        int n = arr.length;

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 0; i < n; i++) {

            currSum += arr[i];

            // Update maximum sum
            if (currSum > maxSum) {
                maxSum = currSum;
                start = tempStart;
                end = i;
            }

            // Reset if current sum becomes negative
            if (currSum < 0) {
                currSum = 0;
                tempStart = i + 1;
            }
        }

        System.out.println("Maximum Sum: " + maxSum);
        System.out.println("Start Index: " + start);
        System.out.println("End Index: " + end);
    }
}