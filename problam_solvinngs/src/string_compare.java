public class string_compare {
    public static void main(String[] args) {
        String str1="GYAN";
        String str2=new String("GYAN");
        //if (str1==str2)   //onliy str1 and str2 is cheking
        if (str1.equals(str2)) //str1 and str2 value cheking

        {
            System.out.println("both are equals");
        }
        else
        {
            System.out.println("Not equals");
        }
    }
}
