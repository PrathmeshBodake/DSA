public class p {

    public static void main(String args[]){
        for(int i = 0; i<5 ; i++){
            for(int j = 0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 5; i>0 ; i--){
            for(int j = i; j>0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }


        for(int i = 0; i<5 ; i++){
            for(int j = 0; j<i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();


        int a = 97;
        for(int i = 0; i<5 ; i++){
            for(int j = 0; j<i; j++){
                System.out.print((char)(a ));
                System.out.print(" ");
                a++;
            }
            System.out.println();
        }
        System.out.println();
    

    for(int i = 97; i< 102 ; i++){
        for(int j = 97; j<i; j++){
            System.out.print((char)(j));
            System.out.print(" ");
        }
        System.out.println();
    }
    System.out.println();
}
}