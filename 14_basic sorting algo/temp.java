public class temp {
    public static void main(String args[])
    {
        String str = "adv @bbdf**gdj$fdf";
        int k = str.length();
        char new_gen[] = new char[100];
        int m = 0;
        for(int i = 0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            int j = 0;
            while (ch=='@' || ch=='*' || ch=='$') {
                i++;
                j++;
                k--;
            }
            i = i+j;
            if(m<=k){
                new_gen[m] = str.charAt(i);
            }
            m++;
        }
        for(int n = 0; n<k; n++){
            System.out.print(new_gen[n]);
        }
    }
}
