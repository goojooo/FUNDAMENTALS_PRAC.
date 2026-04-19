package loops;

public class StrongNumber {
    public static void main(String[] args) {
     int a = 145;
     int original = a ;
     int b = 0;
     int fact = 0;
     int c = 0;
     while(a > 0)   
     {
        b = a % 10;
        for(int i = b ; i >0; i--)
        {
            fact = b * i-1;
            c += fact;
        }
        a = a / 10;
     }

     System.out.println(c);
    }
}
