import java.util.Scanner;

    public class for_loop {
        public static void main(String[] args) {
            int a,i;
            System.out.println("enter any number:= ");
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
           for (i=1;i<=10;i++){
               System.out.println(a*i);
           }
        }
}
