public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 3, 4, 5, 5, 6 };
        int res = 0;
        for (int i = 0; i < arr.length; i++) {

            if (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                continue;
            } else {
                arr[res] = arr[i];
                res++;
            }

            // System.out.println(arr[res]);
        }
        for(int i = 0 ; i < res ; i++)
        {
            System.out.println(arr[i] + " ");
        }

        // int officer = 0;
        // int res = 1;
        // int cm = 1;
        // int n = arr.length;
        // while (cm < n) {
        // if(arr[cm]==arr[cm -1]){
        // cm++;
        // continue;
        // }
        // arr[officer+1]=arr[cm];
        // officer++;
        // res++;
        // cm++;
        // // return res;

        // }
        // System.out.println(arr[res]);

        // for(int i : arr)
        // {
        // System.out.print(i + " ");
        // }
    }
}
