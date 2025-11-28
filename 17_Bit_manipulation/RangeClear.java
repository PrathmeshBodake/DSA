import java.util.*;

public class RangeClear {
    public static int range_clear(int x , int i , int j){
        int a = ((~0)<<(j+1));
        int b = (1 << i)-1 ;
        int bitMash = a|b;
        return x & bitMash;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int i = sc.nextInt();
        int j = sc.nextInt();

       System.out.println( range_clear(x,i,j));
    }
}
