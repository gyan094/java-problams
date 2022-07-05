import java.io.IOException;

public class unit_digit {
        static int unit_number(int x, int y)
        {
            int res = 1;
            for (int i = 0; i < y; i++)
                res = (res * x) % 10;
            return res;
        }
        public static void main(String args[])throws IOException
        {
            System.out.println(unit_number(2343, 2347));

    }
}
