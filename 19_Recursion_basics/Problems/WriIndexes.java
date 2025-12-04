
public class WriIndexes {
    public static void indexes(int arr[] , int key , int i){
        if(i == arr.length){
            return;
        }
        else if(key== arr[i]){
            System.out.print(i+" ");
        }
        indexes(arr, key, i+1);

    }
    public static void main(String args[]){
        int arr[] = {1,3,4,5,6,1,32,3,1,4,1};

        indexes(arr, 1, 0);
    }
}
