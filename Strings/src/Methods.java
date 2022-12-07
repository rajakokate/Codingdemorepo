import java.sql.SQLOutput;
import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Sweta Chopdar";
        System.out.println(Arrays.toString(name.toCharArray()));//[S,w,e,t,a, ,C,h,o,p,d,a,r]
        System.out.println(name.toLowerCase());// sweta chopdar
        System.out.println(name);//Sweta Chopdar
        System.out.println(name.indexOf('a')); //4
      /* System.out.println("    Sweta  ".strip()); // It removes the extra space

       */
        System.out.println(Arrays.toString(name.split(" ")));//[Sweta, Chopdar]
    }
}
