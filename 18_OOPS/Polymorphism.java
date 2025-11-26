public class Polymorphism {
    public static void main(String args[]){
        Calculator a = new Calculator();
        a.sum(10,20);
        a.sum(10.23f,20.34f);

        Cow b = new Cow();
        b.eat();//it print derived's class function

    }
}
// overloding
class Calculator{
    void sum(int a, int b){
        System.out.println("Sum of integers is : "+(a+b));
    }
    void sum(float a, float b){
        System.out.println("Sum of floating points is : "+(a+b));
    }
}

// ovrriding
class Animal{
    void eat(){
        System.out.println("Parent class is eating");
    }
}
class Cow extends Animal{
    void eat(){
        System.out.println("Derived class is eating");
    }
}
// compile time Polymorphism = function overloading   ... 2 or more function with same name in same class with diff parameter

// run time Polymorphism = function overriding   ...2 or more function with same name in diff class(parent class , derived class) with same parameter