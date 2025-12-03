import java.util.*;

public class FriPair {
    public static int pair(int n){
        if(n==1){
            return 1;
        }else if(n == 2){
            return 2;
        }

        int single = pair(n-1);

        int inpair = pair(n-2);
        int inpair_2 = (n-1)*inpair;

        int total = single + inpair_2; 
        return total;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of friends : ");
        int n = sc.nextInt();

       System.out.println( pair(n));
        
    }
}
