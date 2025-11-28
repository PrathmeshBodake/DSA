import java.util.*;

public class IsItPowOf2 {
    
    public static boolean power(int n){
        return (n&(n-1))==0;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = sc.nextInt();
        System.out.println(power(x));
    }
}
