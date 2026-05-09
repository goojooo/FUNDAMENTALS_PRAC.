import java.util.ArrayList;
import java.util.List;

public class Subsequence {
    static void printF(int idx, List<Integer> ds, int arr[], int n) {
        // if(idx == n)
        // {
        // for(int id : ds)
        // {
        // System.out.println(id + " ");

        // }
        // if(ds.size() == 0)
        // {
        // System.out.println("{}");
        // }
        // return;
        // }
        // Base Condition
        if (idx == n) {

            if (ds.size() == 0) {
                System.out.println("{}");
            } else {

                for (int id : ds) {
                    System.out.print(id + " ");
                }

                System.out.println();
            }

            return;
        }
        // take or pick particular index into the subsequesnce
        ds.add(arr[idx]);
        printF(idx + 1, ds, arr, n);

        // ds.pop();
        ds.remove(ds.size() - 1);
        printF(idx + 1, ds, arr, n);

        // not pick or not take condition , this element is not added to your
        // subsequence
    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, 2 };
        int n = 3;
        List<Integer> ds = new ArrayList<>();
        printF(0, ds, arr, n);
    }
}
