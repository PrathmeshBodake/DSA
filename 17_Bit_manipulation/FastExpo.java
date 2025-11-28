import java.util.*;
public class FastExpo{
    
    public static void fastExpo(int x , int i){

        int ans = 1;
        int copy1 = x;
        int copy2 = i;
        while(i>0){
            if((i & 1) == 1 ){
                ans = ans * x;
            }
            x = x*x;
            i = i >> 1;
        }
        System.out.println(copy1+" ** "+copy2+" = "+ans);
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a val : ");
        int a = sc.nextInt();
        System.out.print("Enter a exponential val : ");
        int b = sc.nextInt();
        fastExpo(a, b);

    }
}
