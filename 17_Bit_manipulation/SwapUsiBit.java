import java.util.*;

public class SwapUsiBit {

    public static void swap(int a , int b){
        // 5    3
        System.out.println("Values before swap a : "+a+" , b : "+b);

        a = a ^ b; // 101 ^ 011 = 110
        b = a ^ b;  // 110 ^ 011 = 101
        a = a ^ b;  // 110 ^ 101 = 011

        System.out.println("Values after swap a : "+a+" , b : "+b);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a and b at below :");
        int a = sc.nextInt();
        int b = sc.nextInt();

        swap(a, b);
    }
}
