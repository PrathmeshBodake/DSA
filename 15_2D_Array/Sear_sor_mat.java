public class Sear_sor_mat {

    public static int brute_force(int matrix[][] , int key){
        // traditional approch  O(n^2)
        for(int i = 0; i<matrix.length; i++){
            for(int j =0; j<matrix[i].length; j++){

                if(key == matrix[i][j]){
                    System.out.println("elemrnt found at : "+i +","+ j);
                   return 0;
                    // it has not good complexity in case of sorted 2d-array
                }
            }
        }
        System.out.println("Element not found");
        return 0;
    }

    // public static void row_bin(int matrix[][] , int key){
    //     // time complexity O(nlogn)
    //     // binary search = O(logn) but in this case n row then O(nlogn)
    //     int row = 0;
    //     int col = matrix[0].length;
        
    //     while(row<= col){
    //         int start = row;
    //         int end = col;
    //     }
        
        
    // }
    public static boolean staircase_search(int matrix[][] ,int key){
  // n X m  matrix in this two case(position) is very imp 1.(n-1 ,0 ) , 2.(0 , m-1)
        // this are starting point for search
        // time complexity of this = O(m+n)
        int row =  0, col = matrix[0].length-1;

        while(row < matrix.length && col >=0){
            if(key == matrix[row][col]){
                System.out.println("Key Found at : ("+row+","+col+")");
                return true;
            }
            else if(key > matrix[row][col]){
                row++;
            }
            else{
                col--;
            }

        }
        System.out.println("Element is not found");
        return false;
    }
    
    public static void main(String args[]){

        int matrix[][] = {{1,12,30},{4,15,60},{7,18,90}} ;
        brute_force(matrix, 34);

        staircase_search(matrix,90);    
    }
}
