import java.util.Scanner;

public class do_while_loop {
    public static void main(String[] args) {
        int num;
        System.out.println("enter any number:= ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        do {
            System.out.println(num);
            ++num;
        }
        while (num<=10);
        }
}
