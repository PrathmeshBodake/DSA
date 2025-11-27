import java.util.Scanner;

public class BitwiseNot {
   
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number a : ");
        int a = sc.nextInt();

        int result = ~a;
        System.out.println("~a = "+ result);

    }

}
