package loops;

public class CountDigit {
    public static void countDigit()
    {
        int n = 345;
        int cnt = 0; 
        // for(int i = 1 ; i < n ; i++)
        // {
        //     n = n / 10;
        //     cnt++;
        // }
        while(n > 0)
        {
            n = n / 10;
            cnt++;
        }
        System.out.println(cnt);
       
    }
    public static void main(String[] args) {
        countDigit();
    }
}
