public class PanagramSentence {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        String sentence2 = "leetcode";
        System.out.println(checkIfPangram(sentence));
    }
    static boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) return false;
        boolean[] seen = new boolean[26]; // Use an array to track seen letters (a-z)

        for (char c : sentence.toCharArray()) {
            int index = Character.toLowerCase(c) - 'a'; // Convert to lowercase and get index (0-25)
            if (index >= 0 && index < 26) {
                seen[index] = true; // Mark the corresponding letter as seen
            }
        }

        // Check if all characters are marked true
        for (boolean b : seen) {
            if (!b) {
                return false;
            }
        }

        return true;
    }
}
