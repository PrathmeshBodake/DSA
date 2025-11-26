public class Abstraction {
    public static void main(String args[]){

        // Animal a = new Animal(); it throws error
        // a.eat();

        Tiger a = new Tiger();
        a.eat();
        a.walk();

    }
}

abstract class Animal{
    // we not able to create obj of abstract class ... but we able to create constructor
    Animal(){
        System.out.println("\nSave forest , Save Animal !\n");
    }

    void eat(){ //by default it is non-abstract
        System.out.println("Animal is eating");
    }
    abstract void walk(); // we only declared
    // we can not defined walk function because it is abstract ...we only give idea
    // for this function we create sub-classes
    // it said that in all subclasses walk function have to exist
}

class Tiger extends Animal {
    // now it is compulsory to tiger class to define walk function 
    void walk(){
        System.out.println("Tiger walk using 4 legs !");
    }
}

// it is similar to encapsulation but small difference in it

// hiding of data and show only important part to user
// abstraction work using two types
// 1.abstract class  2.interfaces
// in abstraction == we can gives idea about some code not a implementation


// abstract class 
// 1.write abstract keyword 
// after abstract we not able to create obj of this class
// in abstract class it has two types of function abstract or non-abstract 
