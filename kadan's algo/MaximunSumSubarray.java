public class MaximunSumSubarray {
    public static void main(String[] args) {
        // int arr [] = {1,2,3,4,5};
        // int arr [] = {-2 ,-3, 4, -1, -2, 1, 5, -3};
        // int arr [] = {1,2,-3,2,1};
        int arr [] = {4, -1, -2, 1, 5};
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        for(int st = 0 ; st < n; st++)
        {
            int currSum = 0;
            for(int end = st ; end < n ; end++)
            {
                currSum += arr[end];
                maxSum = Math.max(maxSum , currSum);
            }
        }
        System.out.println("Maximum sum of subarray -> " + maxSum);
    }
}
