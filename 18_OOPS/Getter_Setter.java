public class Getter_Setter {
        
    private int i;

    // set function
    void set(int k){
        this.i = k;
        // this refers to i's obj
    }
    
    int get(){
        return this.i;
    }
    
    public static void main(String args[]){
        
        Getter_Setter a1 = new Getter_Setter();
        a1.set(50);
        System.out.println(a1.get());
       
        
    }
}
