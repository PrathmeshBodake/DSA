public class forLoop {
    public static void main(String args[]){

        // for(int i = 0; i<4;i++){
        //     for(int j = 0;j<4;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        int i = 0 , j=0;
        while(i<4){
            while(j<4){
                System.out.print("* ");
                j++;
                
            }
            System.out.println();
            i++;
            j = 0;
        }

    }
}
/*
 for(intialise;condition;update){}
 */