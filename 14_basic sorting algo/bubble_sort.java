
public class bubble_sort {

    public static void sort(int arr[]){
        // int i = 0;
        // int j = i+1;

        for(int i=0; i <arr.length; i++){
            for(int j=0; j<(arr.length-1-i); j++){

                int temp;
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                }
            }
        }
    }

    public static void main(String args[]){

        int arr[] = {11,7,4,5,2,10,22,21};
        sort(arr);

        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}

// time complexity = O(n^2); ....for all condition. best worst avg