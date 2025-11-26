import java.util.*;

public class ternary {
    public static void main(String args[]){


        Scanner sc = new Scanner(System.in);
        int i =0;
        System.out.println("it check only 10 values are even or odd ");
        while(i<10){
            System.out.print("write "+ ++i +" val : ");
            // int a = 20;
            int b = sc.nextInt();

            String types = (b%2==0) ?"even" : "odd" ;

            System.out.println("the val is "+types);
             
        }
    }
}
