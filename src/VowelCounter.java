public class VowelCounter {
    public static int countVowels(String input) {
        int count = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (vowels.indexOf(ch) != -1) { // check if character is a vowelk
                count++;
            }
        }
        return count;
    }

// Actual func usage
 public static void main(String[] args) {
        String text = "Hello World";
        int vowelCount = countVowels(text);
        System.out.println(countVowels(text));
 }
}
