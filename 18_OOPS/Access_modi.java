public class Access_modi {
    public static void main(String args[]){

        Bank a1 = new Bank();
        a1.username = "Prathmesh";
        // a1.password = "jfkkdied";  it throws err
        a1.setPassword("hello");
    }
}

class Bank{
    public String username;
    private String password;

    public void setPassword(String pass){
        password = pass;
    }
    
}


// private == within class like if we create var in class ....we able to set value using 
            // function which are defined in this class 

// default == it is by-default  we can able to use in package,class
                //  not can able to use in subclass

// protected == class,package , and outside of package means in sub class

// public == class,package , subclass , and also out of package