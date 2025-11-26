public class product {
    
    public static int product(int a, int b){
        int product = a*b;
        return product;
    }
    public static void main(String args[]){
        int product = product(20,34);//if we use void then void is not able to convert into int..
        System.out.println("the product is : "+product);

    }
}
