public class Ex {
    static int fact1(int x , int y)
    {
        if(x == 0)
        {
            return y ;
        }
        else{
            return fact1(x - 1 , x + y);
        }
    }
    public static void main(String[] args) {
        System.out.println(fact1(5, 2));
    }
}
