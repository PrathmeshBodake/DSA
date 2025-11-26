import java.util.*;

public class switchs {
    public static void main(String args[]){
     
        Scanner sc = new Scanner(System.in);
        System.out.println("1.burger 2.pizza 3.vada 4.faluda 5.ice-cream 6.default-tak");
        System.out.print("Enter your choice : ");
        int a = sc.nextInt();
        switch(a){
            case 1 :
                System.out.println("order the burger");
                break;
            
            case 2 :
                System.out.println("order the pizza");
                break;

            case 3 :
                System.out.println("order the vada");
                break;

            case 4 :
                System.out.println("order the faluda");
                break;

            case 5 :
                System.out.println("order the ice-cream");
                break;

            default : 
                System.out.println("default : tak is allready ordered !");
        }
    }
}
