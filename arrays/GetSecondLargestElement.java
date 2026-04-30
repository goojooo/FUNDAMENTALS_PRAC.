import java.util.Arrays;

public class GetSecondLargestElement {
    public static int secondLargestElement(int arr[]) {
       int n = arr.length;
    //    int secondLargest = n - 1;
       
       Arrays.sort(arr);
       for(int i = n - 2; i >= 0 ; i--)
       {
        if(arr[i] != arr[n -1])
            return arr[i];
       }
       return -1;
    }

    public static void main(String[] args) {
        // int[] arr = { 23, 21, 53, 76, 12, 64, 97, 34, 65, 78 };
         int[] arr = { 12, 35, 1, 10, 34, 1 };
        System.out.println(secondLargestElement(arr));
    }
}
