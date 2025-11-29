public class ConvertUppToLow {

    public static void character(){

        System.out.println("Val of a : "+(int)('a') + "\tval of A : "+(int)('A')+ "\tval of | : "+(int)('|'));

        for(char ch = 'A' ; ch <= 'Z'; ch++ ){


            System.out.print((int)(ch|' ')+ " ");
            System.out.println((char)(ch|' ')+ " ");

            
        }
    }
    public static void main(String args[]){
        character();
    }
}
