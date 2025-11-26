import java.util.*;

public class prime {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n;
        int dum = 0;
        int i = 0;
        while(i<10){
            i++;

            n = sc.nextInt();

            dum = 0;

            for(int j = 1; j < n ; j++){
                if(n%j == 0){
                    dum++;
                }
                if(dum > 2){
                    System.out.println("this is not prime no...");
                    break;
                }
            }
        }
        if(dum == 2){
            System.out.println("it is prime no ...");
        }
    }
}
