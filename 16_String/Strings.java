import java.util.*;
public class Strings {
    public static void pri_string(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String args[]){

        char arr[] = {'a','b','c','d'};
        String str1 = "abcd";
        String str2 = new String("abcd");

        // Strings are immutable
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence with space");

        //String name = sc.next();
        //System.out.println(name); //in this line if we write a line using a space hen only
                                // first word write and remaining words take input as a next method

        System.out.println("Enter a sentence with space");
        String name2 = sc.nextLine();
        System.out.println(name2);
        // in case of array length is a property but in String it is inbuilt function
        System.out.println(name2.length());

        // concatination
        String str3 = str1 + " " + str2;
        System.out.println(str3);

        System.out.println("str3's char at index 5: "+str3.charAt(5));

        pri_string(str3);
    }

      
}
