public class Static_1 {
    public static void main(String args[]){

        School s1 = new School();
        s1.set_clg("PBP");

        School s2 = new School(); //clg val is automatic assign to s2 obj
        System.out.println(s2.get_clg()); 

        s2.set_clg("KMH");
        System.out.println(s2.get_clg());
        
        School s3 = new School();
        System.out.println(s3.get_clg()); 

        // memory assign in system... every obj's name,roll has a unique memory,
        // but static is common memory ....and assigned only once
        
        // if we declared as a static then system creates only one copy for all...
        // doesn't create more than 1 copy.
        // our main function is static

        // it momery efficient ... in system it create only once
    }
}

class School{
    int roll;
    String name;

    static String clg;

    void set_clg(String clg){
        this.clg = clg;
    }
    String get_clg(){
        return this.clg;
    }
    // satic function
    static int percentage(int chem , int phy , int maths){
        return (chem + phy + maths)/3;
    }
}

// if we have set to all obj same val then we use static
// static = var,function,block,nested class 