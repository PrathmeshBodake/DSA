public class OptimPrime {

    public static boolean checkPrime(int n){
        boolean isPrime = true;
        if(n==2){
            System.out.println("\nthe "+n+" is prime");
            return true; //or isPrime
        }
        else{
            for(int i = 2; i<=Math.sqrt(n) ; i++){
            
                if(n%i==0){
                   System.out.println("\nthe "+n+" is not prime");
                    isPrime=false;
                    return isPrime;
               }
        }
    }
        System.out.println("\nthe "+n+" is prime");
        return true;
    }
    public static void main(String args[]){

        System.out.println(checkPrime(2));
        System.out.println(checkPrime(12));
        System.out.println(checkPrime(5));
        

    }
}
