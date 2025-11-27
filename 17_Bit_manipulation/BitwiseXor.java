import java.util.Scanner;

public class BitwiseXor {
   
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number a : ");
        int a = sc.nextInt();

        System.out.print("Enter a number b : ");
        int b = sc.nextInt();

        int result = a ^ b;
        System.out.println("a ^ b = "+ result);

    }

}

