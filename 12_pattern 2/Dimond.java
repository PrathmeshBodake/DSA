public class Dimond {
    public static void dimonds(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0 ; j<i;j++){
                System.out.print("* ");
            } 
            System.out.println();
            
        }
        for(int i = n-1;i>=0;i--){
            for(int j = 0 ; j<=i;j++){
                System.out.print("* ");
            } 
            System.out.println();

        }


    }
    public static void d(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<(n-i);j++){
                System.out.print(" ");
            }
            for(int k = 0 ; k<2*i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n-2;i>=0;i--){
            for(int j = 0;j<(n-i);j++){
                System.out.print(" ");
            }
            for(int k = 0 ; k<2*i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){

        dimonds(5);
        d(5);
    }
}
