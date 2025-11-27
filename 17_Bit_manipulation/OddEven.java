import java.util.Scanner;

public class OddEven {
    public static void odd_even(int x){
        int bitMask = 1;
        if((x & bitMask)==0){
            System.out.println("The value "+x+" is even");
        }else{
            System.out.println("The value "+x+" is odd");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = sc.nextInt();

        odd_even(x);

    }
}
