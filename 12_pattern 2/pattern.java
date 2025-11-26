public class pattern{

    public static void HollowRect(int n){

        for(int i = 0;i<n;i++){
            for(int j = 0; j<n;j++){
                if(i==0 || j==0 || j==(n-1) || i==(n-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void RoteHalfPyramid(int n){
        for(int i = n ; i>0;i--){
            for(int j = 0;j<n;j++){
                if(j>=i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        HollowRect(5);
        RoteHalfPyramid(5);

    }
}