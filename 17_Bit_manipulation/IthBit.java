import java.util.Scanner;


public class IthBit {
    
    public static int ith_bit(int x , int i){
        int bitMask = 1 << i;
        if((x & bitMask)==0){
            return 0;
        }else{
            return 1;
        }
    }
    public static int set_ith(int x , int i){
        return (x | (1 << i));
    }
    public static int clear_ith(int x , int i){
        int bitMash = 1 << i;
        bitMash = ~(bitMash);
        return (x & bitMash);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = sc.nextInt();
        System.out.print("Enter a Bit number that you want: ");
        int i = sc.nextInt();

        System.out.println(ith_bit(x ,i));
        System.out.println(set_ith(x ,i));
        System.out.println(clear_ith(x ,i));

    }
}
