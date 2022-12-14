public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < 26; i++){
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        System.out.println(builder.toString());//abc..z

        builder.deleteCharAt(0);
        System.out.println(builder);// will delete a from the beginning

        builder.reverse();
        System.out.println(builder);//zyx..a
    }
}
