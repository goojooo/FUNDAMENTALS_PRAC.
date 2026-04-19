package loops;

public class FibonacciSeries {
    
public static void main(String[] args) {
    int first = 0;
    int second = 1;
    int nxt = 0;
    for(int i = 0; i <=10 ; i++)
    {
        nxt = first + second;
        first = second;
        second =nxt;
        System.out.println(nxt + " ");
    }
}
}
