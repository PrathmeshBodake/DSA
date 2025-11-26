public class Digonal_sum {
    // it solvable in case of M X N
    public static int digonal_sum(int matrix[][]) {
        int m = matrix.length; // row
        int n = matrix[0].length; // column
        int sum = 0;
        // primery digonal
//  time complexity == O(n^2)
        // for (int i = 0; i < m; i++) {
        //     for (int j = 0; j < n; j++) {
        //         if (i == j) {
        //             sum += matrix[i][j];
        //         }
        //         // secondary digonal
        //         // when length is even like 4,6,8 col,row
        //         else if ((i + j) == (m - 1)) {
        //             sum += matrix[i][j];
        //         }

        //     }
        // }
        for(int i = 0; i<m; i++){ //complexity O(n)
            // pd
            sum += matrix[i][i];
            // condition to skip i==j condition when in odd length matrix
            // sd
            if(i !=(m-1-i)){// i+j = m-1  ==> j = m-1-i
                sum += matrix[i][m-1-i];
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        int matrix[][] = { { 12, 23, 1 }, { 34, 45, 23 },{12,23,34} };
        int a = digonal_sum(matrix);
        System.out.println(a);

    }
}
