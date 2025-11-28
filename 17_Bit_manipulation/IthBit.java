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
    public static int update(int x , int i , int set_ith ,int clear_ith ){
        int bitMask = 1 << i;
        if((x & bitMask)==0){
            return set_ith(x , i);
        }else{
            return clear_ith(x , i);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = sc.nextInt();
        System.out.print("Enter a Bit number that you want: ");
        int i = sc.nextInt();

        System.out.println("It is ith bit : "+ith_bit(x ,i));
        System.out.println("It is set ith bit : "+set_ith(x ,i));
        System.out.println("It is clear ith bit : "+clear_ith(x ,i));


        System.out.println("It is update ith bit : "+update(x ,i , set_ith(x, i) , clear_ith(x, i)));



    }
}
