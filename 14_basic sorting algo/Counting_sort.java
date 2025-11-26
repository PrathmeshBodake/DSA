// it is basically used for small number or range is very small ,it is used for better time complexity
// it represent in some cases O(n logn) and in other some cases O(n) 

// it also frequency(repetation of number)

// in this code we gives only positive inputs

public class Counting_sort {
    
    public static void couting(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        
        int count[] = new int[largest+1];  // largest will gives who is the big no in it
                                            // but we give largest + 1, +1 is for zero
                                            // we make count table from 0 , 1,2 ....largest
                    // incomplete.
    }
    public static void main(String args[]){

    }
}
