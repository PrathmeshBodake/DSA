public class ifElse{

    public static void main(String args[]){
        int a = 10;
        int b = 12;
        int c = 14;

        // if(a>b){

        //     if(a>c){
        //         System.out.println(" a is the biggest "+a);
        //     }

        //     else{
        //         System.out.println(" c is biggest "+c);
        //     }
        // }
        // else{
        //     if(b>c){
        //         System.out.println(" b is the biggest "+b);

        //     }
        //     else{
        //         System.out.println(" c is the biggest "+c);
        //     }
        // }

        if(a>b && a>c){
            System.out.println(" a is the largest");
        }

        else if(b>c){
            System.out.println("b is the largest");

        }
        else{
            System.out.println(" c is the largest");
        }


    }
}
/*
 if,else
 else if
 ternary 
 switch
 */