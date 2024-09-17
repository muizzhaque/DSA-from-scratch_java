public class Comparison {
    public static void main(String[] args) {
        String a = "Muizz";
        String b = "Muizz";
        String c = a;
//        System.out.println(c == a);
        // ==
//        System.out.println(a == b);

        String name1 = new String("Muizz");
        String name2 = new String("Muizz");

        System.out.println(name1 == name2);

        System.out.println(name1.equals(name2));

    }
}
