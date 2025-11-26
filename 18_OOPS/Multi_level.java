public class Multi_level {
    public static void main(String args[]){

        Mahindra a = new Mahindra();
    }
}
class Mashine{
    Mashine(){
        System.out.println("it produces sound !");
    }
}
class Tractor extends Mashine{
    Tractor(){
        System.out.println("It is used maximum in farming");
    }
}
class Mahindra extends Tractor{
    Mahindra(){
        System.out.println("Mahindra is my favourite one ");
    }

}
