public class SolidRombus {

    public static void Rombus(int n){
        for(int i = n; i>=1;i--){
            for(int j = 0; j<i;j++){
                System.out.print(" ");
            }
            for(int k = 0;k<n;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void HollowRombus(int n){
        for(int i = n; i>=1;i--){
            for(int j = 0; j<i;j++){
                System.out.print(" ");
            }
            for(int k = 0;k<n;k++){
                if(k==0||k==n-1||i==n||i==1){
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
        Rombus(5);
        HollowRombus(5);
    }
}
