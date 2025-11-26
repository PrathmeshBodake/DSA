
public class Insertion_sort {
    public static void insertion(int arr[]){
        for(int i = 1; i<arr.length; i++){
            int cur = arr[i];
            int pre = i-1;

            // finding correct pos to insert
            while(pre>=0 && arr[pre]>cur){
                arr[pre + 1] = arr[pre];
                pre--;
            }
            // inserting 
            arr[pre + 1] = cur;
        }
    }
    public static void display(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){

        int arr[] = {5,2,4,6,3};
        insertion(arr);
        
        display(arr);
    }
    
}

// time complexity O(n^2)
