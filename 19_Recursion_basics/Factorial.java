import java.util.*;

public class Factorial{
    public static int fact(int n){

        if(n==0){
            return 1;
        }
        return n * fact(n-1);
        // 5*4*3*2*1*fact(0)   fact(0)==1

    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number that's factorial you want : ")
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
}
