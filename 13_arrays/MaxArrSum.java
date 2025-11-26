public class MaxArrSum {
    public static void sum(int arr[]){
        int arrSum[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j = 0;j<=i;j++){
                sum = sum + arr[j];
            }
            arrSum[i] = sum;
        }
        for(int i = 0;i<arrSum.length;i++){
            System.out.println(i+" : "+arrSum[i]);
        }
    }
    public static void main(String args[]){

        int arr[] = {-1,-2,2,4,6,7,-6,-4};
        sum(arr);
    }
}
