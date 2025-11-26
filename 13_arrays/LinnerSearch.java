public class LinnerSearch {
    public static int Search(int arr[],int key){//time complexity = O(n)
        for(int i =0; i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("Element found at index : "+i);
                return 0;
            }
        }
        System.out.println("Element is not found ");
        return 0;
    }
    public static void main(String args[]){
        int arr[] = {11,34,22,10,2,3,13,83,56};
        int key = 10;
        Search(arr,5);
        Search(arr,key);
    }
}
