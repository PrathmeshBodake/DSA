import java.util.*;



public class LargestNumber {

    public static void array(int arr[],int n){
        Scanner sc = new Scanner(System.in);
            
        System.out.print("Enter "+n+" elements : ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
    }
    public static int large(int arr[]){ //O(n)
        int large = Integer.MIN_VALUE; //-infinity ....Integer.MAX_VALUE = infinity
        int small = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){
            
            if(arr[i]>large){
                large = arr[i];
            }  
            else if(arr[i]<small){
                small = arr[i];
            }         
        }
        System.out.println("The smallest element : "+small);
        return large;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        array(arr,n);

        System.out.println();
        int large = large(arr);
        System.out.println("The largest element : "+large);
    }
}
