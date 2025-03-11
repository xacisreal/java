import java.util.Scanner;
public class ArraySearch {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the number of elements in the array: ");
int size = scanner.nextInt();
int[] arr = new int[size];
System.out.println("Enter " + size + " elements:");
for (int i = 0; i < size; i++) {
arr[i] = scanner.nextInt();
}
System.out.print("Enter the element to search: ");
int key = scanner.nextInt();
boolean found = false;
for (int i = 0; i < size; i++) {
if (arr[i] == key) {
System.out.println("Element found at index: " + i);
found = true;
break;
}
}
if (!found) {
System.out.println("Element not found in the array.");
}
scanner.close();
}
}