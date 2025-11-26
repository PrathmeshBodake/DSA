public class Selection_sort {
    
    public static void sort(int arr[]){


        for(int i = 0; i<arr.length-1; i++){
            int index = i;
            for(int j = i+1; j < arr.length; j++){

                if(arr[j]<arr[index]){ //if we changed < to > then it gives decresing sorting
                    index = j;
                }
                
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;

        }

    }
    public static void display(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){

        int arr[] = {5,2,4,6,3};
        sort(arr);
        
        display(arr);
    }
    
}

// time complexity O(n^2)
