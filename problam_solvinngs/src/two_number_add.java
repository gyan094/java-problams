import java.util.Scanner;

public class two_number_add {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("enter any two number : ");
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=a+b;
        System.out.println("sum of two number : "+c);
    }
}
