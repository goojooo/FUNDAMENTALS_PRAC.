public class PrintNumberUsingBacktracing {

    public static void print(int i, int n) {

        // Base Condition
        if (i < 1) {
            return;
        }

        // Recursive Call
        print(i - 1, n);

        // Backtracking Step
        System.out.println(i);
    }

    public static void main(String[] args) {

        int n = 5;

        print(n, n);
    }
}