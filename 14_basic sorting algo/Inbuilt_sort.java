import java.util.Arrays; // it is important to import inbuilt sort
import java.util.Collections;


public class Inbuilt_sort {
    public static void display(int arr[]){
    for(int i = 0; i<arr.length; i++){
        System.out.print(arr[i]+" ");

    }
    System.out.println();
    
}
    public static void display(Integer arr[]){
    for(int i = 0; i<arr.length; i++){
        System.out.print(arr[i]+" ");

    }
    System.out.println();
    
}
    public static void main(String args[]){
        int arr[] = {3,5,1,9,7,6};

        Arrays.sort(arr);

        display(arr);

        int brr[] = {3,5,1,2,7,8};
        Arrays.sort(brr,1,4); // starting index , ending index....ending index==not exclusive

        display(brr);

        // decresing order
        // import java.util.collections;
        Integer crr[] = {3,4,2,8,1}; //this treat like a obj of arr whose data type int
        // if we give arr not working because it works on only non-premitive data type
        Arrays.sort(crr,Collections.reverseOrder());
        
        // Arrays.sort(crr, si , ei ,Collections.reverseOrder());

        display(crr); // it calls (Integer crr[])

    }
}

// time complexity O(n*logn)   .....n logn < n^2
