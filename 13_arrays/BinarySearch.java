public class BinarySearch {
    public static int Binary(int arr[],int key){
        int start = 0;
        int end = arr.length - 1;
        int mid ;

        while(start <= end){
            mid = (start + end) / 2;
            if(key == arr[mid]){
                System.out.println(key+" element is find at index no : "+mid+"\n");
                return mid;
            }
            else if(key > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        System.out.println("Element is not found in array\n");
        return 0;
    }
    public static void main(String args[]){
        int arr[] = {2,3,5,7,8,9,10};
        Binary(arr, 0);
        Binary(arr, 10);
        Binary(arr, 4);

    }
}
