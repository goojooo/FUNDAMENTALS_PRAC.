public class ParamaterizedRecursion {
    public static void print(int i , int sum)
    {
        if(i < 1)
        {
            System.out.println(sum);
            return;
        }
        print(i -1 , sum + i);
    }
    public static void main(String[] args) {
        int n = 5;
        print(n , 0);
    }
}
