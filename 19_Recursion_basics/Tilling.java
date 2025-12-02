public class Tilling {
    
    public static int tilling(int n ){ // 2 * n
        if(n == 0 || n == 1){
            return 1;
        }
        int verticalTiles = tilling(n - 1);
        int horiTiles = tilling(n - 2);
        int total = verticalTiles + horiTiles;
        return total;

    }
    public static void main(String args[]){
        System.out.println(tilling(5));
    }
}
