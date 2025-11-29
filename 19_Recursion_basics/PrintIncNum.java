import java.util.*;

public class PrintIncNum{

    // public static void inc(int x ,int n){
        
    //     if(x == n){
    //         System.out.print(n);
    //         return;
    //     }
    //     System.out.print(x+" ");
    //     inc(x+1 , n);
    // }
    public static void inc(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        inc(n-1);
        System.out.print(n+" ");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        // inc(1,n);
        inc(n);

    }    
}
