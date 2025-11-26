public class Super {
    public static void main(String args[]){

        horse s1 = new horse();
        System.out.println(s1.color);
    }
}

class animal{
    String color;
    String name;
    animal(){
        System.out.println("Animal constructor is called...");
    }
    animal(String name){
        this.name = name;
        System.out.println(this.name);
    }
    
}
class horse extends animal{
    
    // we use super for access parent's obj
    
    horse(){
        // super(); //super call to parent constructor ...if we dont write it then it call bydefault
        super("cat"); // it use to call parent constructor...
                        // but it allows only one call which can be argument constructor or without arg
        
        // color = red; // takes error
        super.color = "red"; //it take
        System.out.println("horse constructor is called...");
    }
}
// super keyword is used refer immediate parent class obj
// to access parent's function , properties , constructor
// super keyword is used access function element constructor in child's constructor
// not anywhere
