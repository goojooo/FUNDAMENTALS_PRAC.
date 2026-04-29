public class FibonacciSeries {
    public static int fibo(int n )
    {
        if(n == 0 )
        {
            return 0;
        }

        // Stop condition
        if(n == 1 || n == 2)
        {
            return 1;
        }
        else{
            return (fibo(n - 1) + fibo(n - 2));
        }
    }

    public static void main(String[] args) {
        int n = 10;
        for(int i = 0 ; i < n ; i++)
        {
            System.err.print(fibo(i) + " ");
        }
    }
}
