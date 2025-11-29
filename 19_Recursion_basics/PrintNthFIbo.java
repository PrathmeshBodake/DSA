import java.util.*;
// time complexity O(n^2)
public class PrintNthFIbo{
    
    public static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        

        int fibo_n_1 = fibo(n-1);
        int fibo_n_2 = fibo(n-2);

        int fibo_n = fibo_n_1 + fibo_n_2;
        return fibo_n;
    }
    public static void main(String args[]){
 
        System.out.println(fibo(25));
    }
}
