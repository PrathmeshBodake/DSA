import java.util.*;

public class printN {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int i = 1;
        System.out.print("enter a number ...plz avoid negative no : ");
        int n = sc.nextInt();

        while(i <= n){
            System.out.println(i);
            i++;
        }
    }
}
