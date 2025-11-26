import java.util.*;

public class FuctionOverloading {
    public static void multi(int a , int b){
        
        System.out.println("the multiplication is : "+a*b);
    }
    public static void multi(double a , double b){
        
        System.out.println("the multiplication is : "+a*b);
    }
    public static void multi(float a , float b){
        
        System.out.println("the multiplication is : "+a*b);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //int a = sc.nextInt();//float double
        //int b = sc.nextInt();//float double

        multi(4,5);
        multi(4,5.4);
        multi(4.8,5.4);
        multi(4.85676789,5.4);


    }
}
/*
 multiple function with same name but diff parameters
 */
