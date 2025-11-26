import java.util.*;

public class syntaxpara {


    public static void add(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 numbers : ");
        int a =sc.nextInt();
        int b =sc.nextInt();

        int sum = a + b;
        System.out.println("The sum is : "+sum);
    }
    public static void sub(int a , int b){
        int sub = a - b;
        System.out.println("The sub is : "+sub);

    }
    public static int addret(int a , int b){
        int sum = a + b;
        return sum;

    }

    public static void main(String args[]){
        add();

        sub(29,34);

        int sum = addret(10,20);
        System.out.println("sum by return type : "+sum);
        
    }
}
