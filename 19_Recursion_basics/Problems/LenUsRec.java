
public class LenUsRec {
    // public static void length(String str , int i){
    //     if(i == str.length()){
    //         System.out.println("Length of string is : "+i);
    //         return;
    //     }
    //     length(str, i+1);
    // }
    public static int length(String str ){
        if(str.length()==0){
            return 0;
        }
        return length(str.substring(1)) + 1;
    }
    public static void main(String args[]){
        String str = "Prathmesh bodake";
    
        System.out.println("Length of string is : "+length(str));
    }
}
