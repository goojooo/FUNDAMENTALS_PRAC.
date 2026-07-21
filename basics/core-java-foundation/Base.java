import java.util.Scanner;

public class Base {
public int cal(int x , int y){
    // int x , y;
    // System.out.println(x + y);
    return x + y;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Base bs = new Base();
       System.out.println(bs.cal(sc.nextInt(),sc.nextInt()));
    }
}