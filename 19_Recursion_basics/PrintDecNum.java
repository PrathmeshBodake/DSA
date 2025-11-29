import java.util.*;

public class PrintDecNum{
    
    public static void dec(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        dec(n-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        dec(n);
    }
}
