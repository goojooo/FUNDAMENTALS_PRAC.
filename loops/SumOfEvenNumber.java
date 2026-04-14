public class SumOfEvenNumber {
    public static void sumOfEvenNumber()
    {
        int sum = 0 ;
        for(int i = 0 ; i <= 20 ; i+= 2)
        {
            sum += i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        sumOfEvenNumber();
    }
}
