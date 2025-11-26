import java.util.*;

public class reverse {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no : ");
        int n = sc.nextInt();
        int m = n;
        int dummy=0;
        int remain = 0;

        while(n != 0){
            remain = n%10;
            dummy = dummy*10+remain;
            n = n/10;

        }
        if(m == dummy){
            System.out.println("It is a palidrome");
            return;
        }
        System.out.println("the reverse no is : "+dummy);
    }
}
