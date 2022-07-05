import java.util.Scanner;

public class array_1D {
    public static void main(String[] args) {
        //int a[]={10,20, 30, 40,50};
        //System.out.println(a[4]);
        int a[]=new int[5];
        System.out.println("Enter array elements ");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
        a[i]=sc.nextInt();
        }
        System.out.println("\n array element");
        for(int b:a)
        {
            System.out.println(" "+b);
        }
    }
}
