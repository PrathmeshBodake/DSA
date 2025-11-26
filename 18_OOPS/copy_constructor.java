public class copy_constructor {
    public static void main(String args[]){
        Student a1 = new Student();
        a1.name = "Prathmesh";
        a1.roll = 10;
        a1.password = 12345678;
        a1.display();

        // coping properties of a1 to a2
        Student a2 = new Student(a1);
        a2.password = 1230000;
        a2.display();
    }
}

class Student{
    String name;
    int roll;
    int password;
    Student(){}
    // copy constructor
    // give argument as a obj

    // Shallow type of constructor
    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
    }
    void display(){
        System.out.println(this.name);
        System.out.println(this.roll);
        System.out.println(this.password);
    }
}

// in cpp copy constructor you can able to get by default

// but in java we need to create this one 