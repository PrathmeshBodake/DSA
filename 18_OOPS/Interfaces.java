public class Interfaces {
    public static void main(String args[]){

        Queen a = new Queen();
        a.move();
        System.out.println();
        Rook b = new Rook();
        b.move();
        b.abc();
    }
}
interface Chess{
    void move(); //by default it is abstract as well as **public

    // if you want to create default..you can able to create
    // default void maove();
}
interface Hatti{
    void abc();
}
class Queen implements Chess{
   public void move(){
        System.out.println("left , right , diagonal , up , down ");
    }
}
class Rook implements Chess , Hatti{
   public void move(){
        System.out.println("left , right , up , down ");
    }
    public void abc(){
        System.out.println("In chess Two Rooks are present");
    }
}

// **in Inheritance all functions are abstract function(100%)
// all methods are public , abstract and not implementing(only declaration)
// used to acheive total abstract
// variable are public , static and final

// final = value are final not changing 
// static = when it is defined with val in class and we intialise multiple obj if in 
//  class objs val =10, change static var val in obj2 =52 , then in obj3 intialise with 52 then perform operation

// in abstact class not all functions are abstract ...some abstract , some non-abstract(0-100%)

// multiple Inheritance = Interface
// interface is blue print of class
// class is blue print of obj
