public class CountZero {
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 3, 0};
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] == 0)
            {
                count++;
            }
        }
        System.out.println("Count of 0 is -->> " + count);
    }
}
