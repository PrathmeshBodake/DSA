public class OccurenceInArr {
    public static int last_occ_in_arr(int arr[] , int key , int n){
        
        if(n == arr.length){
            return-1;
        }
        int is_occ = last_occ_in_arr(arr, key, n+1);
        if(key == arr[n] && is_occ == -1){
            System.out.println("key found at : " + n);
            return n;
        }
        
        return is_occ; //-1 if not found
    }
    public static int first_occ_in_arr(int arr[], int key , int n){
        int m = arr.length-1;

        if(key == arr[n] ){
            
            System.out.println("First occ = "+n);
            return n;
        }
        else if(n==m){
            System.out.println("key is not found in array");
            return -1;
        }

        return first_occ_in_arr(arr, key , n+1);
    }
    public static void main(String args[]){
        int arr[] = {1,5,2,3,4,5,6,7,8,5,9,9};
        first_occ_in_arr(arr, 5, 0);
        last_occ_in_arr(arr, 5, 0);
    }
}
