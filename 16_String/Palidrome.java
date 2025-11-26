import java.util.*;

public class Palidrome {
    public static boolean pali(String str){
        // String dummy;
        int n= str.length();
        for(int i =0; i<=n/2; i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                System.out.println("this is not a palidrome");
                return false;
            }       
           
        }
        System.out.println("this is a palidrome");
        return true;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");

        String str = sc.nextLine();

        pali(str);

    }
}
