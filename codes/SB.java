public class SB {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            series = series + ch; // series += ch
        }

        System.out.println(series);
    // the performance of the above is not good as string is immutable and every time a new char is added a new object is being created and in the end we have many objects that has re reference variables pointing to.
    // here we usw a data structure called StringBuilder which allows us to modify the original string without creating a new object for every modification.
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }

        System.out.println(builder.toString());

        builder.reverse();

        System.out.println(builder);
    }
}
