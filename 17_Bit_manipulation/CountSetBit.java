import java.util.*;

public class CountSetBit {
    public static int count(int x){
        int all_bits =32;
        int count=0;
        while(x > 0){
            if((1 & x)==1){
                count ++;
               
            }
            x = x >> 1;
        }
        return count;
        //              |
        // ex 10     1010   count = 0
        //           0101   count = 1
        //           0010   count = 1
        //           0001   count = 2   
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a =  sc.nextInt();
        System.out.println(count(a));
    }
}
