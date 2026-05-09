public class PrintReverse {
    public static int num(int n)
    {
        if(n == 0){
            return 0;
        }
        System.out.println(n);
        n--;
        return num(n);

    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(num(n));
    }
}
