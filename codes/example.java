import java.util.Arrays;
public class example {
    public static void main(String[] args) {
        String s  ="Hello";
        System.out.println(toLowerCase(s));
    }
    static String toLowerCase(String s) {
        int diff = 'a' - 'A';
        StringBuilder str = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
                str.append((char)(s.charAt(i) + diff));
            }
            else{
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}
