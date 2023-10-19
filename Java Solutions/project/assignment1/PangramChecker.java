package project.assignment1;

public class PangramChecker {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(input.toLowerCase());
        System.out.println(isPangram ? "It's a pangram" : "It's not a pangram");
    }

    public static boolean isPangram(String str) {
        boolean[] isAlphabetPresent = new boolean[26];
        int index;
        for (int i = 0; i < str.length(); i++) {
            if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
                index = str.charAt(i) - 'a';
                isAlphabetPresent[index] = true;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (!isAlphabetPresent[i]) {
                return false;
            }
        }
        return true;
    }
}

