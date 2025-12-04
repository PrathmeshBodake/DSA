import java.util.*;

public class NumToStr {
    static String digit[] = {"zero " , "one " ,"two ", "three " , "four " , "five " ,"six " ,"seven ", "eight ","nine "};
    public static void num_to_str(int n){
        if(n==0){
            return;
        }
        int temp = n%10;
        num_to_str(n/10);
        System.out.print(digit[temp]);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to write in String : ");
        int n = sc.nextInt();
        num_to_str(n);
    }
}
