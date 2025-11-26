public class BinaryToDeci {
    public static void bToD(int n){
        int copy = n;
        int dec= 0;
        int last;
        int powe = 0;
        while(n>0){
            last = n%2;
            dec = dec + (last * (int)Math.pow(2,powe)); //math.pow returns double val ...we add type cast
            n = n/10;
            powe++;
        }
        System.out.println("The "+copy+" in decimal = "+dec);
    }
    public static void dTob(int n){
        int bin = 0;
        int pow =0;
        int copy = n;
        int rem;
        while(n>0){
            rem = n%2;
            bin = bin + (rem*(int)Math.pow(10,pow));
            n/=2;
            pow++;

        }
        System.out.println("The "+copy+" in binary = "+bin);
    }
    public static void main(String args[]){
        bToD(1110);
        bToD(1010);
        bToD(1100);
        bToD(110);
        dTob(5);
        dTob(6);
        dTob(15);
       
    }
}
