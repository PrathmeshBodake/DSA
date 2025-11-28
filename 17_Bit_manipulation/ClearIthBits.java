import java.util.*;

public class ClearIthBits{
    public static void clear_ith_bits(int x , int i){
        int bitMash = (-1) << i;
        System.out.println("clear"+i+" bits from right side "+ (x & bitMash));
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = sc.nextInt();
        System.out.println("Enter a how many bits : ");
        int b = sc.nextInt();

        clear_ith_bits(a , b);

    }
}
