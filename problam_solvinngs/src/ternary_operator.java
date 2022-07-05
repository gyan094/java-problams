public class ternary_operator {
    public static void main(String[] args) {
        int a=10,b=20,c=5,R;
        R =(a>b)?(a>c?a:b):(b>c?b:c);
        System.out.println(" "+R);
    }
}
