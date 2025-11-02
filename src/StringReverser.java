public class StringReverser {
    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return  reversed.reverse().toString();
    }

    public static void main(String[] args) {
        String original = "Hello World";
        String result = reverseString(original);
        System.out.println(result);
    }
}