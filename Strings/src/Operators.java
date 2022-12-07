import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');//a+b=195
        System.out.println("a" + "b");//ab
        System.out.println('a' + 3);//a+b+c=100
        System.out.println((char)('a' + 3));//abc

        System.out.println("a" + 1);//a1
        // this same as after a few steps:"a" +"1"
        // integer will be converted to Integer that will call toString()

        System.out.println("Sweta" + new ArrayList<Object>());//Sweta[]
        System.out.println("Sweta" + new Integer(56));// Sweta56

        String ans = new Integer(56) + "" + new ArrayList<Object>();
        System.out.println(ans);//56[]

    }
}
