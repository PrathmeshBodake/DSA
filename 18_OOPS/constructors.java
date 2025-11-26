public class constructors {
    public static void main(String args[]){

        student s1 = new student();
        student s2 = new student("abhi" , 14);
    }
}

class student{
    String name;
    int roll_no;

    student(){
        // use this. because in time of parameter name and roll_no name = name it create ambuguity
        this.name = "prathmesh";
        this.roll_no = 10;
        System.out.print(name +" : ");
        System.out.println(roll_no);
    }
    student(String name ,int roll_no){
        this.name = name;
        this.roll_no = roll_no;
        System.out.print(name+ " : ");
        System.out.println(roll_no);
    }
}

// constructor ==special method which is invoked automatically at time of obj creation

// function which have same name as a class name
// no written type , which is called at a one time ..at a time of obj creation
// memory allocation happen when constructor is called


// their are 3 types of constructor 
// 1.non-para 2.para 3.copy

// when nos of constructor present differ by para
// when obj created it check which function was created for us it is called overloading
// also it is called polymorphism