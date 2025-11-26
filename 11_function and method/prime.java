public class prime{

    public static void checkPri(int n){
        int j = 0;
        if(n==2){
            System.out.println("the "+n+" is prime");
            return;
        }
        for(int i = 2; i<n ; i++){
            
             if(n%i==0){
                System.out.println("the "+n+" is not prime");
                break;
            }
            else{
               j++;
            }
        }
        if(j>0){
            System.out.println("the "+n+" is prime");
        }
    }
    public static void main(String args[]){
        checkPri(5);
        checkPri(4);
        checkPri(13);
        checkPri(2);
    } 
}









/*
public class Prime {
    public static void checkPrime(int n) {
        if (n < 2) {
            System.out.println("The number " + n + " is not prime");
            return;
        }

        if (n == 2) { // 2 is the only even prime number
            System.out.println("The number " + n + " is prime");
            return;
        }

        if (n % 2 == 0) { // Any other even number is not prime
            System.out.println("The number " + n + " is not prime");
            return;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) { // Check only odd numbers up to sqrt(n)
            if (n % i == 0) {
                System.out.println("The number " + n + " is not prime");
                return;
            }
        }

        System.out.println("The number " + n + " is prime");
    }

    public static void main(String[] args) {
        System.out.println("Welcome");
        checkPrime(5); // Test with 5
    }
}
 */