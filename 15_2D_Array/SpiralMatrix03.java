// // which is used by google microsoft
// // print structure = -->--|
// //                   |--> |
// //                   -<---|
// public class SpiralMatrix03 {
//     public static void spiral(int mat[][]){
//         int start_row = 0;
//         int start_col = 0;

//         int end_row = mat.length - 1;
//         int end_col = mat[0].length - 1;

//         while(start_row <= end_row && start_col <= end_col){
//             // top
//             for(int j = start_col ; j<=end_col ; j++){
//                 System.out.print(mat[start_row][j]+" ");
//             }
//             for(int i = start_row+1; i<=end_row; i++){
//                 System.out.print(mat[i][end_col]+" ");
//             }
//             for(int k = end_col-1; k>=start_col; k--){
//                 System.out.print(mat[end_row][k]+" ");
//             }
//             for(int l = end_row-1; l>=start_row+1;l++){
//                 System.out.print(mat[l][start_col]+" ");

//             }
//             start_col++;
//             start_row++;
//             end_col--;
//             end_row--;
//         }
        
//     }

//     public static void main(String args[]){
//         int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};

//         spiral(mat);

//     }
// }

public class SpiralMatrix03 {
    public static void spiral(int mat[][]){
        int start_row = 0;
        int start_col = 0;
        int end_row = mat.length - 1;
        int end_col = mat[0].length - 1;

        while (start_row <= end_row && start_col <= end_col) {

            // Top row
            for (int j = start_col; j <= end_col; j++) {
                System.out.print(mat[start_row][j] + " ");
            }

            // Right column
            for (int i = start_row + 1; i <= end_row; i++) {
                System.out.print(mat[i][end_col] + " ");
            }

            // Bottom row (check needed)
            if (start_row < end_row) {
                for (int j = end_col - 1; j >= start_col; j--) {
                    System.out.print(mat[end_row][j] + " ");
                }
            }

            // Left column (check needed)
            if (start_col < end_col) {
                for (int i = end_row - 1; i > start_row; i--) {
                    System.out.print(mat[i][start_col] + " ");
                }
            }

            start_row++;
            end_row--;
            start_col++;
            end_col--;
        }
    }

    public static void main(String args[]) {
        int mat[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        spiral(mat);
    }
}
