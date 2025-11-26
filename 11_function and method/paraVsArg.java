public class paraVsArg {

    public static int addret(int a , int b){//parameter or formal parameter
        int sum = a + b;
        return sum;

    }
    public static void main(String args[]){
        int sum = addret(10,20);//argument or actual parameter
        System.out.println("sum by return type : "+sum);
    }
}
