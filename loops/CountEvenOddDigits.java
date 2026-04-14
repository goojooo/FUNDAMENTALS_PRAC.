public class CountEvenOddDigits {

    // Count Even and Odd Digits
    // Input: 123456
    // Output: Even digits = 3, Odd digits = 3
    public static void countEvenOddDigit() {
        int input = 123456;
        int even = 0 , odd = 0 ;
        int cnt = 0;
        while(input > 0 )
        {
            cnt = input % 10;
            if(cnt % 2 == 0 )
            {
                even++;
            } else{
                odd++;
            }

            input = input / 10;
        }
        System.out.println("Count of even digit : " + even);
        System.out.println("Count of odd digit : " + odd);
    }

    public static void main(String[] args) {
       countEvenOddDigit();
    }
}
