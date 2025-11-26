public class primeRange {

    public static boolean checkPrime(int n){
        boolean isPrime = true;
        if(n==2){
            // System.out.println("\nthe "+n+" is prime");
            return true; //or isPrime
        }
        else{
            for(int i = 2; i<=Math.sqrt(n) ; i++){
            
                if(n%i==0){
                //    System.out.println("\nthe "+n+" is not prime");
                    isPrime=false;
                    return isPrime;
               }
        }
        return true;
    }
}


    public static void Range(int n){
        int arr[];
        for(int i = 2 ; i<=n ; i++){
            if(checkPrime(i)){
                System.out.print(i+" ");
            }
            }


        }

    
    public static void main(String args[]){
        Range(50);

    }

}