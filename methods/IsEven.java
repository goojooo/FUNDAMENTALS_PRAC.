public class IsEven {
    static boolean isEven(int x)
    {
        if(x % 2 == 0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        boolean res = isEven(221);
        System.out.println(res);
    }
}
