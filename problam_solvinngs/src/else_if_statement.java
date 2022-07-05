import java.util.Scanner;

public class else_if_statement {
    public static void main(String[] args) {
        int pass;
        System.out.println("inter pass:= ");
        Scanner sc=new Scanner(System.in);
        pass= sc.nextInt();
        if (pass==1234)
        {
            System.out.println("open the system: ");
        }
        else if(pass==5678)
        {
            System.out.println("forget password: ");
        }
        else
        {
            System.out.println("worng passwerd: ");
        }
    }
}

