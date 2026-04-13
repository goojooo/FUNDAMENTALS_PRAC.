package loops;

// Print Even Numbers from 1 to 20

public class EvenNumber {
   public static void evenNumber(){
        for(int i = 2 ; i <= 20 ; i+=2)
        {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        evenNumber();
    }
}
