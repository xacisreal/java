import java.util.Scanner;
public class StringBufferExample {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
StringBuffer sb = new StringBuffer("HelloWorld");
// i. Check capacity
System.out.println("Capacity of StringBuffer: " + sb.capacity());
// ii. Reverse and convert to uppercase
sb.reverse();
String reversedUpper = sb.toString().toUpperCase();
System.out.println("Reversed & Upper Case: " + reversedUpper);
// iii. Read another string and append
System.out.print("Enter another string to append: ");
String another = sc.nextLine();
String result = reversedUpper + another;
System.out.println("Final String: " + result);
}
}