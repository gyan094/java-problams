import java.util.Scanner;

public class nested_if_else {
       public static void main(String[] args) {
           int a, b, c;
           System.out.println("inter the three number:= ");
           Scanner sc = new Scanner(System.in);
           a = sc.nextInt();
           b = sc.nextInt();
           c = sc.nextInt();
           if (a > b) {
               if (a > c) {
                   System.out.println("a max number is : " + a);
               }
               else {
                   System.out.println("min number is: " + c);
               }
           }
           else {
               if (b > c) {
                   System.out.println("b max number is: " + b);
               } else {
                   System.out.println("c max number is: " + c);
               }
           }
       }

}
