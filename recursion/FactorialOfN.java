public class FactorialOfN {
    public static int fact(int i)
    {
        if(i == 0)
        {
            return 1;
        }

        return i * fact(i - 1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
    }
}
