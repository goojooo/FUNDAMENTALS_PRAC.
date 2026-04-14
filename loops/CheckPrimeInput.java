import java.util.Scanner;

public class CheckPrimeInput {
    public static void checkPrime(int n)
    {
       boolean isPrime = true;
       if(n == 1)
       {
        isPrime = false;
       }

       for(int i = 2 ; i < n ; i++)
       {
        if(n % i == 0)
        {
            isPrime = false;
            break;
        }
       }
       if(isPrime)
       {
        System.out.println("Prime");
       } else{
        System.out.println("Not Prime");
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        checkPrime(n);
    }
}
