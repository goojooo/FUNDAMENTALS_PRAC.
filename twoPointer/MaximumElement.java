public class MaximumElement {
    public static void main(String[] args) {
        int arr [] = {3, 7, 2, 9, 5};
        int max = arr[0];
        int n = arr.length;

        for(int i = 1 ; i < n ; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
        }
        System.out.println("Max element ->> " + max);
    }
}
