public class Inheritance {
    public static void main(String args[]){
        
        Fish shark = new Fish();
        shark.color = "blue";
        shark.eat();
        shark.swims();
    }
}

// base class
class Animal{
    String color;
    void eat(){
        System.out.println("This is eating");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
// derived class
class Fish extends Animal{
    int fins;

    void swims(){
        System.out.println("they are swiming");
    }

}

// base class (parent class) -> child class (derived class)

// single level = 1 base 1 derived
// multi level = base -> derived ->derived
// hierarchical = base -| - derived
                     // | - derived
                     // | - derived


// hybrid = combination of all inheritance

// multiple inheritance == it is not in java ...but we can able to create it using interface
// but in cpp we can able to create it using class

