public class Hierachical {
    public static void main(String args[]){
  
        Mahindra a = new Mahindra();
        Sonalika b = new Sonalika();
    }
}
class Tractor {
    Tractor(){
        System.out.println("\nIt is used maximum in farming");
    }
}
class Mahindra extends Tractor{
    Mahindra(){
        System.out.println("Mahindra is my favourite one ");
    }

}
class Sonalika extends Tractor{
    Sonalika(){
        System.out.println("It is blue");
    }
}