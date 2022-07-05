public class string_immutable {
    public static void main(String[] args) {
      /*  String str="GYAN"; //immutable  (can't change)
        str.concat((" prakash"));
        System.out.println(str);
      */
        String str="GYAN";
        String str2=str.concat((" Prakash"));
             //str2 is dublicate copy
        System.out.println(str2);

    }
}
