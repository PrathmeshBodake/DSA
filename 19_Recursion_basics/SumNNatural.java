import java.util.*;

public class SumNNatural {

    public static int sum(int n){

        if(n==1){
            return 1;
        }
        int total = sum(n-1);
        int sumofall = total+n;
        return sumofall;
        
    
    }
    public static void main(String args[]){
       System.out.println( sum(5));
    }
}
