
public class OOPS {
    public static void main(String args[]){
        Pen p1 = new Pen(); // created pen obj
        // obj is created in heap memory
        p1.set_color("blue");
        System.out.println(p1.color);
        p1.set_tip(5);
        System.out.println(p1.tip);
        p1.set_color("yellow");
        System.out.println(p1.color);
        p1.color = "red";
        System.out.println(p1.color);
    }
    
}

class Pen{
    String color;
    int tip;

    void set_color(String new_color){
        color = new_color;
    }
    void set_tip(int new_tip){
        tip = new_tip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void cal(int phy , int chem , int maths){
        percentage = (phy + chem + maths)/3;
    }
}
