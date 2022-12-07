public class Comparison {
    public static void main(String[] args) {
        String a ="Sweta";
        String b ="Sweta";
        String c = a;

        System.out.println(c == a);//It will give true.

        // ==
    //    System.out.println(a == b);

        String name1 = new String("Sweta");
        String name2 = new String("Sweta");

        String name3 = new String("Sweta");
        String name4 = new String(" cbhcdvnjk");

        System.out.println(name1 == name2);// It will give false.
        System.out.println(name1.equals(name2));// It will return true as it depends upon the value not object.
        System.out.println(name3.equals(name4));// It will return false as both the values are different.

        System.out.println(name1.charAt(0));
    }
}
