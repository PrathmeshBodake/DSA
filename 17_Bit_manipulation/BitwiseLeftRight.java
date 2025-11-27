import java.util.Scanner;

public class BitwiseLeftRight {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a value : ");
        int a = sc.nextInt();

        System.out.print("Enter value for Left and RIght shift : ");
        int b = sc.nextInt();

        int leftShift = a << b;
        int rightShift = a >> b;
        // float double not allowed in shift 

        System.out.println("Left shift :"+ leftShift);
        System.out.println("Right shift :"+ rightShift);
    }
}
