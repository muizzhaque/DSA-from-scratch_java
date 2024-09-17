import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(5); // here () is a constructor
// even if you specify the size of the array you can add as many elements as you want.
//        list.add(67);
//        list.add(234);
//        list.add(654);
//        list.add(43);
//        list.add(654);
//        list.add(8765);

//        System.out.println(list.contains(765432));
//        System.out.println(list);
//  you can change the zeroth element to 99
//        list.set(0, 99);
//  you can also remove the index 2 element which is 654 here
//        list.remove(2);
//  you don't have to use Arrays.toString method since ArrayList has its own toString method so you can print it directly
//        System.out.println(list);
// for (int i=0;i<items.size();i++){

        // input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here
        }

        System.out.println(list);



    }
}
