public class ReverseArrayUsingRecursion {
    public static void reverse(int arr[], int l, int r) {
        if (l >= r) {
            return;
        }
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        reverse(arr, l+1 , r-1);
    }

public static void main(String[] args) {
    int [] arr= {1,2,3,4};
    int i = 0;
    int j = arr.length - 1;
    reverse(arr, i, j);
    for(int num : arr)
    {
        System.out.print(num + " ");
    }
}
}
