public class IsArrSort {

    public static void is_sort(int arr[] , int i){
        if(i==arr.length-1){
            System.out.println("Array is sorted ");
            return;
        }
        if((arr[i] > arr[i+1] )){
            System.out.println("Array is not sorted ");
            return;
        }
        is_sort(arr, i+1);
    }
    public static void main(String args[]){

        int arr[]= {1,2,3,4,5};
        is_sort(arr, 0);
    }
}
