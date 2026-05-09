public class FiboRecursion {

    static int fibo(int n)
    {
        if(n <= 1)
        {
            return n;
        }
        int n1 = fibo(n - 1);
        int n2 = fibo(n - 2);

        return n1 + n2;
    }
    public static void main(String[] args) {
        int n = 4;
        // fibo(n);
        System.out.println(fibo(n));
    }
}