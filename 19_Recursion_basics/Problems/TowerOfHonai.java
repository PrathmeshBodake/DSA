public class TowerOfHonai {

    public static void t_o_h(int n, String src, String helper, String dest) {

        // Base Case
        if (n == 1) {
            System.out.println("Move disk 1 from " + src + " to " + dest);
            return; // VERY IMPORTANT
        }

        // Step 1: Move n-1 disks from src → helper
        t_o_h(n - 1, src, dest, helper);

        // Step 2: Move nth disk from src → dest
        System.out.println("Move disk " + n + " from " + src + " to " + dest);

        // Step 3: Move n-1 disks from helper → dest
        t_o_h(n - 1, helper, src, dest);
    }

    public static void main(String args[]) {
        int n = 4;
        t_o_h(n, "A", "B", "C");
    } 
}
