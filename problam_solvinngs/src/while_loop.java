import java.util.Scanner;

public class while_loop {
        public static void main(String[] args) {
            int num;
            System.out.println("enter any number:= ");
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
            while (num >= 0) {
                if (num%2==0){
                    System.out.println("Even number");
                }
                else {
                    System.out.println("Odd number");
                }
            }
            System.out.println("while loop ended");
            }

}
