import java.sql.Time;

public class XToPowN {
    public static int power(int x , int  n){
        // Time Complexity = O(n)
        if(n==1){
            
            return x;
        }        
        return x* power(x , n-1);
        /*
        pow(x,4)
        x*pow(x ,3)
        x*x*pow(x ,2)
        x*x*xxpow(x ,1)
        x*x*x*x
        */
       
    }
    public static int power_(int x , int n){
        // Time Complexity = O(logn)
        /*
        x^10 = x^5 * x^5
        */

        if(n == 0){
            return 1;
        }
        // int halfPowSq =  power_(x , n/2) * power_(x, n/2); if this type squre then complexity remaining same O(n)
        // to avoid this we use var square
        int halfPow = power(x, n/2);
        int halfPowSq = halfPow * halfPow; // o(logn) 

        if(n % 2 !=0){
            halfPowSq = x * halfPowSq;
        }
        return halfPowSq;
    }
    public static void main(String args[]){
        System.out.println(power(2,4));
        System.out.println(power_(2,4));
        System.out.println(power_(2,7));
    }
    
}
