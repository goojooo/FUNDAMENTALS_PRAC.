package loops;

public class PrimeCheck {
    public static void main(String[] args) {
        int n = 5;
        boolean isPrime = false;

        if(n==1)
        {
            isPrime = true;
        
        }
        for(int i = 2 ; i<=n ; i*=i)
        {
            if(n % 2 == 0)
            {
                isPrime = true;
            } else{
                isPrime=false;
            }
        }
        if(!isPrime)
            System.out.println("Prime");
         else
            System.out.println("Not Prime");
        
    }
}
