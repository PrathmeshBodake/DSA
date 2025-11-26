import java.util.*;

public class InputOutput {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];
        System.out.println("Size of array : "+arr.length);
        System.out.println("Enter elements of array : ");

        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        for(int i = 3;i<10;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Display : ");
        float per = 0;
        for(int i = 0;i<10;i++){
            System.out.print(arr[i]+" ");
            per+=arr[i];
        }
        System.out.println("\nThe per : "+per/10);

    }
}
