public class StringManipulations {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("Length of the string: " + str.length());

        System.out.println("Character at second position: " + str.charAt(1));
        System.out.println("Character at fourth position: " + str.charAt(3));

        System.out.println("Substring starting from index 6: " + str.substring(6));

        System.out.println("Substring from index 0 to 5: " + str.substring(0, 5));

        String newStr = str + " - Java Programming";
        System.out.println("Concatenated string: " + newStr);

        System.out.println("String in lowercase: " + str.toLowerCase());

        System.out.println("String in uppercase: " + str.toUpperCase());
    }
}
