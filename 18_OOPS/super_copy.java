public class super_copy {
    public static void main(String args[]){
        dog s1 = new dog("lab");

        System.out.println();
        dog s2 = new dog(s1);

    }
}

class animal{
    String name;
    animal(String ani){
        this.name = ani;
        System.out.println("this is parameter constructor of animal "+ani);
    }
    animal(animal a){
        this.name = a.name;
        System.out.println("this is copy constructor of animal "+this.name);
    }
}
class dog extends animal{

    // String name;
    // parameterised constructor
    dog(String dog){
        // super("xyz"); it also correct but we use another method

        super(dog);
        
        System.out.println("this is parameterised constructor of dog "+this.name);
        // this.name = animal.name

    }
    // copy constructor
    dog(dog a){
        super(a);
        // this.name = a.name;
        // a.name alredy assign to animal.name   ... then dog.name = null
        // so remove String name and this.name = animal.name
    System.out.println("this is copy constructor of dog "+this.name);

    }
}
