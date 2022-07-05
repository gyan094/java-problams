import java.util.Scanner;

public class codechef_3 {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        int k;
        Scanner gp = new Scanner(System.in);
        k = gp.nextInt();
        for (int i = 0; i < k; i++) {
            int x;
            x = gp.nextInt();
            if (x % 3 == 0) {
                System.out.println(" " + 0);
            } else {
                if (x % 3 == 1) {
                    System.out.println(" " + 2);
                } else {
                    System.out.println(" " + 1);
                }
            }
        }
    }
}