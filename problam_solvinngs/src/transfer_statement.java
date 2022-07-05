import java.util.Scanner;

public class transfer_statement {
    //break , continue, return
    public static void main(String[] args) {

        for (int i=1;i<=10;i++) {
            if (i == 4)
                continue;
            if (i == 9)
                break;
            System.out.println("" +i);

        }
    }
}
