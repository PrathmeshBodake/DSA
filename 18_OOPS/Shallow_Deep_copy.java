public class Shallow_Deep_copy {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "prathmesh";
        s1.marks = new int[]{100,90,80};
        s1.display();

        Student s2 = new Student(s1);
        s2.display();


       
        
    }
}
class Student{
    String name;
    int marks[] = new int[3];

    Student(){}
    // shallow 
    // Student(Student s1){
    //     this.name = s1.name;
    //     this.marks = s1.marks;
    // }

    // deep 
    Student(Student s1){
        this.name = s1.name;
        this.marks[2] = 30;
        // not changing marks[2] it print as s1's marks ...mhanun it is a deep copy
        for(int i = 0; i<s1.marks.length ; i++){
            this.marks[i] = s1.marks[i];
        }
     
        
    }
    void display(){
        System.out.println(this.name);
        System.out.print("Marks: ");
        for (int mark : marks) {
            System.out.print(mark + " ");

        }
        System.out.println("\n");

    }
}
// Shallow == changes reflects
// Deep == changes dont reflects

// this two method gives same output but methods are different