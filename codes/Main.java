// import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Scanner;
// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    try (Scanner input = new Scanner(System.in)) {
      // System.out.println(input.nextInt());
      // System.out.println(input.next());
      System.out.println(input.nextLine());
    }
  }

// public class Demo {
//   public static void main(String[] args) {
//       System.out.println(args[0]);
//     }
// }
  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}
