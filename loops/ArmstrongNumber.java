package loops;

public class ArmstrongNumber {
    public static void main(String[] args) {
       int n = 153;
       int original = n ;
       int m = 0;
       int o = 0;
       int p = 0 ;

       while(n > 0)
       {
        m = n % 10;
        o = m * m * m;
        p += o;
        n = n / 10;
       }
       if(p == original)
        System.out.println(original + " is a Armstrong number...");
       else
        System.out.println(original + " is a Not armstrong number...");

    }
}
