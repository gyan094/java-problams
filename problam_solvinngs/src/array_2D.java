import java.util.Arrays;
import java.util.Scanner;

public class array_2D {
    public static void main(String[] args) {
        int a[][]=new int[2][2];
        System.out.println("Enter array elements ");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.print("\n Matrix element:\n");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
