public class Maximun {
    

    static void getMax(int x, int y)
    {
        if(x > y)
            System.out.println("Max = x : " + x);
        else if(x == y)
            System.out.println("x and y are equals...");
        else
            System.out.println("Max = y : " + y);
    }
    public static void main(String[] args) {
        getMax(10,1);
    }
}
