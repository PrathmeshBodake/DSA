public class operators{

    public static void main(String[] args) {

        int a = 10;
        int b = ++a;
        int c = a++;

        System.out.println("the val of a is changed : "+a);
        System.out.println("the val of b is : "+b);
        System.out.println("the val of c is : "+c);
        System.out.println(a==c); //ans in boolean
    }
    
}
/*
 operators
 arithmetic (binary/unary) = + - * / % ++ --
 relational = ==,<,>,<=,>=,!=.......it is used to compare
 logical = && , || , !
 betwise
 assignment =  =,+=,-+,*=,/=
 */