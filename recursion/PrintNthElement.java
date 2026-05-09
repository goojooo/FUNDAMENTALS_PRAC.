public class PrintNthElement {
 public static int num(int n){
   
    if(n == 10)
    {
        return n;
    }else{
        System.out.print(n+" -> ");
        n++;
        return num( n);
    }
}
    public static void main(String[] args) {
        int n = 1;
        
        System.out.print(num(n)  );

    }
}
