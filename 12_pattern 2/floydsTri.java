public class floydsTri {
    public static void triangle(int n){
        int k = 0;
        for(int i = 0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(++k+" ");
            }
            System.out.println();
        }
    }
    public static void triangle_0_1(int n){
        
        for(int i = 0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((i+j)%2+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]){
        triangle(5);
        triangle_0_1(5);
    }
}
