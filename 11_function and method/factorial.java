import java.util.*;

public class factorial {

    public static void fact(int n){
        int temp = n;
        if(temp == 0){
            System.out.println("The factorial of "+n+" is : "+1);
        }
        else{ 
            for(int i = 1; i<n; i++){
        
                temp = temp*i;
            }
            System.out.println("The factorial of "+n+" is : "+temp);
        }
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        fact(n);
    }
}
