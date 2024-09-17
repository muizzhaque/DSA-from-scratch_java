import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Muizz Ul Haque Hello World";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println("     Muizz   ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
        System.out.println(name.replace(" ", "[]"));
        String naam = "Myself2 Me1 I4 and3";
        int ans = naam.charAt(10);
        System.out.println(ans);
        System.out.println((int)(naam.charAt(10) - '0'));
        String name1 = "sadbutsadbutsad";
        System.out.println(Arrays.toString(name1.split("sad")));
        StringBuilder str = new StringBuilder();
        char[] ch = name1.toCharArray();
        String s = "3+2/2";
        System.out.println(Arrays.toString(s.split("[^+/*-]")));
        String num1 = "123";
        String num2 = "456";
        String num_ans = multiply(num1, num2);
        System.out.println(ans);
    }
    static String multiply(String num1, String num2) {
            // Calculate the lengths of the input strings
            int n1 = num1.length(), n2 = num2.length();
            
            // Array to store the products of digits
            int[] products = new int[n1 + n2];
    
            // Multiply each digit of num1 with each digit of num2
            for (int i = n1 - 1; i >= 0; i--) {
                for (int j = n2 - 1; j >= 0; j--) {
                    int d1 = num1.charAt(i) - '0';
                    int d2 = num2.charAt(j) - '0';
                    // Add the product to the corresponding position in the products array
                    products[i + j + 1] += d1 * d2;
                }
            }
            // Build the result string
        StringBuilder sb = new StringBuilder();
        for (int num : products) {
            sb.append(num);
            
        }

        // Remove leading zeros from the result
        while (sb.length() != 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        // Return "0" if the result is empty, otherwise return the result string
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
