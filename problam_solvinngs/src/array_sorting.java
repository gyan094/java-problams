import java.util.Arrays;
import java.util.Scanner;

public class array_sorting {
    public static void main(String[] args) {
        int a[]=new int[5];
        System.out.println("Enter array elements ");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("\n array element");
        for(int b:a)
        {
            System.out.println(" "+b);
        }
    }
}
