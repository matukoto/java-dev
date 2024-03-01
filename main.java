import java.util.*;

public class main {
  // Main method
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter a string
    System.out.print("Enter a string: ");
    String s = input.nextLine();

    // Display the sorted string
    System.out.println("The sorted string is " + sort(s));

  }

  // 0000 ~ ZZZZ までを採番する
  public static String sort(String s) {
    String zero = "0000";
    String ZZZZ = "ZZZZ";
    // 0000 ~ インクリメントする

    char[] chars = s.toCharArray();
    Arrays.sort(chars);
    return new String(chars);
  }
}
