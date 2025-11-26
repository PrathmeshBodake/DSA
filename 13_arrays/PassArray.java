public class PassArray {
    // arrays passed by default as a reference
    //pass by value = change is not reflect in main function
    //pass by reference = change is reflect in main function
    public static void update(int arr[],int non_change){
        
        non_change = 50;
        
        for(int i = 0; i<arr.length; i++){
            arr[i]+=10;
        }
    }
    public static void main(String args[]){
        int non_change = 10;
        int marks[]={1,2,3};
        System.out.println("Array before update : ");
        for(int i = 0; i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        System.out.println("val of non-change : "+non_change);
        System.out.println();

        update(marks,non_change);
        
        System.out.println("Array after update : ");
        for(int i = 0; i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }System.out.println();
        System.out.println("val of non-change : "+non_change);
    }
}
