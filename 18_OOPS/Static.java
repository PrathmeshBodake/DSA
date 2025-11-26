public class Static {
    public static void main(String args[]){
        a s1 = new a();
        a s2 = new a();
        a s3 = new a();
    }
}

class a{
    static int a = 10;
    int b = 10;
    a(){
        System.out.println("static : "+a++);
        System.out.println("non-static : "+b++);
    }
}
