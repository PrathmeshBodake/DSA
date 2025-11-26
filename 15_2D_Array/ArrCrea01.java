import java.util.*;

public class ArrCrea01 {

    public static void search(int mat[][] , int n){
        for(int i = 0 ; i<3; i++){
            for(int j = 0; j<3; j++){
                if(mat[i][j] == n){
                    System.out.println(n+" is found at : ("+i+","+j")");
                }
            }
            
        }

    }
    public static void main(String args[]){
        int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
//             1 2 3 
//             4 5 6
//             7 8 9
        for(int i = 0 ; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        int matrix[][] = new int[3][3]; // it a array declaration
        // (row x column)
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.print("Enter val for matrix["+i+"]["+j+"]");
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();  
        }
        for(int i = 0 ; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        search(matrix, 10);
    }    
}
