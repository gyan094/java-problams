import java.util.Scanner;

public class switch_statement {
    public static void main(String[] args) {
        int a,b,c,ch;
        System.out.println("Enter any two number:= ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Enter your choice ");
        ch = sc.nextInt();
        switch (ch) {
            case 1:
                c = a + b;
                System.out.println("add " +c);
                break;
            case 2:
                c = a - b;
                System.out.println("sub " +c);
                break;
            case 3:
                c = a * b;
                System.out.println("mul " +c);
                break;
            case 4:
                c = a / b;
                System.out.println("div " +c);
                break;
            case 5:
                c = a % b;
                System.out.println("remander " +c);
                break;
            default:
                System.out.println("envalid choice");

        }
    }
}
