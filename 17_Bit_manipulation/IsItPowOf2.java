import java.util.*;

public class IsItPowOf2 {
    
    public static boolean power(int n){
        return (n&(n-1))==0;
        // ex 15        16 
        // 1111         10000
        // 1110         01111
        // 1110         00000
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = sc.nextInt();
        System.out.println(power(x));
    }
}
