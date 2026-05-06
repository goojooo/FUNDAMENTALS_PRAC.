public class CheckSortedArray {
    public static void main(String[] args) {
        // Input: [1, 2, 2, 4, 5] → true
        // Input: [1, 3, 2] → false
        int arr[] = {1,2,2,4,5};
        // int arr[] = {1,3,2};
        int left = 0;
        int right = arr.length - 1;
        boolean isSorted = true;
        // while(arr[left] < arr[right])
        // {
        //     if(arr[left] < arr[right])
        //     {
        //         isSorted = true;
        //     } else{
        //         isSorted = false;
        //     }
        // }
        for(int i = 0 ; i < arr.length-1 ; i++)
        {
            if(arr[i] > arr[i + 1])
            {
                isSorted = false;
            }
        }
        System.out.println("Array is sorted ? -->>> " + isSorted);
    }
}
